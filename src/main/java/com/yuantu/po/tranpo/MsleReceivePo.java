package com.yuantu.po.tranpo;

import lombok.Data;
import lombok.ToString;

/**
 * @ClassName MsleReceivePo
 * @Description //接收单po类
 * @Author  yukun
 * @Date  2019/7/23
 * @Version  1.0
 **/
@Data
@ToString
public class MsleReceivePo {
    /**
     * 接收单id
     */
   private String  receiveId;
    /**
     * 中转中心id
     */
   private String  receiveCenterId;
    /**
     * 到达日期
     */
   private String  receiveArriveDate;
    /**
     * 中转单编号
     */
   private String  receiveTransferId;
    /**
     * 出发地
     */
   private String  receiveDepature;
    /**
     * 到达状态
     */
   private String  receiveArrivateState;
    /**
     * 提交状态
     */
   private String  receiveState;


}
