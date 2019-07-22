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
import java.util.List;
import java.util.Random;

import static com.yuantu.util.BarcodeUtil.generateFile;

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
    public Msle_OrderPo addBookingOrder(Msle_OrderPo msle_orderPo) {
        String id="wrong";
        id= UUID.createFigureID();
        msle_orderPo.setOrderId(id);
         iOrderDao.addBookingOrder(msle_orderPo);
        return msle_orderPo;
    }

    @Override
    public Msle_OrderPo addOrder(Msle_OrderPo msle_orderPo, Msle_ConstantPo msle_constantPo) {
        String id="wrong";
        id= UUID.createFigureID();
        String msg = id;
        String path = "C:/Users/Administrator/Desktop/条形码/"+msg+".png";
        generateFile(msg, path);
        msle_orderPo.setOrderId(id);
        Msle_ConstantPo msle_constantPoResult = null;
        msle_constantPoResult=iConstantService.getConstant(msle_constantPo);
        Long constantDistance=msle_constantPo.getConstantDistance();
        Integer orderEstimatedtime;
        if ("substantial".equals(msle_orderPo.getOrderExpresstype())){
            orderEstimatedtime=msle_constantPo.getConstantTimeSubstantial();
        }else if ("standard".equals(msle_orderPo.getOrderExpresstype())){
            orderEstimatedtime=msle_constantPo.getConstantTimeStandard();
        }else{
            orderEstimatedtime=msle_constantPo.getConstantTimePosthaste();
        }
        CalculationOfCharges entity=new CalculationOfCharges();
        Double orderTotalprice=0D;
        if(msle_orderPo.getOrderCityStart().equals(msle_orderPo.getOrderCityEnd())){
            orderTotalprice=10D;
        }else{
        orderTotalprice=entity.getTotalPrice( msle_orderPo.getOrderPackagingPaperquantity()
         , msle_orderPo.getOrderPackagingWoodenquantity(),  msle_orderPo.getOrderPackagingBagquantity()
         , msle_orderPo.getOrderCargoWeight(),  constantDistance, msle_orderPo.getOrderCargoBulk()
         ,  msle_orderPo.getOrderExpresstype());
        }
        msle_orderPo.setOrderTotalprice(orderTotalprice);
        iOrderDao.addOrder(msle_orderPo);
        return msle_orderPo;
    }

    @Override
    public Msle_LogisticsPo getLogisticsInformation(String logisticsOrderId) {

        return iLogisticsDao.getLogistics(logisticsOrderId);
    }

    @Override
    public Boolean writeConsigneeInformation(Msle_LogisticsPo msle_logisticsPo) {
         iLogisticsDao.updateConsigneeInformation(msle_logisticsPo);
        return true;
    }

    @Override
    public List<Msle_OrganizationPo> getServicehallByCity(String organizationCity) {
        return iOrganizationDao.getServicehallByCity(organizationCity);
    }


    @Override
    public Msle_StaffPo getCourierByServicehall(String organizationId){
        List<Msle_StaffPo> list=iStaffDao.getStaffByServicehall(organizationId);
        Integer listSize=list.size();
        if(listSize==0){
            Msle_StaffPo msle_staffPo=new Msle_StaffPo();
            msle_staffPo.setStaffId("no body");
            return msle_staffPo;
        }else{
            Random ra =new Random();
            return list.get(ra.nextInt(listSize));
        }
    }
    @Override
    public List<Msle_OrderPo> getThePickup(String staffId){
        return iOrderDao.getThePickup( staffId);
    }

    @Override
    public  List<Msle_OrderPo> getTheDelivery(String staffId){
        return iLogisticsDao.getTheDelivery( staffId);
    }

//    public Boolean updateOrderStatus() {
//        return null;
//    }
}
