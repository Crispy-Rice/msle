package com.yuantu.dao;


import com.yuantu.po.Msle_OrderPo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface IOrderDao {

    //添加一个订单记录(非预约)
    @Insert("insert into msle_order values" +
            "('${msle_orderPo.orderId}'" +
            ",'${msle_orderPo.orderAppointmentstate}'" +
            ",'${msle_orderPo.orderPicktime}'" +
            ",'${msle_orderPo.orderCourierId}'" +
            ",'${msle_orderPo.orderCourierTime}'" +
            ",'${msle_orderPo.orderExpresstype}'" +
            ",'${msle_orderPo.orderSenderName}'" +
            ",'${msle_orderPo.orderSenderPhone}'" +
            ",'${msle_orderPo.orderSenderFixphone}'" +
            ",'${msle_orderPo.orderSenderUnit}'" +
            ",'${msle_orderPo.orderRecipientsName}'" +
            ",'${msle_orderPo.orderRecipientsPhone}'" +
            ",'${msle_orderPo.orderRecipientsFixphone}'" +
            ",'${msle_orderPo.orderRecipientsUnit}'" +
            ",'${msle_orderPo.orderCargoNum}'" +
            ",'${msle_orderPo.orderCargoWeight}'" +
            ",'${msle_orderPo.orderCargoBulk}'" +
            ",'${msle_orderPo.orderCargoKind}'" +
            ",'${msle_orderPo.orderPackagingPaperquantity}'" +
            ",'${msle_orderPo.orderPackagingWoodenquantity}'" +
            ",'${msle_orderPo.orderPackagingBagquantity}'" +
            ",'${msle_orderPo.orderTotalprice}'" +
            ",'${msle_orderPo.orderEstimatedtime}'" +
            ",'${msle_orderPo.orderCityStart}'" +
            ",'${msle_orderPo.orderCityEnd}'" +
            ",'${msle_orderPo.orderDetailedaddressStart}'" +
            ",'${msle_orderPo.orderDetailedaddressEnd}'" +
            "'${msle_orderPo.orderSenderServicehall}'" +
            "'${msle_orderPo.orderRecipientsServicehall}')")
    void addOrder(@Param("msle_orderPo") Msle_OrderPo msle_orderPo);


    //添加一个订单记录(预约)
    @Insert(" insert into msle_order " +
            "(order_id,order_appointmentstate,order_Sender_Name,order_city_start" +
            ",order_sender_phone,order_detailedaddress_start,order_recipients_name" +
            ",order_city_end,order_recipients_phone,order_detailedaddress_end" +
            ",order_picktime,order_cargo_kind)" +
            " VALUES " +
            "('${msle_orderPo.orderId}','${msle_orderPo.orderCourierId}'" +
            ",'${msle_orderPo.orderAppointmentstate}','${msle_orderPo.orderSenderName}'" +
            ",'${msle_orderPo.orderCityStart}','${msle_orderPo.orderSenderPhone}'" +
            ",'${msle_orderPo.orderDetailedaddressStart}','${msle_orderPo.orderRecipientsName}'" +
            ",'${msle_orderPo.orderCityEnd}','${msle_orderPo.orderRecipientsPhone}'" +
            ",'${msle_orderPo.orderDetailedaddressEnd}','${msle_orderPo.orderPicktime}'" +
            ",'${msle_orderPo.orderCargoKind}');")
    int addBookingOrder(@Param("msle_orderPo") Msle_OrderPo msle_orderPo);



    //修改一条订单记录
    @Update("update msle_order set " +
            ",order_Appointmentstate='${msle_orderPo.orderAppointmentstate}'" +
            ",'${msle_orderPo.orderCourierId}'" +
            ",'${msle_orderPo.orderCourierTime}'" +
            ",order_Expresstype='${msle_orderPo.orderExpresstype}'" +
            ",order_Sender_Name='${msle_orderPo.orderSenderName}'" +
            ",order_Sender_Phone='${msle_orderPo.orderSenderPhone}'" +
            ",order_Sender_Fixphone='${msle_orderPo.orderSenderFixphone}'" +
            ",order_Sender_Unit='${msle_orderPo.orderSenderUnit}'" +
            ",order_Recipients_Name='${msle_orderPo.orderRecipientsName}'" +
            ",order_Recipients_Phone='${msle_orderPo.orderRecipientsPhone}'" +
            ",order_Recipients_Fixphone='${msle_orderPo.orderRecipientsFixphone}'" +
            ",order_Recipients_Unit='${msle_orderPo.orderRecipientsUnit}'" +
            ",order_Cargo_Num='${msle_orderPo.orderCargoNum}'" +
            ",order_Cargo_Weight='${msle_orderPo.orderCargoWeight}'" +
            ",order_Cargo_Bulk='${msle_orderPo.orderCargoBulk}'" +
            ",order_Cargo_Kind='${msle_orderPo.orderCargoKind}'" +
            ",order_packaging_paperquantity='${msle_orderPo.orderPackagingPaperquantity}'" +
            ",order_packaging_woodenquantity='${msle_orderPo.orderPackagingWoodenquantity}'" +
            ",order_packaging_bagquantity='${msle_orderPo.orderPackagingBagquantity}'" +
            ",order_Totalprice='${msle_orderPo.orderTotalprice}'" +
            ",order_Estimatedtime='${msle_orderPo.orderEstimatedtime}'" +
            ",order_City_Start='${msle_orderPo.orderCityStart}'" +
            ",order_City_End='${msle_orderPo.orderCityEnd}'" +
            ",order_Detailedaddress_Start='${msle_orderPo.orderDetailedaddressStart}'" +
            ",order_Detailedaddress_End='${msle_orderPo.orderDetailedaddressEnd}'"+
            ",order_sender_servicehall='${msle_orderPo.orderSenderServicehall}'"+
            ",order_recipients_servicehall='${msle_orderPo.orderRecipientsServicehall}'"+
            " where order_Id = '${msle_orderPo.OrderId}'")
    void updateOrder(@Param("msle_orderPo") Msle_OrderPo msle_orderPo);



    //查询一条订单记录
    @Select("select * from msle_order where Order_Id='${OrderId}'")
    Msle_OrderPo getOrder(@Param("OrderId") String orderId);

    //快递员根据自身id看待取件
    @Select("select * from msle_order where order_Courier_Id='${staffId}'" +
            "and order_picktime !='0/0/0' and order_courier_time='0/0/0'")
    List<Msle_OrderPo>  getThePickup(@Param("staffId") String staffId);
}
