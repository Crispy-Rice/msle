package com.yuantu.controller.ordercontroller;

import com.yuantu.po.*;
import com.yuantu.serviceinterface.orderinterface.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/order")
public class OrderController {
    @Autowired
    private IOrderService iOrderService;


    @RequestMapping(value = "/addBookingOrder", method = RequestMethod.GET)
    @ResponseBody
    //添加预约订单
    public Msle_OrderPo addBookingOrder(Msle_OrderPo msle_orderPo) {
        return iOrderService.addBookingOrder(msle_orderPo);
    }


    //添加非预约订单
    @RequestMapping(value = "/addOrder", method = RequestMethod.GET)
    public Msle_OrderPo addOrder(Msle_OrderPo msle_orderPo, Msle_ConstantPo msle_constantPo) {
        return iOrderService.addOrder(msle_orderPo, msle_constantPo);
    }


    //获取物流信息
    @RequestMapping(value = "/getLogisticsInformation", method = RequestMethod.GET)

    public Msle_LogisticsPo getLogisticsInformation(String logisticsOrderId) {
        return iOrderService.getLogisticsInformation(logisticsOrderId);
    }


    //填写收件信息
    @RequestMapping(value = "/writeConsigneeInformation", method = RequestMethod.GET)
    @ResponseBody
    public Boolean writeConsigneeInformation(Msle_LogisticsPo msle_logisticsPo) {
        return iOrderService.writeConsigneeInformation(msle_logisticsPo);
    }


    //获得城市下营业厅
    @RequestMapping(value = "/getServicehallByCity", method = RequestMethod.GET)
    @ResponseBody
    List<Msle_OrganizationPo> getServicehallByCity(String organizationCity) {
        return iOrderService.getServicehallByCity(organizationCity);
    }

    //在制定营业厅下随机选取一名快递员
    @RequestMapping(value = "/getCourierByServicehall", method = RequestMethod.GET)
    @ResponseBody
    Msle_StaffPo getCourierByServicehall(String organizationId) {
        return iOrderService.getCourierByServicehall(organizationId);
    }

    //快递员根据自身id看待取件
    @RequestMapping(value = "/getThePickup", method = RequestMethod.GET)
    @ResponseBody
    List<Msle_OrderPo> getThePickup(String staffId) {
        return iOrderService.getThePickup(staffId);
    }

    //快递员根据自身id看待派件
    @RequestMapping(value = "/getTheDelivery", method = RequestMethod.GET)
    @ResponseBody
    List<Msle_OrderPo> getTheDelivery(String staffId) {
        return iOrderService.getTheDelivery(staffId);
    }

}
