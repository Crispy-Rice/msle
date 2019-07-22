package com.yuantu.po.depositorypo;

import lombok.Data;

/**
 * 仓库信息类PO
 */
@Data
public class MsleStorehousePO {
    private String  storehouseHouseAreaId;//区域仓库对应id
    private String  storehouseId;//仓库id
    private String  storehouseCenterId;//中转中心id
    private Integer storehouseAreaId;//区域id
    private Integer storehouseLineNum;//排数量
    private Integer storehouseShelfNum;//架数量
    private Integer storehousePositionNum;//位数量
    private String  storehouseAreaName;//区域名称
    private Double  storehouseAlertLine;//区域预警线
    private Integer storehouseStore;//区域库存
    private String  storehouseOldClourse;//旧截止点
    private String  storehouseNewClourse;//新截止点


}
