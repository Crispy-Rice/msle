package com.yuantu.po;


import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

/**
 *
 *@author tai
 *@Time
 *订单表实体类
 *
 */
@Data
public class MsleOrderPo {
    @Size(min=12,max=12,message="id长度错误")
    private String orderId;
    /**
     *预约状态-预约处理中、非预约、预约处理完毕（appointment /notappointment /achieve）
     */
    private String orderAppointmentstate;
    /**
     *预约取件时间（非预约则为0/0/0）
     */
    private String orderPicktime;
    /**
     *取件员编号
     */
    @Size(min=12,max=12,message="id长度错误")
    private String orderCourierId;
    /**
     *实际取件时间(取预约件)
     */
    private String orderCourierTime;
    /**
     *快递运输类型-经济、标准、特快（substantial/standard/posthaste）
     */
    private String orderExpresstype;
    /**
     *寄件人姓名
     */
    @Length(min=2, max=20,message="姓名长度有误")
    private String orderSenderName;
    /**
     *寄件人电话
     */
    @Max(value=11,message="电话长度过长")
    @Min(value=11,message="电话长度过短")
    private Long orderSenderPhone;
    /**
     *寄件人固话
     */
    @Max(value=8,message="电话长度过长")
    @Min(value=8,message="电话长度过短")
    private Long orderSenderFixphone;
    /**
     *寄件人单位
     */
    private String orderSenderUnit;
    /**
     *收件人姓名
     */
    @Length(min=2, max=20,message="姓名长度有误")
    private String orderRecipientsName;
    /**
     *收件人电话
     */
    @Max(value=11,message="电话长度过长")
    @Min(value=11,message="电话长度过短")
    private Long orderRecipientsPhone;
    /**
     *收件人固话
     */
    @Max(value=8,message="电话长度过长")
    @Min(value=8,message="电话长度过短")
    private Long orderRecipientsFixphone;
    /**
     *收件人单位
     */
    private String orderRecipientsUnit;
    /**
     *快递数量
     */
    @Min(value=1,message="快递数量不允许少于1")
    private Integer orderCargoNum;
    /**
     *快递重量 千克
     */
    @DecimalMin(value = "0",message = "快递重量必须大于零")
    private Double orderCargoWeight;
    /**
     *货物体积 立方米
     */
    @DecimalMin(value = "0",message = "货物体积必须大于零")
    private Double orderCargoBulk;
    /**
     *内件品名
     */
    private String orderCargoKind;
    /**
     *所用纸箱数量
     */
    private Integer orderPackagingPaperquantity;
    /**
     *所用木箱数量
     */
    private Integer orderPackagingWoodenquantity;
    /**
     *所用快递袋数量
     */
    private Integer orderPackagingBagquantity;
    /**
     *快递总价
     */
    private Double orderTotalprice;
    /**
     *预估天数
     */
    private Integer orderEstimatedtime;
    /**
     *起始城市
     */
    private String orderCityStart;
    /**
     *终点城市
     */
    private String orderCityEnd;
    /**
     *起始具体地址
     */
    private String orderDetailedaddressStart;
    /**
     *终点具体地址
     */
    private String orderDetailedaddressEnd;
    /**
     *起始城市营业厅
     */
    @Size(min=12,max=12,message="id长度错误")
    private String orderSenderServicehall;
    /**
     *终点城市营业厅
     */
    @Size(min=12,max=12,message="id长度错误")
    private String orderRecipientsServicehall;

}