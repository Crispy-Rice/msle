package com.yuantu.po.depositorypo;

import lombok.Data;
import lombok.ToString;

/**
 * @ClassName MsleStorehouseStatePo
 * @Description //仓库状态po类
 * @Author  yukun
 * @Date  2019/7/23
 * @Version  1.0
 **/
@Data
@ToString
public class MsleStorehouseStatePo {
    /**
     * 仓库位置状态对应id
     */
    private String  storehouseStateId;
    /**
     * 仓库id
     */
    private String  storehouseStatsStorehouseId;
    /**
     * 区号
     */
    private Integer storehouseStateAreaNo;
    /**
     * 排号
     */
    private Integer storehouseStateLineNo;
    /**
     * 架号
     */
    private Integer storehouseStateShelfNo;
    /**
     * 位号
     */
    private Integer storehouseStatePostionNo;
    /**
     * 状态（空闲 占有）
     */
    private Integer storehouseStateState;
    /**
     * 体积
     */
    private Double  storehouseStateVolume;

}
