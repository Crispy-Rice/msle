package com.yuantu.po.depositorypo;

import lombok.Data;
import lombok.ToString;

/**
 * @ClassName MsleOutBoundPo
 * @Description //出库单PO类
 * @Author  yukun
 * @Date  2019/7/22
 * @Version  1.0
 **/
@Data
@ToString
public class MsleOutBoundPo {
    /**
     * 出库记录id
     */
    private  String  outboundId;
    /**
     * 仓库id
     */
    private  String  outboundStorehouseId;
    /**
     * 出库单id
     */
    private  String  outboundOutboundId;
    /**
     * 快递编号
     */
    private  String  outboundExpressNo;
    /**
     * 目的地
     */
    private  String  outboundDestination;
    /**
     * 出库日期
     */
    private  String  outboundOutdate;
    /**
     * 区号
     */
    private  Integer outboundAreaNo;
    /**
     * 排号
     */
    private  Integer outboundLineNo;
    /**
     * 架号
     */
    private  Integer outboundShelfNo;
    /**
     * 位号
     */
    private  Integer outboundPositionNo;
    /**
     * 审核状态
     */
    private  String  outboundStatus;


}
