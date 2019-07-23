package com.yuantu.service.transervice;

import com.yuantu.po.tranpo.*;


import java.util.List;


public interface ITranService {

    boolean addLoadingList(MsleLoadingListPo loadingListPO);//添加装车单

    MsleLoadingListPo getLoadingListById(String id);//根据id查询装车单

    //List<MsleLoadingListPo> getLoadingListByStatus(String status);

    List<MsleLoadingListPo> getLoadingListByHallId(String loadlingListHallNo);//根据营业厅编号查询装车单

    List<String> getOrderByLoadingListId(String loadId);



//    boolean updateLoadingListStatus(Integer id, String status);


    boolean addReceive(MsleReceivePo receivePO);

    MsleReceivePo getReceiveById(String id);

    List<MsleReceivePo> getReceiveByCenterId(String receiveCenterId);

//    List<MsleReceivePo> getReceiveByStatus(String status);
//
//    boolean updateReceiveStatus(Integer id, String status);


    boolean addDisptach(MsleDispatchPo dispatchPO);

    MsleDispatchPo getDisptachById (String disptachId);

    List<MsleDispatchPo> getDisptachByPostman(String dispatchPostman);

    List<MsleDispatchPo> getDisptachByHallId(String dispatchHallId);

//    List<MsleDispatchPo> getDisptachByStatus(String status);

//    boolean updateDisptachStatus(Integer id, String status);


    boolean addArrival(MsleArrivalPo arrivalPO);

    MsleArrivalPo getArrivalById(String id);

//    List<MsleArrivalPo> getArrivalByStatus(String status);
//
//    boolean updateArrivalStatus(Integer id, String status);

    List<MsleArrivalPo> getArrivalByHallId(String id);//根据id查找到达单


    boolean addCar(MsleCarPO carPO);

    boolean deleteCar(String id);

    boolean updateCar(MsleCarPO carPO);

    List<MsleCarPO> queryAllCars(String carHallId);

    MsleCarPO queryCarById(String id);


    boolean addCenterLoad(MsleCenterLoadPo centerLoadPO);


    List<MsleCenterLoadPo> getCenterLoadById(String id);

    List<MsleCenterLoadPo> getCenterLoadByCenterId(String id);

//    List<MsleCenterLoadPo> getCenterLoadByStatus(String status);
//
//    boolean updateCenterLoadStatus(Integer id, String status);


    boolean addTransfer(MsleTransferPo transferPO);


    MsleTransferPo getTransferById(String id);

    List<MsleTransferPo> getTransferByListId(String id);

    List<MsleTransferPo> getTransferByCenterId(String id);

//    List<MsleTransferPo> getTransferByStatus(String status);
//
//    boolean updateTransferStatus(Integer id, String status);






    boolean addDriver(MsleDriverPo driverPO);

    boolean deleteDriver(String driverId);

    boolean updateDriver(MsleDriverPo driverPO);

    List<MsleDriverPo> queryAllDrivers(String driverHallId);

    MsleDriverPo queryDriverById(String driverId);
}

