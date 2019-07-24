package com.yuantu.po.tranpo;

import lombok.Data;
import lombok.ToString;

/**
 * @ClassName MslecarPo
 * @Description //汽车类po
 * @Author  yukun
 * @Date  2019/7/23
 * @Version  1.0
 **/
@Data
@ToString
public class MsleCarPo {
    /**
     * 车辆id
     */
    private String carId;
    /**
     * 车牌号
     */
    private String carNo;
    /**
     * /车辆代号（城市编号（电话号码区号南京025）+营业厅编号（000三位数字）+000三位数字
     */
    private String carCarNo;
    /**
     * 购买时间
     */
    private String carBuyTime;
    /**
     * 引擎号
     */
    private String carEngineNo;
    /**
     * 底盘号
     */
    private String carBaseplateNo;
    /**
     * 服役时间
     */
    private String carAge;
    /**
     * 图片地址
     */
    private String carImage;
    /**
     * 图片地址
     */
    private String carHallId;
    /**
     * 车辆使用状态
     */
    private String carStatus;


}
