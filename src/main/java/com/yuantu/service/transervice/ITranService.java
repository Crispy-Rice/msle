package com.yuantu.service.transervice;

import com.yuantu.po.tranpo.*;


import java.util.List;


public interface ITranService {

    boolean addLoadingList(MsleLoadingListPo loadingListPo);//添加装车单

    MsleLoadingListPo getLoadingListById(String id);//根据id查询装车单

    //List<MsleloadingListPo> getLoadingListByStatus(String status);

    List<MsleLoadingListPo> getLoadingListByHallId(String loadlingListHallNo);//根据营业厅编号查询装车单

    List<String> getOrderByLoadingListId(String loadId);

    boolean deleteLoadingListById(String loadingListId);



//    boolean updateLoadingListStatus(Integer id, String status);


    boolean addReceive(MsleReceivePo receivePo);

    MsleReceivePo getReceiveById(String id);

    List<MsleReceivePo> getReceiveByCenterId(String receiveCenterId);

    boolean deleteReceiveById(String receiveId);

//    List<MslereceivePo> getReceiveByStatus(String status);
//
//    boolean updateReceiveStatus(Integer id, String status);


    boolean addDisptach(MsleDispatchPo dispatchPo);

    MsleDispatchPo getDisptachById (String disptachId);

    List<MsleDispatchPo> getDisptachByPostman(String dispatchPostman);

    List<MsleDispatchPo> getDisptachByHallId(String dispatchHallId);

    boolean deleteDisptachById(String disptachId);

//    List<MsledispatchPo> getDisptachByStatus(String status);

//    boolean updateDisptachStatus(Integer id, String status);


    boolean addArrival(MsleArrivalPo arrivalPo);

    MsleArrivalPo getArrivalById(String id);

//    List<MslearrivalPo> getArrivalByStatus(String status);
//
//    boolean updateArrivalStatus(Integer id, String status);

    List<MsleArrivalPo> getArrivalByHallId(String id);//根据id查找到达单

    boolean deleteArrivalById(String arrivalId);




    boolean addCar(MsleCarPo carPo);

    boolean deleteCar(String id);

    boolean updateCar(MsleCarPo carPo);

    List<MsleCarPo> queryAllCars(String carHallId);

    MsleCarPo queryCarById(String id);


    boolean addCenterLoad(MsleCenterLoadPo centerLoadPo);


    List<MsleCenterLoadPo> getCenterLoadById(String id);

    List<MsleCenterLoadPo> getCenterLoadByCenterId(String id);


    boolean deleteCenterLoadById(String centerloadId);
//    List<MslecenterLoadPo> getCenterLoadByStatus(String status);
//
//    boolean updateCenterLoadStatus(Integer id, String status);


    boolean addTransfer(MsleTransferPo transferPo);


    MsleTransferPo getTransferById(String id);

    List<MsleTransferPo> getTransferByListId(String id);

    List<MsleTransferPo> getTransferByCenterId(String id);

//    List<MsletransferPo> getTransferByStatus(String status);
//
//    boolean updateTransferStatus(Integer id, String status);

    boolean deleteTransferById( String transferId);




    boolean addDriver(MsleDriverPo driverPo);

    boolean deleteDriver(String driverId);

    boolean updateDriver(MsleDriverPo driverPo);

    List<MsleDriverPo> queryAllDrivers(String driverHallId);

    MsleDriverPo queryDriverById(String driverId);
}

