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

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/tran")
public class TranController {
    @Autowired
    ITranService tranService;

    @RequestMapping(value = "/addLoadingList" ,method = RequestMethod.POST)
    @ResponseBody
    public boolean addLoadingList(@RequestBody MsleLoadingListPo loadingListPo) {
        System.out.println(loadingListPo);
        return tranService.addLoadingList(loadingListPo);
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

   @RequestMapping(value = "/deleteLoadingListById" ,method=RequestMethod.DELETE)
   @ResponseBody
   public PageUtil<Boolean> deleteLoadingListById(String loadingListId){
        return new PageUtil<Boolean>(tranService.deleteLoadingListById(loadingListId));
   }


//    @RequestMapping(value = "/getLoadingListById")
//    @ResponseBody
//    public MsleloadingListPo getLoadingListById( String id) {
//        return tranService.getLoadingListById(id);
//    }


//    @RequestMapping(value = "/getLoadingList")
//    @ResponseBody
//    public List<MsleloadingListPo> getLoadingList() {
//        return tranService.getLoadingList();
//    }
//
//    @RequestMapping(value = "/getLoadingListByStatus")
//    @ResponseBody
//    public List<MsleloadingListPo> getLoadingListByStatus(String status) {
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
    public PageUtil<Boolean> addReceive(@RequestBody MsleReceivePo receivePo) {
        List<Boolean> resultList =new ArrayList<Boolean>();
        resultList.add(tranService.addReceive(receivePo));
        return new PageUtil<Boolean>(resultList);
    }

    @RequestMapping(value = "/getReceiveById" ,method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MsleReceivePo> getReceiveById(String id) {
        List<MsleReceivePo> resultList=new ArrayList<MsleReceivePo>();
        resultList.add(tranService.getReceiveById(id));
        return new PageUtil<MsleReceivePo>(resultList);
    }

    @RequestMapping(value = "/getReceiveByCenterId" ,method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MsleReceivePo> getReceiveByCenterId(String receiveCenterId) {
        return new PageUtil<MsleReceivePo>(tranService.getReceiveByCenterId(receiveCenterId));
    }

//    @RequestMapping(value = "/updateReceiveStatus")
//    @ResponseBody
//    public boolean updateReceiveStatus(Integer id, String status) {
//        return tranService.updateReceiveStatus(id,status);
//    }

    @RequestMapping(value = "/deleteReceiveById" ,method=RequestMethod.DELETE)
    @ResponseBody
    public PageUtil<Boolean> deleteReceiveById(String receiveId){
    return new PageUtil<Boolean>(tranService.deleteReceiveById(receiveId));
}


    @RequestMapping(value = "/addDisptach" ,method = RequestMethod.POST)
    @ResponseBody
    public PageUtil<Boolean> addDisptach(@RequestBody MsleDispatchPo dispatchPo) {
        List<Boolean> resultList=new ArrayList<Boolean>();
        resultList.add(tranService.addDisptach(dispatchPo));
        return new PageUtil<Boolean>(resultList);
    }

    @RequestMapping(value = "/getDisptachById" ,method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MsleDispatchPo> getDisptachById(String dispatchId){
        List<MsleDispatchPo> resultList=new ArrayList<MsleDispatchPo>();
        resultList.add(tranService.getDisptachById(dispatchId));
        return new PageUtil<MsleDispatchPo>(resultList);
    }

    @RequestMapping(value = "/getDisptachByPostman" ,method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MsleDispatchPo> getDisptachByPostman(String dispatchPostman){
        return new PageUtil<MsleDispatchPo>(tranService.getDisptachByPostman(dispatchPostman));
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
@RequestMapping(value = "/deleteDisptachById" ,method=RequestMethod.DELETE)
@ResponseBody
public PageUtil<Boolean> deleteDisptachById(String loadingListId){
    return new PageUtil<Boolean>(tranService.deleteDisptachById(loadingListId));
}


    @RequestMapping(value = "/addArrival" ,method = RequestMethod.POST)
    @ResponseBody
    public PageUtil<Boolean> addArrival (@RequestBody MsleArrivalPo arrivalPo){
        List<Boolean> resultList =new ArrayList<Boolean>();
        resultList.add(tranService.addArrival(arrivalPo));
        return new PageUtil<Boolean>(resultList);
    }

    @RequestMapping(value = "/getArrivalById" ,method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MsleArrivalPo> getArrivalById(String id){
        List<MsleArrivalPo> resultList=new ArrayList<MsleArrivalPo>();

        resultList.add(tranService.getArrivalById(id));
        return new PageUtil<MsleArrivalPo>(resultList);
    }

    @RequestMapping(value = "/getArrivalByHallId" ,method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MsleArrivalPo> getArrivalByHallId(String id){
        return new PageUtil<MsleArrivalPo>(tranService.getArrivalByHallId(id));
    }


    @RequestMapping(value = "/deleteArrivalById" ,method=RequestMethod.DELETE)
    @ResponseBody
    public PageUtil<Boolean> deleteArrivalById(String loadingListId){
        return new PageUtil<Boolean>(tranService.deleteArrivalById(loadingListId));
    }
//    @RequestMapping(value = "/updateArrivalStatus")
//    @ResponseBody
//    public  boolean updateArrivalStatus(Integer id,String status){
//        return tranService.updateArrivalStatus(id,status);
//    }

    @RequestMapping(value = "/addCar" ,method = RequestMethod.POST)
    @ResponseBody
    public PageUtil<Boolean> addCar(@RequestBody MsleCarPo carPo)
    {
        List<Boolean> resultList =new ArrayList<Boolean>();
        resultList.add(tranService.addCar(carPo));

        return new PageUtil<Boolean>(resultList);
    }

    @RequestMapping(value = "/deleteCar" ,method = RequestMethod.DELETE)
    @ResponseBody
    public PageUtil<Boolean> deleteCar(String id) {
        List<Boolean> resultList =new ArrayList<Boolean>();
        resultList.add(tranService.deleteCar(id));
        return new PageUtil<Boolean>(resultList);
    }

    @RequestMapping(value = "/updateCar",method = RequestMethod.PUT)
    @ResponseBody
    public  PageUtil<Boolean> updateCar(@RequestBody MsleCarPo carPo) {
        List<Boolean> resultList =new ArrayList<Boolean>();
        resultList.add(tranService.updateCar(carPo));


        return new PageUtil<Boolean>(resultList);
    }

    @RequestMapping(value = "/queryAllCars",method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MsleCarPo> queryAllCars(String carHallId) {
        return new PageUtil<MsleCarPo>( tranService.queryAllCars(carHallId));
    }

    @RequestMapping(value = "/queryCarById",method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MsleCarPo> queryCarById(String id) {
        List<MsleCarPo> resultList =new ArrayList<MsleCarPo>();
        resultList.add(tranService.queryCarById(id));
        return new PageUtil<MsleCarPo>(resultList);
    }

    @RequestMapping(value = "/addCenterLoad",method = RequestMethod.POST)
    @ResponseBody
    public  PageUtil<Boolean> addCenterLoad(@Valid @RequestBody MsleCenterLoadPo centerLoadPo){
        List<Boolean> resultList =new ArrayList<Boolean>();
        resultList.add(tranService.addCenterLoad(centerLoadPo));


        return new PageUtil<Boolean>(resultList);
    }





    @RequestMapping(value = "/getCenterLoadById",method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MsleCenterLoadPo> getCenterLoadById(String id){
        return new PageUtil<MsleCenterLoadPo>(tranService.getCenterLoadById(id));
    }

    @RequestMapping(value = "/getCenterLoadByCenterId",method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MsleCenterLoadPo> getCenterLoadByCenterId(String id){
        return new PageUtil<MsleCenterLoadPo>(tranService.getCenterLoadByCenterId(id));
    }

//    @RequestMapping(value = "/updateCenterLoadStatus")
//    @ResponseBody
//    public boolean updateCenterLoadStatus(Integer id,String status){
//        return tranService.updateCenterLoadStatus(id,status);
//    }

    @RequestMapping(value = "/deleteCenterLoadById" ,method=RequestMethod.DELETE)
    @ResponseBody
    public PageUtil<Boolean> deleteCenterLoadById(String loadingListId){
        return new PageUtil<Boolean>(tranService.deleteCenterLoadById(loadingListId));
    }


    @RequestMapping(value = "/addTransfer",method = RequestMethod.POST)
    @ResponseBody
    public  PageUtil<Boolean> addTransfer(@RequestBody MsleTransferPo transferPo){
        List<Boolean> resultList =new ArrayList<Boolean>();
        resultList.add(tranService.addTransfer(transferPo));
        return new PageUtil<Boolean>(resultList);
    }




    @RequestMapping(value = "/getTransferById",method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MsleTransferPo> getTransferById(String id){
        List<MsleTransferPo> resultList=new ArrayList<MsleTransferPo>();
        resultList.add(tranService.getTransferById(id));

        return new PageUtil<MsleTransferPo>(resultList);
    }

    @RequestMapping(value = "/getTransferByListId",method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MsleTransferPo> getTransferByListId(String id){
        return  new PageUtil<MsleTransferPo>(tranService.getTransferByListId(id));
    }

    @RequestMapping(value = "/getTransferByCenterId",method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MsleTransferPo> getTransferByCenterId(String id){
        return new PageUtil<MsleTransferPo>(tranService.getTransferByCenterId(id));
    }

    @RequestMapping(value = "/deleteTransferById" ,method=RequestMethod.DELETE)
    @ResponseBody
    public PageUtil<Boolean> deleteTransferById(String loadingListId){
        return new PageUtil<Boolean>(tranService.deleteTransferById(loadingListId));
    }



//    @RequestMapping(value = "/updateTransferStatus")
//    @ResponseBody
//    public boolean updateTransferStatus(Integer id,String status){
//        return tranService.updateTransferStatus(id,status);
//    }

    @RequestMapping(value = "/addDriver",method = RequestMethod.POST)
    @ResponseBody
    public PageUtil<Boolean> addDriver(@RequestBody MsleDriverPo driverPo) {
        return new PageUtil<Boolean>(tranService.addDriver(driverPo));
    }

    @RequestMapping(value = "/deleteDriver",method = RequestMethod.DELETE)
    @ResponseBody
    public PageUtil<Boolean> deleteDriver(String id) {
        return new PageUtil<Boolean>(tranService.deleteDriver(id));
    }

    @RequestMapping(value = "/updateDriver",method = RequestMethod.PUT)
    @ResponseBody
    public  PageUtil<Boolean> updateDriver(@RequestBody MsleDriverPo driverPo) {
        return new PageUtil<Boolean>(tranService.updateDriver(driverPo));
    }

    @RequestMapping(value = "/queryAllDrivers",method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MsleDriverPo> queryAllDrivers(String driverHallId) {
        List<MsleDriverPo> list=tranService.queryAllDrivers(driverHallId);

        return new PageUtil<MsleDriverPo>(list);
    }

    @RequestMapping(value = "/queryDriverById",method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MsleDriverPo> queryDriverById(String id) {
        return new PageUtil<MsleDriverPo>(tranService.queryDriverById(id));
    }



}