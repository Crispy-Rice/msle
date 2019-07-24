package com.yuantu.po.tranpo;

import lombok.Data;
import lombok.ToString;

/**
 * @ClassName MsledispatchPo
 * @Description //TODO
 * @Author  yukun
 * @Date  2019/7/23
 * @Version  1.0
 **/

@Data
@ToString
public class MsleDispatchPo {
    /**
     * 派发记录id
     */
    private String  dispatchId;
    /**
     * 营业厅id
     */
    private String  dispatchHallId;
    /**
     * 派件单id
     */
    private String  dispatchDispatchId;
    /**
     * 快递到达日期
     */
    private String  dispatchArriveDate;
    /**
     * 订单条形码号
     */
    private String  dispatchOrderNo;
    /**
     * 快递员
     */
    private String  dispatchPostman;
    /**
     * 派件单审核状态
     */
    private String  dispatchStatus;


}
