package com.yuantu.po.depositorypo;

import lombok.Data;
import lombok.ToString;

/**
 * @ClassName MsleGoDownEntryPo
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
    private Integer godownentryPositionNo;

    /**
     * 审核状态
     */
    private String  godownentryStatus;


}
