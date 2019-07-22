package com.yuantu.po.tranpo;

import lombok.Data;

/**
 * 汽车类PO
 */
@Data
public class MsleCarPO {
    private String carId;//车辆id
    private String carNo;//车牌号
    private String carCarNo;//车辆代号（城市编号（电话号码区号南京025）+营业厅编号（000三位数字）+000三位数字
    private String carBuyTime;//购买时间
    private String carEngineNo;//引擎号
    private String carBaseplateNo;//底盘号
    private String carAge;//服役时间
    private String carImage;//图片地址
    private String carHallId;//营业厅id
    private String carStatus;//车辆使用状态


}
