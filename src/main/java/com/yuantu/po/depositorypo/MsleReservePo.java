package com.yuantu.po.depositorypo;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @ClassName MsleReservePo
 * @Description //库存po类
 * @Author  yukun
 * @Date  2019/7/23
 * @Version  1.0
 **/
@Data
@ToString
public class MsleReservePo {
    /**
     * 库存id
     */
  private String   reserveId;
    /**
     * 仓库id
     */
  private String   reserveStorehouseId;
    /**
     * 快递编号
     */
  private String   reserveExpressNo;
    /**
     * 入库日期
     */
  private String   reserveEntryDate;
    /**
     * 目的地
     */
  private String   reserveDestination;
    /**
     *区号
     */
    @Max(value=4,message="区号不能大于4")
    @Min(value = 0,message = "区号不能小于0")
  private Integer  reserveAreaNo;
    /**
     * 排号
     */
  private Integer  reserveLineNo;
    /**
     * 架号
     */
  private Integer  reserveShelfNo;
    /**
     * 位号
     */
  private Integer  reservePositionNo;
    /**
     * 盘点状态
     */
  private String   reserveCheckStatus;
    /**
     * 审核状态
     */
  private String   reserveStatus;


}
