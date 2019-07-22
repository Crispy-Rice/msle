package com.yuantu.service.depositoryservice.impl;

import com.yuantu.dao.depositorydao.IDepositoryDao;
import com.yuantu.dao.depositorydao.IReserveDao;
import com.yuantu.po.depositorypo.MsleGoDownEntryPO;
import com.yuantu.po.depositorypo.MsleOutBoundPO;
import com.yuantu.po.depositorypo.MsleReservePO;
import com.yuantu.po.depositorypo.MsleStorehousePO;
import com.yuantu.service.depositoryservice.IReserveService;
import com.yuantu.util.DateUtil;
import com.yuantu.util.UUID;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ReserveServiceImpl implements IReserveService {
    @Resource
    IReserveDao reserveDao;
    @Resource
    IDepositoryDao depositoryDao;
    /**
     *
     * @param goDownEntryPO
     * @return 0 入库单添加失败 1库存信息更新失败 2 入库单以及库存信息更新成功
     */
    @Override
    public int addGodownentry(MsleGoDownEntryPO goDownEntryPO) {
        goDownEntryPO.setGodownentryId(UUID.createID());
       if(!reserveDao.addGodownentry(goDownEntryPO)){
           return 0;
       }
       else{ if(!addReserve(goDownEntryPO)){
           return 1;
        }
       else{
           return 2;
        }
       }
    }


    /**
     *
     * @param outBoundPO 出库单PO类
     * @return 0 出库单添加失败 1库存信息更新失败 2 出库单以及库存信息更新成功
     */
    @Override
    public int addOutbound(MsleOutBoundPO outBoundPO) {
        outBoundPO.setOutboundId(UUID.createID());
        if(!reserveDao.addOutBound(outBoundPO)){
            return 0;
        }
        else{ if(!deleteReserve(outBoundPO)){
            return 1;
        }
        else{
            return 2;
        }
        }
    }

    public boolean addReserve(MsleGoDownEntryPO goDownEntryPO){
        String id=UUID.createID();
        return  reserveDao.addReserve(goDownEntryPO,id);
    }

    public boolean deleteReserve(MsleOutBoundPO outBoundPO){
        String outbound_ExpressNo=outBoundPO.getOutboundExpressNo();
        return  reserveDao.deleteReserve(outbound_ExpressNo);
    }

    /**
     *
     * @return 返回当前时间节点
     */
    @Override
    public String getClosure(){
        Date date=new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String closure=dateFormat.format(date);
        return closure;
    }

    /**
     * 返回从当日0点到库存盘点时间内入库的快递列表
     *
     * @return
     */
    @Override
    public List<MsleReservePO> getReserveByClosurePoint(String storehouseid) {
        String closure=this.getClosure();

        if(closure==null||closure.length()<=9){
            return null;
        }
        else {
            String beginTime = DateUtil.getBeginDay(closure);//当天开始时间

            return reserveDao.getReserveByClosurePoint(beginTime, closure,storehouseid);
        }
    }

    @Override
    public boolean updateReserve(String id, String checkStatus) {
        return reserveDao.updateReserve(id,checkStatus);
    }

    @Override
    public String checkAlertline(String storehouseid,Integer areaid) {
        MsleStorehousePO storehousePO=depositoryDao.getAlertLineById(storehouseid, areaid);
        System.out.println(storehousePO.getStorehouseAlertLine());
        Double alertline=storehousePO.getStorehouseAlertLine();
        Integer    store=storehousePO.getStorehouseStore();
        Double     dstore=store.doubleValue();
        Integer    present=reserveDao.getReserveNumByStorehouseIdAndAreaId(storehouseid, areaid);
        Double     dpresent=present.doubleValue();
        System.out.println(present);
        if((dpresent/dstore)>=alertline) {
            return "WARNING!!!";
        }
        else {
            return "NOTHING!";
        }
    }

    @Override
    public MsleGoDownEntryPO getGoDownEntryById(String id) {
       return reserveDao.getGoDownEntryById(id);
    }

    @Override
    public MsleOutBoundPO getOutBoundById(String id) {
        return  reserveDao.getOutBoundById(id);
    }

    @Override
    public List<MsleGoDownEntryPO> getGoDownEntryByListId(String godownentryGodownentryId) {
        return reserveDao.getGoDownEntryByListId(godownentryGodownentryId);
    }

    @Override
    public List<MsleOutBoundPO> getOutBoundByListId(String outboundOutboundId) {
        return reserveDao.getOutBoundByListId(outboundOutboundId);
    }

//    @Override
//    public List<MsleGoDownEntryPO> getGoDownEntryByStatus(String status) {
//        return reserveDao.getGoDownEntryByStatus(status);
//    }
//
//    @Override
//    public List<MsleOutBoundPO> getOutBoundByStatus(String status) {
//        return reserveDao.getOutBoundByStatus(status);
//    }
//
//    @Override
//    public boolean updateGoDownEntryStatus(Integer id,String status) {
//        return reserveDao.updateGoDownEntryStatus(id,status);
//    }
//
//    @Override
//    public boolean updateOutBoundStatus(Integer id,String status) {
//        return reserveDao.updateOutBoundStatus(id,status);
//    }
}
