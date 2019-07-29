package com.yuantu.po.depositorypo;

import lombok.Data;
import lombok.ToString;
import org.apache.ibatis.annotations.Mapper;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @ClassName MslegoDownEntryPo
 * @Description //入库单PO类
 * @Author  yukun
 * @Date 19:16 2019/7/22
 * @Version  1.0
 **/
@Data
@ToString
public class MsleGoDownEntryPo {
    /**
     * 快递编号
     */
    private String  godownentryExpressNo;
    /**
     * 仓库id
     */

    private String  godownentryStorehouseId;
    /**
     * 入库单条目id
     */
    private String  godownentryId;
    /**
     * 入库单id
     */
    private String  godownentryGodownentryId;

    /**
     * 目的地
     */
    private String  godownenrtyDestination;

    /**
     * 入库日期
     */

    private String  godownenrtyEntryDate;

    /**
     * 区号
     */
    @Max(value=4,message="区号不能大于4")
    @Min(value = 0,message = "区号不能小于0")
    private Integer godownentryAreaNo;


    /**
     * 行号
     */
    private Integer godownentryLineNo;

    /**
     * 架号
     */
    private Integer godownentryShelfNo;

    /**
     * 位号
     */
    private Integer goDownEntryPositionNo;

    /**
     * 审核状态
     */
    private String  godownentryStatus;

    /**
     *中转中心id
     */
    private String  godownentryCenterId;


}
