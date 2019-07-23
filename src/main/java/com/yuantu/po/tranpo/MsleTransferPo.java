package com.yuantu.po.tranpo;

import lombok.Data;
import lombok.ToString;

/**
 * @ClassName MsleTransferPo
 * @Description //中转单PO类
 * @Author  yukun
 * @Date  2019/7/23
 * @Version  1.0
 **/
@Data
@ToString
public class MsleTransferPo {
    /**
     * 中转单记录id
     */
    private String  transferId;
    /**
     * 中转单id
     */
    private String  transferTransferId;
    /**
     * 中转中心编号
     */
    private String  transferNo;
    /**
     * 到达日期
     */
    private String  transferDate;
    /**
     * 转运方式
     */
    private String  transferShipment;
    /**
     * 汽运号，航班号等
     */
    private String  transferShipmentNo;
    /**
     * 出发地
     */
    private String  transferDeparture;
    /**
     * 目的地
     */
    private String  transferDestination;
    /**
     * 货柜号
     */
    private String  transferContainerNo;
    /**
     * 监装员
     */
    private String  transferSupervisor;
    /**
     * 订单号
     */

    private String  transferOrderId;
    /**
     * 运费
     */
    private Double  transferFee;
    /**
     * 审核状态
     */
    private String  transferStatus;

}
