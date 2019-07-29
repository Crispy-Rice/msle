package com.yuantu.po.accountpo;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;


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
    @Max(value = 10000000 ,message="金额过大")
    @DecimalMin(value="0.01", message = "金额必须大于0")
    private Double  paymentAmount;
    /**付款人
     *
     */
    private String  paymentPayer;
    /**付款账户
     *
     */
    private String  paymentAccount;
    /**付款类型 工资 奖金 租金
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
