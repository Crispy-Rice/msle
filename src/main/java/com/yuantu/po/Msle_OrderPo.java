package com.yuantu.po;


import lombok.Data;


@Data
public class Msle_OrderPo {
    private String orderId;
    private String orderAppointmentstate;
    private String orderPicktime;
    private String orderCourierId;
    private String orderCourierTime;
    private String orderExpresstype;
    private String orderSenderName;
    private Long orderSenderPhone;
    private Long orderSenderFixphone;
    private String orderSenderUnit;
    private String orderRecipientsName;
    private Long orderRecipientsPhone;
    private Long orderRecipientsFixphone;
    private String orderRecipientsUnit;
    private Integer orderCargoNum;
    private Double orderCargoWeight;
    private Double orderCargoBulk;
    private String orderCargoKind;
    private Integer orderPackagingPaperquantity;
    private Integer orderPackagingWoodenquantity;
    private Integer orderPackagingBagquantity;
    private Double orderTotalprice;
    private Integer orderEstimatedtime;
    private String orderCityStart;
    private String orderCityEnd;
    private String orderDetailedaddressStart;
    private String orderDetailedaddressEnd;
    private String orderSenderServicehall;
    private String orderRecipientsServicehall;

}