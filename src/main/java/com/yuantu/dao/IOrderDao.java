package com.yuantu.dao;


import com.yuantu.po.MsleOrderPo;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 *
 *@author tai
 *@Time
 *订单表数据库操作
 *
 */
@Mapper
public interface IOrderDao {

    //添加一个订单记录(非预约)
    @Insert("insert into msle_order values" +
            "('${msleOrderPo.orderId}'" +
            ",'${msleOrderPo.orderAppointmentstate}'" +
            ",'${msleOrderPo.orderPicktime}'" +
            ",'${msleOrderPo.orderCourierId}'" +
            ",'${msleOrderPo.orderCourierTime}'" +
            ",'${msleOrderPo.orderExpresstype}'" +
            ",'${msleOrderPo.orderSenderName}'" +
            ",'${msleOrderPo.orderSenderPhone}'" +
            ",'${msleOrderPo.orderSenderFixphone}'" +
            ",'${msleOrderPo.orderSenderUnit}'" +
            ",'${msleOrderPo.orderRecipientsName}'" +
            ",'${msleOrderPo.orderRecipientsPhone}'" +
            ",'${msleOrderPo.orderRecipientsFixphone}'" +
            ",'${msleOrderPo.orderRecipientsUnit}'" +
            ",'${msleOrderPo.orderCargoNum}'" +
            ",'${msleOrderPo.orderCargoWeight}'" +
            ",'${msleOrderPo.orderCargoBulk}'" +
            ",'${msleOrderPo.orderCargoKind}'" +
            ",'${msleOrderPo.orderPackagingPaperquantity}'" +
            ",'${msleOrderPo.orderPackagingWoodenquantity}'" +
            ",'${msleOrderPo.orderPackagingBagquantity}'" +
            ",'${msleOrderPo.orderTotalprice}'" +
            ",'${msleOrderPo.orderEstimatedtime}'" +
            ",'${msleOrderPo.orderCityStart}'" +
            ",'${msleOrderPo.orderCityEnd}'" +
            ",'${msleOrderPo.orderDetailedaddressStart}'" +
            ",'${msleOrderPo.orderDetailedaddressEnd}'" +
            ",'${msleOrderPo.orderSenderServicehall}'" +
            ",'${msleOrderPo.orderRecipientsServicehall}')")
    Integer addOrder(@Param("msleOrderPo") MsleOrderPo msleOrderPo);


    //添加一个订单记录(预约)
    @Insert(" insert into msle_order " +
            "(order_id,order_courier_id,order_appointmentstate,order_Sender_Name,order_city_start" +
            ",order_sender_phone,order_detailedaddress_start,order_recipients_name" +
            ",order_city_end,order_recipients_phone,order_detailedaddress_end" +
            ",order_picktime,order_cargo_kind)" +
            " VALUES " +
            "('${msleOrderPo.orderId}','${msleOrderPo.orderCourierId}'" +
            ",'${msleOrderPo.orderAppointmentstate}','${msleOrderPo.orderSenderName}'" +
            ",'${msleOrderPo.orderCityStart}','${msleOrderPo.orderSenderPhone}'" +
            ",'${msleOrderPo.orderDetailedaddressStart}','${msleOrderPo.orderRecipientsName}'" +
            ",'${msleOrderPo.orderCityEnd}','${msleOrderPo.orderRecipientsPhone}'" +
            ",'${msleOrderPo.orderDetailedaddressEnd}','${msleOrderPo.orderPicktime}'" +
            ",'${msleOrderPo.orderCargoKind}');")
    Integer addBookingOrder(@Param("msleOrderPo") MsleOrderPo msleOrderPo);



    //修改一条订单记录
    @Update("update msle_order set " +
            ",order_Appointmentstate='${msleOrderPo.orderAppointmentstate}'" +
            ",order_courier_id='${msleOrderPo.orderCourierId}'" +
            ",order_courier_time='${msleOrderPo.orderCourierTime}'" +
            ",order_Expresstype='${msleOrderPo.orderExpresstype}'" +
            ",order_Sender_Name='${msleOrderPo.orderSenderName}'" +
            ",order_Sender_Phone='${msleOrderPo.orderSenderPhone}'" +
            ",order_Sender_Fixphone='${msleOrderPo.orderSenderFixphone}'" +
            ",order_Sender_Unit='${msleOrderPo.orderSenderUnit}'" +
            ",order_Recipients_Name='${msleOrderPo.orderRecipientsName}'" +
            ",order_Recipients_Phone='${msleOrderPo.orderRecipientsPhone}'" +
            ",order_Recipients_Fixphone='${msleOrderPo.orderRecipientsFixphone}'" +
            ",order_Recipients_Unit='${msleOrderPo.orderRecipientsUnit}'" +
            ",order_Cargo_Num='${msleOrderPo.orderCargoNum}'" +
            ",order_Cargo_Weight='${msleOrderPo.orderCargoWeight}'" +
            ",order_Cargo_Bulk='${msleOrderPo.orderCargoBulk}'" +
            ",order_Cargo_Kind='${msleOrderPo.orderCargoKind}'" +
            ",order_packaging_paperquantity='${msleOrderPo.orderPackagingPaperquantity}'" +
            ",order_packaging_woodenquantity='${msleOrderPo.orderPackagingWoodenquantity}'" +
            ",order_packaging_bagquantity='${msleOrderPo.orderPackagingBagquantity}'" +
            ",order_Totalprice='${msleOrderPo.orderTotalprice}'" +
            ",order_Estimatedtime='${msleOrderPo.orderEstimatedtime}'" +
            ",order_City_Start='${msleOrderPo.orderCityStart}'" +
            ",order_City_End='${msleOrderPo.orderCityEnd}'" +
            ",order_Detailedaddress_Start='${msleOrderPo.orderDetailedaddressStart}'" +
            ",order_Detailedaddress_End='${msleOrderPo.orderDetailedaddressEnd}'"+
            ",order_sender_servicehall='${msleOrderPo.orderSenderServicehall}'"+
            ",order_recipients_servicehall='${msleOrderPo.orderRecipientsServicehall}'"+
            " where order_Id = '${msleOrderPo.OrderId}'")
    Integer updateOrder(@Param("msleOrderPo") MsleOrderPo msleOrderPo);



    //查询一条订单记录
    @Select("select * from msle_order where Order_Id='${OrderId}'")
    MsleOrderPo getOrder(@Param("OrderId") String orderId);

    //快递员根据自身id看待取件
    @Select("select * from msle_order where order_Courier_Id='${staffId}'" +
            "and order_picktime !='0/0/0' and order_appointmentstate='appointment'")
    List<MsleOrderPo>  getThePickup(@Param("staffId") String staffId);
}
