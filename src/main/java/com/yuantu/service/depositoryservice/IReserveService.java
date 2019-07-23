package com.yuantu.service.depositoryservice;


import com.yuantu.po.depositorypo.MsleGoDownEntryPo;
import com.yuantu.po.depositorypo.MsleOutBoundPo;
import com.yuantu.po.depositorypo.MsleReservePo;

import java.util.List;

public interface IReserveService {
    int  addGodownentry(MsleGoDownEntryPo goDownEntryPo);

    int  addOutbound(MsleOutBoundPo outBoundPo);

    String getClosure();

    List<MsleReservePo> getReserveByClosurePoint(String storehouseid);

    boolean updateReserve(String id ,String checkStatus);

    String  checkAlertline(String storehouseid,Integer areaid);

    MsleGoDownEntryPo getGoDownEntryById(String id);

    MsleOutBoundPo getOutBoundById(String id);

    List<MsleGoDownEntryPo> getGoDownEntryByListId(String godownentryGodownentryId);

    List<MsleOutBoundPo> getOutBoundByListId(String outboundOutboundId);


//    List<MslegoDownEntryPo> getGoDownEntryByStatus(String status);
//
//    List<MsleOutBoundPo> getOutBoundByStatus( String status);
//    boolean updateGoDownEntryStatus(Integer id,String status);
//
//    boolean updateOutBoundStatus(Integer id,String status);
}
