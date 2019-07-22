package com.yuantu.serviceinterface.orderinterface;

import com.yuantu.po.*;

import java.util.List;

public interface IOrderService {
    Msle_OrderPo addBookingOrder(Msle_OrderPo msle_orderPo);


    Msle_OrderPo addOrder(Msle_OrderPo msle_orderPo, Msle_ConstantPo msle_constantPo);


    Msle_LogisticsPo getLogisticsInformation(String logisticsOrderId);


    Boolean writeConsigneeInformation(Msle_LogisticsPo msle_logisticsPo);
    //Boolean updateOrderStatus();

    List<Msle_OrganizationPo> getServicehallByCity(String organizationCity);

    Msle_StaffPo getCourierByServicehall(String organizationId);

    List<Msle_OrderPo> getThePickup(String staffId);

    List<Msle_OrderPo> getTheDelivery(String staffId);
}
