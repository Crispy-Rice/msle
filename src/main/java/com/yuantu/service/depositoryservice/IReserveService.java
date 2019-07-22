package com.yuantu.service.depositoryservice;


import com.yuantu.po.depositorypo.MsleGoDownEntryPO;
import com.yuantu.po.depositorypo.MsleOutBoundPO;
import com.yuantu.po.depositorypo.MsleReservePO;

import java.util.List;

public interface IReserveService {
    int  addGodownentry(MsleGoDownEntryPO goDownEntryPO);

    int  addOutbound(MsleOutBoundPO outBoundPO);

    String getClosure();

    List<MsleReservePO> getReserveByClosurePoint(String storehouseid);

    boolean updateReserve(String id ,String checkStatus);

    String  checkAlertline(String storehouseid,Integer areaid);

    MsleGoDownEntryPO getGoDownEntryById(String id);

    MsleOutBoundPO getOutBoundById(String id);

    List<MsleGoDownEntryPO> getGoDownEntryByListId(String godownentryGodownentryId);

    List<MsleOutBoundPO> getOutBoundByListId(String outboundOutboundId);


//    List<MsleGoDownEntryPO> getGoDownEntryByStatus(String status);
//
//    List<MsleOutBoundPO> getOutBoundByStatus( String status);
//    boolean updateGoDownEntryStatus(Integer id,String status);
//
//    boolean updateOutBoundStatus(Integer id,String status);
}
