package com.yuantu.controller.trancontroller;

import com.yuantu.po.tranpo.*;
import com.yuantu.service.transervice.ITranService;
import com.yuantu.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/tran")
public class TranController {
    @Autowired
    ITranService tranService;

    @RequestMapping(value = "/addLoadingList" ,method = RequestMethod.POST)
    @ResponseBody
    public boolean addLoadingList(@RequestBody MsleLoadingListPo loadingListPO) {
        System.out.println(loadingListPO);
        return tranService.addLoadingList(loadingListPO);
    }

    @RequestMapping(value = "/getLoadingListById" ,method = RequestMethod.GET)
    @ResponseBody
    public MsleLoadingListPo getLoadingListById(String id) {
        return tranService.getLoadingListById(id);
    }

    @RequestMapping(value = "/getLoadingListByHallId" ,method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MsleLoadingListPo> getLoadingListByHallId(String id) {
        return new PageUtil<MsleLoadingListPo>(tranService.getLoadingListByHallId(id));
    }




//    @RequestMapping(value = "/getLoadingListById")
//    @ResponseBody
//    public MsleLoadingListPo getLoadingListById( String id) {
//        return tranService.getLoadingListById(id);
//    }


//    @RequestMapping(value = "/getLoadingList")
//    @ResponseBody
//    public List<MsleLoadingListPo> getLoadingList() {
//        return tranService.getLoadingList();
//    }
//
//    @RequestMapping(value = "/getLoadingListByStatus")
//    @ResponseBody
//    public List<MsleLoadingListPo> getLoadingListByStatus(String status) {
//        return tranService.getLoadingListByStatus(status);
//    }
//
//
//    @RequestMapping(value = "/updateLoadingListStatus")
//    @ResponseBody
//    public boolean updateLoadingListStatus(Integer id, String status) {
//        return tranService.updateLoadingListStatus(id,status);
//    }




    @RequestMapping(value = "/addReceive" ,method = RequestMethod.POST)
    @ResponseBody
    public boolean addReceive(@RequestBody MsleReceivePo receivePO) {
        return tranService.addReceive(receivePO);
    }

    @RequestMapping(value = "/getReceiveById" ,method = RequestMethod.GET)
    @ResponseBody
    public MsleReceivePo getReceiveById(String id) {
        return tranService.getReceiveById(id);
    }

    @RequestMapping(value = "/getReceiveByCenterId" ,method = RequestMethod.GET)
    @ResponseBody
    public List<MsleReceivePo> getReceiveByCenterId(String receiveCenterId) {
        return tranService.getReceiveByCenterId(receiveCenterId);
    }

//    @RequestMapping(value = "/updateReceiveStatus")
//    @ResponseBody
//    public boolean updateReceiveStatus(Integer id, String status) {
//        return tranService.updateReceiveStatus(id,status);
//    }



    @RequestMapping(value = "/addDisptach" ,method = RequestMethod.POST)
    @ResponseBody
    public boolean addDisptach(@RequestBody MsleDispatchPo dispatchPO) {
        return tranService.addDisptach(dispatchPO);
    }

    @RequestMapping(value = "/getDisptachById" ,method = RequestMethod.GET)
    @ResponseBody
    public MsleDispatchPo getDisptachById(String dispatchId){
        return tranService.getDisptachById(dispatchId);
    }

    @RequestMapping(value = "/getDisptachByPostman" ,method = RequestMethod.GET)
    @ResponseBody
    public List<MsleDispatchPo> getDisptachByPostman(String dispatchPostman){
        return tranService.getDisptachByPostman(dispatchPostman);
    }

    @RequestMapping(value = "/getDisptachByHallId" ,method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MsleDispatchPo> getDisptachByHallId(String dispatchHallId){
        return new PageUtil<MsleDispatchPo>(tranService.getDisptachByHallId(dispatchHallId));
    }

//    @RequestMapping(value = "/updateDisptachStatus")
//    @ResponseBody
//    public boolean updateDisptachStatus(Integer id,String status){
//        return tranService.updateDisptachStatus(id, status);
//    }

    @RequestMapping(value = "/addArrival" ,method = RequestMethod.POST)
    @ResponseBody
    public boolean addArrival (@RequestBody MsleArrivalPo arrivalPO){
        return tranService.addArrival(arrivalPO);
    }

    @RequestMapping(value = "/getArrivalById" ,method = RequestMethod.GET)
    @ResponseBody
    public MsleArrivalPo getArrivalById(String id){
        return tranService.getArrivalById(id);
    }

    @RequestMapping(value = "/getArrivalByHallId" ,method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MsleArrivalPo> getArrivalByHallId(String id){
        return new PageUtil<MsleArrivalPo>(tranService.getArrivalByHallId(id));
    }

//    @RequestMapping(value = "/updateArrivalStatus")
//    @ResponseBody
//    public  boolean updateArrivalStatus(Integer id,String status){
//        return tranService.updateArrivalStatus(id,status);
//    }

    @RequestMapping(value = "/addCar" ,method = RequestMethod.POST)
    @ResponseBody
    public boolean addCar(@RequestBody MsleCarPO carPO) {
        return tranService.addCar(carPO);
    }

    @RequestMapping(value = "/deleteCar" ,method = RequestMethod.DELETE)
    @ResponseBody
    public boolean deleteCar(String id) {
        return tranService.deleteCar(id);
    }

    @RequestMapping(value = "/updateCar",method = RequestMethod.PUT)
    @ResponseBody
    public  boolean updateCar(@RequestBody MsleCarPO carPO) {
        return tranService.updateCar(carPO);
    }

    @RequestMapping(value = "/queryAllCars",method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MsleCarPO> queryAllCars(String carHallId) {
        return new PageUtil<MsleCarPO>( tranService.queryAllCars(carHallId));
    }

    @RequestMapping(value = "/queryCarById",method = RequestMethod.GET)
    @ResponseBody
    public MsleCarPO queryCarById(String id) {
        return tranService.queryCarById(id);
    }

    @RequestMapping(value = "/addCenterLoad",method = RequestMethod.POST)
    @ResponseBody
    public  boolean addCenterLoad(@RequestBody MsleCenterLoadPo centerLoadPO){
        return tranService.addCenterLoad(centerLoadPO);
    }





    @RequestMapping(value = "/getCenterLoadById",method = RequestMethod.GET)
    @ResponseBody
    public List<MsleCenterLoadPo> getCenterLoadById(String id){
        return tranService.getCenterLoadById(id);
    }

    @RequestMapping(value = "/getCenterLoadByCenterId",method = RequestMethod.GET)
    @ResponseBody
    public List<MsleCenterLoadPo> getCenterLoadByCenterId(String id){
        return tranService.getCenterLoadByCenterId(id);
    }

//    @RequestMapping(value = "/updateCenterLoadStatus")
//    @ResponseBody
//    public boolean updateCenterLoadStatus(Integer id,String status){
//        return tranService.updateCenterLoadStatus(id,status);
//    }

    @RequestMapping(value = "/addTransfer",method = RequestMethod.POST)
    @ResponseBody
    public  boolean addTransfer(@RequestBody MsleTransferPo transferPO){
        return tranService.addTransfer(transferPO);
    }




    @RequestMapping(value = "/getTransferById",method = RequestMethod.GET)
    @ResponseBody
    public MsleTransferPo getTransferById(String id){
        return tranService.getTransferById(id);
    }

    @RequestMapping(value = "/getTransferByListId",method = RequestMethod.GET)
    @ResponseBody
    public List<MsleTransferPo> getTransferByListId(String id){
        return tranService.getTransferByListId(id);
    }

    @RequestMapping(value = "/getTransferByCenterId",method = RequestMethod.GET)
    @ResponseBody
    public List<MsleTransferPo> getTransferByCenterId(String id){
        return tranService.getTransferByCenterId(id);
    }

//    @RequestMapping(value = "/updateTransferStatus")
//    @ResponseBody
//    public boolean updateTransferStatus(Integer id,String status){
//        return tranService.updateTransferStatus(id,status);
//    }

    @RequestMapping(value = "/addDriver",method = RequestMethod.POST)
    @ResponseBody
    public boolean addDriver(@RequestBody MsleDriverPo driverPO) {
        return tranService.addDriver(driverPO);
    }

    @RequestMapping(value = "/deleteDriver",method = RequestMethod.DELETE)
    @ResponseBody
    public boolean deleteDriver(String id) {
        return tranService.deleteDriver(id);
    }

    @RequestMapping(value = "/updateDriver",method = RequestMethod.PUT)
    @ResponseBody
    public  boolean updateDriver(@RequestBody MsleDriverPo driverPO) {
        return tranService.updateDriver(driverPO);
    }

    @RequestMapping(value = "/queryAllDrivers",method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MsleDriverPo> queryAllDrivers(String driverHallId) {
        List<MsleDriverPo> list=tranService.queryAllDrivers(driverHallId);

        return new PageUtil<MsleDriverPo>(list);
    }

    @RequestMapping(value = "/queryDriverById",method = RequestMethod.GET)
    @ResponseBody
    public MsleDriverPo queryDriverById(String id) {
        return tranService.queryDriverById(id);
    }



}