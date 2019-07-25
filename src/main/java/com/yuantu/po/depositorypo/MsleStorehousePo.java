package com.yuantu.po.depositorypo;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @ClassName MslestorehousePo
 * @Description //仓库信息实体类
 * @Author  yukun
 * @Date  2019/7/23
 * @Version  1.0
 **/
@Data
@ToString
public class MsleStorehousePo {
    /**
     * 区域仓库对应id
     */
    private String  storehouseHouseAreaId;
    /**
     * 仓库id
     */
    private String  storehouseId;
    /**
     * 中转中心id
     */
    private String  storehouseCenterId;
    /**
     * 区域id
     */
    private Integer storehouseAreaId;
    /**
     * 排数量
     */
    private Integer storehouseLineNum;
    /**
     * 架数量
     */
    private Integer storehouseShelfNum;
    /**
     * 位数量
     */
    private Integer storehousePositionNum;
    /**
     * 区域名称
     */
    private String  storehouseAreaName;
    /**
     * 区域预警线
     */
    @Max(value = 1,  message="  警戒线不能大于4")
    @Min(value = 0,message = "警戒线不能小于0")
    private Double  storehouseAlertLine;
    /**
     * 区域库存
     */
    private Integer storehouseStore;
    /**
     * 旧截止点
     */
    private String  storehouseOldClourse;
    /**
     * 新截止点
     */
    private String  storehouseNewClourse;


}
