package com.yuantu.po.tranpo;

import lombok.Data;

/**
 * 派件单PO类
 */
@Data
public class MsleDispatchPO {
    private String  dispatchId;//派发记录id
    private String  dispatchHallId;//营业厅id
    private String  dispatchDispatchId;//派件单id
    private String  dispatchArriveDate;//快递到达日期
    private String  dispatchOrderNo;//订单条形码号
    private String  dispatchPostman;//快递员
    private String  dispatchStatus;//快递单审核状态


}
