package com.yuantu.po.tranpo;

import lombok.Data;
import lombok.ToString;

/**
 * @ClassName MsleCenterLoadPo
 * @Description //中转中心装车单po类
 * @Author  yukun
 * @Date  2019/7/23
 * @Version  1.0
 **/
@Data
@ToString
public class MsleCenterLoadPo {
    /**
     * 中转中心装车单记录id
     */
    private String  centerLoadId;
    /**
     * 中转中心id
     */
    private String  centerLoadCenterId;
    /**
     * 中转中心装车单id
     */
    private String  centerLoadLoadId;
    /**
     * 装车日期
     */
    private String  centerLoadDate;
    /**
     * 汽运编号
     */
    private String  centerLoadTranno;
    /**
     * 到达地（营业厅）
     */
    private Integer centerLoadDsetination;
    /**
     * 车辆代号
     */
    private Integer centerLoadCarNo;
    /**
     * 监装员
     */
    private String  centerLoadSupervisor;
    /**
     * 押运员
     */
    private String  centerLoadSupercargo;
    /**
     * 装车单订单条形码号（10位）
     */
    private String  centerLoadOrder;
    /**
     * 运费
     */
    private Double  centerLoadFee;
    /**
     * 装车单审核状态（草稿，提交，审批后）
     */
    private String  centerLoadStatus;

}
