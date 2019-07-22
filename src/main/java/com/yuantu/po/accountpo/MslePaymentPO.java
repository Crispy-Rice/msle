package com.yuantu.po.accountpo;

import lombok.Data;

/**
 * 付款单PO类
 */
@Data
public class MslePaymentPO {
    private String  paymentId;//付款单ID
    private String  paymentDate;//付款日期
    private Double  paymentAmount;//付款金额
    private String  paymentPayer;//付款人
    private String  paymentAccount;//付款账户
    private String  paymentType;//付款类型
    private String  paymentRemark;//备注
    private String  paymentStatus;//审核状态
    private String  paymentDeleteState;//删除状态


}
