package com.yuantu.po.depositorypo;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

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
    @Max(value=4,message="区号不能大于4")
    @Min(value = 0,message = "区号不能小于0")
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
    private  Integer outBoundPositionNo;
    /**
     * 审核状态
     */
    private  String  outboundStatus;


}
