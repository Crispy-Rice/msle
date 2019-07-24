package com.yuantu.serviceinterface.orderinterface;

import com.yuantu.po.*;
import java.util.List;

/**
 *
 *@author tai
 *@Time
 *订单管理接口
 *
 */
public interface IOrderService {
    MsleOrderPo addBookingOrder(MsleOrderPo msleOrderPo);


    MsleOrderPo addOrder(MsleOrderPo msleOrderPo);


    MsleLogisticsPo getLogisticsInformation (String logisticsOrderId);


    Integer writeConsigneeInformation(MsleLogisticsPo msleLogisticsPo);

    List<MsleOrganizationPo> getServicehallByCity(String organizationCity);

    MsleStaffPo getCourierByServicehall(String organizationId);

    List<MsleOrderPo> getThePickup(String staffId);

    List<MsleLogisticsPo> getTheDelivery(String staffId);
}
