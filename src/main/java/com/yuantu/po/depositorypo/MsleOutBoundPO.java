package com.yuantu.po.depositorypo;

import lombok.Data;

/**
 * 出库单PO类
 */
@Data
public class MsleOutBoundPO {

    private  String  outboundId;//出库记录id
    private  String  outboundStorehouseId;//仓库id
    private  String  outboundOutboundId;//出库单id
    private  String  outboundExpressNo;//快递编号
    private  String  outboundDestination;//目的地
    private  String  outboundOutdate;//出库日期
    private  Integer outboundAreaNo;//区号
    private  Integer outboundLineNo;//排号
    private  Integer outboundShelfNo;//架号
    private  Integer outboundPositionNo;//位号
    private  String  outboundStatus;//审核状态


}
