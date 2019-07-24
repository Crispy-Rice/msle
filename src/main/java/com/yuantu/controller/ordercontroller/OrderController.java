package com.yuantu.controller.ordercontroller;

import com.yuantu.po.*;
import com.yuantu.serviceinterface.orderinterface.IOrderService;
import com.yuantu.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 *
 *@author tai
 *@Time
 *订单管理模块
 *
 */
@RestController
@RequestMapping(value = "/order")
public class OrderController {
    @Autowired
    private IOrderService iOrderService;

    /**
     添加预约订单
     */
    @RequestMapping(value = "/addBookingOrder", method = RequestMethod.GET)
    public PageUtil<MsleOrderPo> addBookingOrder(@RequestBody MsleOrderPo msleOrderPo) {
        List<MsleOrderPo> list=new ArrayList<MsleOrderPo>();
        list.add(iOrderService.addBookingOrder(msleOrderPo));
        PageUtil<MsleOrderPo> pageUtil=new PageUtil<MsleOrderPo>(list);
        return pageUtil;
    }

    /**
     添加非预约订单
     */
    @RequestMapping(value = "/addOrder", method = RequestMethod.GET)
    public PageUtil<MsleOrderPo> addOrder(@Valid  @RequestBody MsleOrderPo msleOrderPo) {
        List<MsleOrderPo> list=new ArrayList<MsleOrderPo>();
        list.add(iOrderService.addOrder(msleOrderPo));
        PageUtil<MsleOrderPo> pageUtil=new PageUtil<MsleOrderPo>(list);
        return pageUtil;
    }

    /**
     获取物流信息
     */
    @RequestMapping(value = "/getLogisticsInformation", method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MsleLogisticsPo> getLogisticsInformation(String logisticsOrderId) {
        List<MsleLogisticsPo> list=new ArrayList<MsleLogisticsPo>();
        list.add(iOrderService.getLogisticsInformation(logisticsOrderId));
        PageUtil<MsleLogisticsPo> pageUtil=new PageUtil<MsleLogisticsPo>(list);
        return pageUtil;
    }

    /**
     填写收件信息
     */
    @RequestMapping(value = "/writeConsigneeInformation", method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<Integer> writeConsigneeInformation(@RequestBody MsleLogisticsPo msleLogisticsPo) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(iOrderService.writeConsigneeInformation(msleLogisticsPo));
        PageUtil<Integer> pageUtil=new PageUtil<Integer>(list);
        return pageUtil;
    }

    /**
     获得城市下营业厅
     */
    @RequestMapping(value = "/getServicehallByCity", method = RequestMethod.GET)
    @ResponseBody
    PageUtil<MsleOrganizationPo> getServicehallByCity(String organizationCity) {
        PageUtil<MsleOrganizationPo> pageUtil=new PageUtil<MsleOrganizationPo>(
                iOrderService.getServicehallByCity(organizationCity));
        return pageUtil;
    }

    /**
     在指定营业厅下随机选取一名快递员
     */
    @RequestMapping(value = "/getCourierByServicehall", method = RequestMethod.GET)
    @ResponseBody
    PageUtil<MsleStaffPo> getCourierByServicehall(String organizationId) {
        List<MsleStaffPo> list=new ArrayList<MsleStaffPo>();
        list.add(iOrderService.getCourierByServicehall(organizationId));
        PageUtil<MsleStaffPo> pageUtil=new PageUtil<MsleStaffPo>(list);
        return pageUtil;
    }

    /**
     快递员根据自身id看待取件
     */
    @RequestMapping(value = "/getThePickup", method = RequestMethod.GET)
    @ResponseBody
    PageUtil<MsleOrderPo> getThePickup(String staffId) {
        PageUtil<MsleOrderPo> pageUtil=new PageUtil<MsleOrderPo>(
                iOrderService.getThePickup(staffId));
        return pageUtil;
    }

    /**
     快递员根据自身id看待派件
     */
    @RequestMapping(value = "/getTheDelivery", method = RequestMethod.GET)
    @ResponseBody
    PageUtil<MsleLogisticsPo> getTheDelivery(String staffId) {
        PageUtil<MsleLogisticsPo> pageUtil=new PageUtil<MsleLogisticsPo>(
                iOrderService.getTheDelivery(staffId));
        return pageUtil;
    }

}
