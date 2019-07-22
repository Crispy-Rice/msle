package com.yuantu.po.accountpo;

import lombok.Data;
import lombok.ToString;


/**
 * @ClassName MslePaymentPo
 * @Description //付款单po类
 * @Author  yukun
 * @Date 19:02 2019/7/22
 * @Version  1.0
 **/
@Data
@ToString
public class MslePaymentPo {
    /**付款单ID
     *
     */
    private String  paymentId;
    /**付款日期
     *
     */
    private String  paymentDate;
    /**付款金额
     *
     */
    private Double  paymentAmount;
    /**付款人
     *
     */
    private String  paymentPayer;
    /**付款账户
     *
     */
    private String  paymentAccount;
    /**付款类型
     *
     */
    private String  paymentType;
    /**备注
     *
     */
    private String  paymentRemark;
    /**审核状态
     *
     */
    private String  paymentStatus;
    /**
     * 删除状态
     */
    private String  paymentDeleteState;


}
