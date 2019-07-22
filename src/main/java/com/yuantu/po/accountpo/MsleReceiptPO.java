package com.yuantu.po.accountpo;

import lombok.Data;

/**
 * 付款单po类
 */
@Data
public class MsleReceiptPO {
   private String  receiptId;//收款单条目id
   private String  receiptNo;//收款单id
   private String  receiptDate;//收款日期
   private String  receiptHall;//收款机构
   private String  receiptPostman;//收款快递员
   private Double  receiptCollections;//收款金额
   private String  receiptStatus;//审核状态
   private String  receiptOrderId;//快递单编号
   private String  receiptAccountName;//账户名字
   private String  receiptDeleteState;//账户删除状态


}
