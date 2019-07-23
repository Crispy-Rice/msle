package com.yuantu.dao;

import com.yuantu.po.MsleConstantPo;
import com.yuantu.po.MsleLogisticsPo;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 *
 *@author tai
 *@Time
 *物流表数据库操作
 *
 */
@Mapper
public interface ILogisticsDao {

    /**
     * 获取一条物流记录
     * @param logisticsId 物流单号
     * @return 一条物流记录
     */
    @Select("select * from msle_logistics where logistics_id = '${logisticsId}'")
    MsleLogisticsPo getLogistics(@Param("logisticsId") String logisticsId);

    /**
     * 修改一条物流记录
     * @param msleLogisticsPo set了所有属性的物流表实体类
     */
    @Update("update msle_logistics set " +
            "logistics_orderId='${msleLogisticsPo.logisticsOrderId}'" +
            ",logistics_Sender='${msleLogisticsPo.logisticsSender}'" +
            ",logistics_Sender_Servicehall='${msleLogisticsPo.logisticsSenderServicehall}'" +
            ",logistics_Sender_Intermediate='${msleLogisticsPo.logisticsSenderIntermediate}'" +
            ",logistics_Recipients_Servicehall='${msleLogisticsPo.logisticsRecipientsServicehall}'" +
            ",logistics_Recipients_Intermediate='${msleLogisticsPo.logisticsRecipientsIntermediate}'" +
            ",logistics_Recipients='${msleLogisticsPo.logisticsRecipients}'" +
            " where staffId = '${staffId}'")
    Integer updateLogistics(@Param("msleLogisticsPo") MsleLogisticsPo msleLogisticsPo);

    /**
     * 快递员根据自身id看待派件
     * @param logisticsCourierId 快递员id
     * @return 快递员所需派件的物流单集合
     */
    @Select("select * from msle_logistics " +
            "where logistics_courier_id = '${logistics_courier_id}'" +
            "and logistics_recipientstime = 'null'")
    List<MsleLogisticsPo> getTheDelivery(@Param("logistics_courier_id") String logisticsCourierId);

    /**
     * 收件信息录入
     * @param msleLogisticsPo  set了收件人、收件时间和订单号的物流表
     */
    @Update("update msle_logistics set " +
            "logistics_Recipients='${msleLogisticsPo.logisticsRecipients}'" +
            ",logistics_Recipientstime='${msleLogisticsPo.logisticsRecipientstime}'" +
            " where logistics_orderid = '${msleLogisticsPo.logisticsOrderid}'")
    Integer updateConsigneeInformation(@Param("msleLogisticsPo") MsleLogisticsPo msleLogisticsPo);

    /**
     * 添加一条物流记录
     * @param msleLogisticsPo set了所有属性的物流表
     */
    @Insert("insert into msle_logistics values" +
            "('${msleLogisticsPo.constantId}'" +
            ",'${msleLogisticsPo.logisticsOrderId}'" +
            ",'${msleLogisticsPo.logisticsSender}'" +
            ",'${msleLogisticsPo.logisticsSenderServicehall}'" +
            ",'${msleLogisticsPo.logisticsSenderIntermediate}'" +
            ",'${msleLogisticsPo.logisticsRecipientsServicehall}'" +
            ",'${msleLogisticsPo.logisticsRecipientsIntermediate}'" +
            ",'${msleLogisticsPo.logisticsRecipients})'")
    Integer addLogistics(@Param("msleLogisticsPo") MsleLogisticsPo msleLogisticsPo);

    /**
     * 根据起始城市和终点城市查看所有物流记录
     * @param msleConstantPo set了起始和终点城市的常量实体类
     * @return
     */
    @Select( "select * from msle_logistics where logistics_orderid" +
            "=ANY(select orderId from msle_order " +
            "where order_City_Start ='${msleConstantPo.constantCityStart}'" +
            "and order_City_End ='${msleConstantPo.constantCityEnd}')")
    List<MsleLogisticsPo> getLogisticsByCity(@Param("msleConstantPo") MsleConstantPo msleConstantPo);




}
