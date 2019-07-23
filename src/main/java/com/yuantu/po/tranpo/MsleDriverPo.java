package com.yuantu.po.tranpo;


import lombok.Data;
import lombok.ToString;

/**
 * @ClassName MsleDriverPo
 * @Description //司机po类
 * @Author  yukun
 * @Date  2019/7/23
 * @Version  1.0
 **/
@Data
@ToString
public class MsleDriverPo {
    /**
     * 司机id
     */
   private String  driverId;
    /**
     * 司机编号
     */
   private String  driverNo;
    /**
     * 姓名
     */
   private String  driverName;
    /**
     * 生日
     */
   private String  driverBirthdate;
    /**
     * 身份证号
     */
   private String  driverIdNum;
    /**
     * 手机号
     */
   private String  driverPhone;
    /**
     * 车辆单位
     */
   private String  driverCarUnit;
    /**
     * 性别
     */
   private String  driverSex;
    /**
     * 行驶证期限
     */
   private String  driverDue;
    /**
     * 营业厅id
     */
   private String  driverHallId;
    /**
     * 空闲状态
     */
   private String  driverStatus;

}
