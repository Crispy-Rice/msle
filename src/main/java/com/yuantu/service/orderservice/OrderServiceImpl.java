package com.yuantu.service.orderservice;

import com.yuantu.dao.ILogisticsDao;
import com.yuantu.dao.IOrderDao;
import com.yuantu.dao.IOrganizationDao;
import com.yuantu.dao.IStaffDao;
import com.yuantu.po.*;
import com.yuantu.serviceinterface.constantinterface.IConstantService;
import com.yuantu.serviceinterface.orderinterface.IOrderService;
import com.yuantu.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.yuantu.util.BarcodeUtil.generateFile;

/**
 *
 *@author tai
 *@Time
 *订单管理接口是实现类
 *
 */
@Service
public class OrderServiceImpl implements IOrderService
{
    @Resource
    private IOrderDao iOrderDao;
    @Resource
    private ILogisticsDao iLogisticsDao;
    @Autowired
    private IConstantService iConstantService;
    @Resource
    private IOrganizationDao iOrganizationDao;
    @Resource
    private IStaffDao iStaffDao;

    @Override
    public MsleOrderPo addBookingOrder(MsleOrderPo msleOrderPo) {
        String id=UUID.createFigureid();
        msleOrderPo.setOrderId(id);
        iOrderDao.addBookingOrder(msleOrderPo);
        return msleOrderPo;
    }

    /**
     * id不适用自增，通过uuid生成
     * 预估时间是用订单中的起始终点城市和快递方式在常量表中进行查询
     * @param msleOrderPo
     * @return
     */
    @Override
    public MsleOrderPo addOrder(MsleOrderPo msleOrderPo) {
        String id="wrong";
        id= UUID.createFigureid();
        String msg = id;
        String path = "C:/Users/Administrator/Desktop/条形码/"+msg+".png";
        generateFile(msg, path);
        msleOrderPo.setOrderId(id);

        MsleConstantPo msleConstantPoResult = new MsleConstantPo();
        MsleConstantPo msleConstantPo=new MsleConstantPo();
        msleConstantPo.setConstantCityStart(msleOrderPo.getOrderCityStart());
        msleConstantPo.setConstantCityEnd(msleOrderPo.getOrderCityEnd());
        msleConstantPoResult=iConstantService.getConstant(msleConstantPo);
        Long constantDistance=msleConstantPoResult.getConstantDistance();

        Integer orderEstimatedtime;
        List<String>  expresstype=new ArrayList<String>();
        expresstype.set(1,"substantial");
        expresstype.set(2,"standard");
        expresstype.set(3,"posthaste");
        if (expresstype.get(1).equals(msleOrderPo.getOrderExpresstype())){
            orderEstimatedtime=msleConstantPoResult.getConstantTimeSubstantial();
        }else if (expresstype.get(2).equals(msleOrderPo.getOrderExpresstype())){
            orderEstimatedtime=msleConstantPoResult.getConstantTimeStandard();
        }else{
            orderEstimatedtime=msleConstantPoResult.getConstantTimePosthaste();
        }
        CalculationOfCharges entity=new CalculationOfCharges();
        Double orderTotalprice=0D;
        if(msleOrderPo.getOrderCityStart().equals(msleOrderPo.getOrderCityEnd())){
            orderTotalprice=10D;
        }else{
            orderTotalprice=entity.getTotalPrice( msleOrderPo.getOrderPackagingPaperquantity()
                    , msleOrderPo.getOrderPackagingWoodenquantity(),  msleOrderPo.getOrderPackagingBagquantity()
                    , msleOrderPo.getOrderCargoWeight(),  constantDistance, msleOrderPo.getOrderCargoBulk()
                    ,  msleOrderPo.getOrderExpresstype());
        }
        msleOrderPo.setOrderTotalprice(orderTotalprice);
        iOrderDao.addOrder(msleOrderPo);
        return msleOrderPo;
    }

    @Override
    public MsleLogisticsPo getLogisticsInformation(String logisticsOrderId) {
        MsleLogisticsPo msleLogisticsPoView=new MsleLogisticsPo();

        return iLogisticsDao.getLogistics(logisticsOrderId);
    }

    @Override
    public Integer writeConsigneeInformation(MsleLogisticsPo msleLogisticsPo) {
        return iLogisticsDao.updateConsigneeInformation(msleLogisticsPo);
    }

    @Override
    public List<MsleOrganizationPo> getServicehallByCity(String organizationCity) {
        return iOrganizationDao.getServicehallByCity(organizationCity);
    }

    /**
     * 在获取营业厅下员工时要排除营业厅下无人情况
     * @param organizationId
     * @return
     */
    @Override
    public MsleStaffPo getCourierByServicehall(String organizationId){
        List<MsleStaffPo> list=iStaffDao.getStaffByServicehall(organizationId);
        Integer listSize=list.size();
        if(listSize==0){
            MsleStaffPo msleStaffPo=new MsleStaffPo();
            msleStaffPo.setStaffId("no body");
            return msleStaffPo;
        }else{
            Random ra =new Random();
            return list.get(ra.nextInt(listSize));
        }
    }

    @Override
    public List<MsleOrderPo> getThePickup(String staffId){
        return iOrderDao.getThePickup( staffId);
    }

    @Override
    public  List<MsleLogisticsPo> getTheDelivery(String staffId){
        return iLogisticsDao.getTheDelivery( staffId);
    }
}
