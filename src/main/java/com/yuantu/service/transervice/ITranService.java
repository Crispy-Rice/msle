package com.yuantu.service.transervice;

import com.yuantu.po.tranpo.*;


import java.util.List;


public interface ITranService {

    boolean addLoadingList(MsleLoadingListPO loadingListPO);//添加装车单

    MsleLoadingListPO getLoadingListById(String id);//根据id查询装车单

    //List<MsleLoadingListPO> getLoadingListByStatus(String status);

    List<MsleLoadingListPO> getLoadingListByHallId(String loadlingListHallNo);//根据营业厅编号查询装车单

    List<String> getOrderByLoadingListId(String loadId);



//    boolean updateLoadingListStatus(Integer id, String status);


    boolean addReceive(MsleReceivePO receivePO);

    MsleReceivePO getReceiveById(String id);

    List<MsleReceivePO> getReceiveByCenterId(String receiveCenterId);

//    List<MsleReceivePO> getReceiveByStatus(String status);
//
//    boolean updateReceiveStatus(Integer id, String status);


    boolean addDisptach(MsleDispatchPO dispatchPO);

    MsleDispatchPO getDisptachById (String disptachId);

    List<MsleDispatchPO> getDisptachByPostman(String dispatchPostman);

    List<MsleDispatchPO> getDisptachByHallId(String dispatchHallId);

//    List<MsleDispatchPO> getDisptachByStatus(String status);

//    boolean updateDisptachStatus(Integer id, String status);


    boolean addArrival(MsleArrivalPO arrivalPO);

    MsleArrivalPO getArrivalById(String id);

//    List<MsleArrivalPO> getArrivalByStatus(String status);
//
//    boolean updateArrivalStatus(Integer id, String status);

    List<MsleArrivalPO> getArrivalByHallId(String id);//根据id查找到达单


    boolean addCar(MsleCarPO carPO);

    boolean deleteCar(String id);

    boolean updateCar(MsleCarPO carPO);

    List<MsleCarPO> queryAllCars(String carHallId);

    MsleCarPO queryCarById(String id);


    boolean addCenterLoad(MsleCenterLoadPO centerLoadPO);


    List<MsleCenterLoadPO> getCenterLoadById(String id);

    List<MsleCenterLoadPO> getCenterLoadByCenterId(String id);

//    List<MsleCenterLoadPO> getCenterLoadByStatus(String status);
//
//    boolean updateCenterLoadStatus(Integer id, String status);


    boolean addTransfer(MsleTransferPO transferPO);


    MsleTransferPO getTransferById(String id);

    List<MsleTransferPO> getTransferByListId(String id);

    List<MsleTransferPO> getTransferByCenterId(String id);

//    List<MsleTransferPO> getTransferByStatus(String status);
//
//    boolean updateTransferStatus(Integer id, String status);






    boolean addDriver(MsleDriverPO driverPO);

    boolean deleteDriver(String driverId);

    boolean updateDriver(MsleDriverPO driverPO);

    List<MsleDriverPO> queryAllDrivers(String driverHallId);

    MsleDriverPO queryDriverById(String driverId);
}

