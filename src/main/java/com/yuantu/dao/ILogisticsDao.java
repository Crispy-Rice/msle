package com.yuantu.dao;

import com.yuantu.po.Msle_ConstantPo;
import com.yuantu.po.Msle_LogisticsPo;
import com.yuantu.po.Msle_OrderPo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ILogisticsDao {

    //查看一条物流记录
    @Select("select * from msle_logistics where logistics_Id = '${logisticsId}'")
    Msle_LogisticsPo getLogistics(@Param("logisticsId") String logisticsId);


    //修改一条物流记录
    @Update("update msle_logistics set " +
            "logistics_orderId='${msle_logisticsPo.logisticsOrderId}'" +
            ",logistics_Sender='${msle_logisticsPo.logisticsSender}'" +
            ",logistics_Sender_Servicehall='${msle_logisticsPo.logisticsSenderServicehall}'" +
            ",logistics_Sender_Intermediate='${msle_logisticsPo.logisticsSenderIntermediate}'" +
            ",logistics_Recipients_Servicehall='${msle_logisticsPo.logisticsRecipientsServicehall}'" +
            ",logistics_Recipients_Intermediate='${msle_logisticsPo.logisticsRecipientsIntermediate}'" +
            ",logistics_Recipients='${msle_logisticsPo.logisticsRecipients}'" +
            " where staff_Id = '${staffId}'")
    void updateLogistics(@Param("msle_logisticsPo") Msle_LogisticsPo msle_logisticsPo);


    ////快递员根据自身id看待派件
    @Select("select * from msle_logistics " +
            "where logistics_courier_id = '${logistics_courier_id}" +
            "and logistics_recipientstime is null'")
    List<Msle_OrderPo> getTheDelivery(@Param("logistics_courier_id") String logisticsCourierId);


    //收件信息录入
    @Update("update msle_logistics set " +
            "logistics_Recipients='${msle_logisticsPo.logisticsRecipients}'" +
            ",logistics_Recipientstime='${msle_logisticsPo.logisticsRecipientstime}'" +
            " where logistics_orderId = '${msle_logisticsPo.logisticsOrderId}'")
    void updateConsigneeInformation(
            @Param("msle_logisticsPo") Msle_LogisticsPo msle_logisticsPo);


    //添加一个物流记录
    @Insert("insert into msle_logistics values" +
            "(0" +
            ",'${msle_logisticsPo.logisticsOrderId}'" +
            ",'${msle_logisticsPo.logisticsSender}'" +
            ",'${msle_logisticsPo.logisticsSenderServicehall}'" +
            ",'${msle_logisticsPo.logisticsSenderIntermediate}'" +
            ",'${msle_logisticsPo.logisticsRecipientsServicehall}'" +
            ",'${msle_logisticsPo.logisticsRecipientsIntermediate}'" +
            ",'${msle_logisticsPo.logisticsRecipients})'")
    void addLogistics(@Param("msle_logisticsPo") Msle_LogisticsPo msle_logisticsPo);


    //根据起始和开始城市查看物流信息
    @Select( "select * from msle_logistics where logistics_orderid" +
            "=ANY(select orderId from msle_order " +
            "where order_City_Start ='${msle_constantPo.constantCityStart}'" +
            "and order_City_End ='${msle_constantPo.constantCityEnd}')")
    List<Msle_LogisticsPo> getLogisticsByCity(
            @Param("msle_constantPo") Msle_ConstantPo msle_constantPo);




}
