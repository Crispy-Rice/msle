package com.yuantu.service.depositoryservice.impl;

import com.yuantu.dao.depositorydao.IDepositoryDao;
import com.yuantu.dao.depositorydao.IReserveDao;
import com.yuantu.po.depositorypo.MsleGoDownEntryPo;
import com.yuantu.po.depositorypo.MsleOutBoundPo;
import com.yuantu.po.depositorypo.MsleReservePo;

import com.yuantu.po.depositorypo.MsleStorehousePo;
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
     * @param goDownEntryPo
     * @return 0 入库单添加失败 1库存信息更新失败 2 入库单以及库存信息更新成功
     */
    @Override
    public int addGodownentry(MsleGoDownEntryPo goDownEntryPo) {
        goDownEntryPo.setGodownentryId(UUID.creatId());
       if(!reserveDao.addGodownentry(goDownEntryPo)){
           return 0;
       }
       else{ if(!addReserve(goDownEntryPo)){
           return 1;
        }
       else{
           return 2;
        }
       }
    }


    /**
     *
     * @param outBoundPo 出库单PO类
     * @return 0 出库单添加失败 1库存信息更新失败 2 出库单以及库存信息更新成功
     */
    @Override
    public int addOutbound(MsleOutBoundPo outBoundPo) {
        outBoundPo.setOutboundId(UUID.creatId());
        if(!reserveDao.addOutBound(outBoundPo)){
            return 0;
        }
        else{ if(!deleteReserve(outBoundPo)){
            return 1;
        }
        else{
            return 2;
        }
        }
    }

    public boolean addReserve(MsleGoDownEntryPo goDownEntryPo){
        String id=UUID.creatId();
        return  reserveDao.addReserve(goDownEntryPo,id);
    }

    public boolean deleteReserve(MsleOutBoundPo outBoundPo){
        String outboundExpressNo=outBoundPo.getOutboundExpressNo();
        return  reserveDao.deleteReserve(outboundExpressNo);
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
    public List<MsleReservePo> getReserveByClosurePoint(String storehouseid) {
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
        MsleStorehousePo storehousePo=depositoryDao.getAlertLineById(storehouseid, areaid);
        System.out.println(storehousePo.getStorehouseAlertLine());
        Double alertline=storehousePo.getStorehouseAlertLine();
        Integer    store=storehousePo.getStorehouseStore();
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
    public MsleGoDownEntryPo getGoDownEntryById(String id) {
       return reserveDao.getGoDownEntryById(id);
    }

    @Override
    public MsleOutBoundPo getOutBoundById(String id) {
        return  reserveDao.getOutBoundById(id);
    }

    @Override
    public List<MsleGoDownEntryPo> getGoDownEntryByListId(String godownentryGodownentryId) {
        return reserveDao.getGoDownEntryByListId(godownentryGodownentryId);
    }

    @Override
    public List<MsleOutBoundPo> getOutBoundByListId(String outboundOutboundId) {
        return reserveDao.getOutBoundByListId(outboundOutboundId);
    }

//    @Override
//    public List<MslegoDownEntryPo> getGoDownEntryByStatus(String status) {
//        return reserveDao.getGoDownEntryByStatus(status);
//    }
//
//    @Override
//    public List<MsleOutBoundPo> getOutBoundByStatus(String status) {
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
