package com.yuantu.po.accountpo;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Past;

/**
 * @ClassName MsleReceiptPo
 * @Description 收款单po类
 * @Author  yukun
 * @Date 19:07 2019/7/22
 * @Version  1.0
 **/
@Data
@ToString
public class MsleReceiptPo {
    /**收款单条目id
     *
     */
    private String  receiptId;
    /**收款单id
     *
     */

    private String  receiptNo;
    /**收款日期
     *
     */
    private String  receiptDate;
    /**收款机构
     *
     */
    private String  receiptHall;
    /**收款快递员
     *
     */

    private String  receiptPostman;
    /**收款金额
     *
     */
    @Max(value = 10000000 ,message="金额过大")
    @DecimalMin(value="0.01", message = "金额必须大于0")
    private Double  receiptCollections;
    /**审核状态
     *
     */
    private String  receiptStatus;
    /**快递单编号
     *
     */
    private String  receiptOrderId;
    /**账户名字
     *
     */
    private String  receiptAccountName;
    /**账户删除状态
     *
     */
    private String  receiptDeleteState;



}
