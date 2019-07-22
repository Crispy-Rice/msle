package com.yuantu.dao.trandao;


import com.yuantu.po.tranpo.*;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ITranDao {

    @Insert("insert into msle_loadinglist values(#{loadingListId},#{loadingListLoadId}," +
            "#{loadingListLoadDate},#{loadingListHallNo},#{loadingListTranNo},#{loadingListDestination}," +
            "#{loadingListCarno},#{loadingListSupervisor},#{loadingListSupercargo}," +
            "#{loadingListOrderId},#{loadingListFee},#{loadingListStatus})")
    boolean addLoadingList(MsleLoadingListPO loadingListPO);

    @Select("select * from msle_loadinglist where loadingList_id='${loadingListId}'")
    MsleLoadingListPO getLoadingListById(@Param("loadingListId") String loadingListId);

//    @Select("select * from msle_loadinglist where loadinglistStatus='${status}'")
//    List<MsleLoadingListPO> getLoadingListByStatus(@Param("status") String status);

    @Select("select * from msle_loadinglist where loadingList_hallno='${loadlingListHallNo}'")
    List<MsleLoadingListPO> getLoadingListByHallId(@Param("loadlingListHallNo") String loadlingListHallNo);


//    @Update("update msle_loadinglist set loadinglistStatus='${status}'" +
//            "where loadingListId='${id}'")
//    boolean updateLoadingListStatus(
//            @Param("id") String id,@Param("status") String status);


    @Select("select loadingList_orderid from mlse_loadinglist where loadlingList_id='${loadId}'")
    List<String> getOrderByLoadingListId(@Param("loadId") String loadId);


    @Insert("insert into msle_receive values(#{receiveId},#{receiveCenterId}," +
            "#{receiveArriveDate},#{receiveTransferId},#{receiveDepature}," +
            "#{receiveArrivateState},#{receiveState})")
    boolean addReceive(MsleReceivePO receivePO);

    @Select("select * from msle_receive where receive_id='${id}'")
    MsleReceivePO getReceiveById(@Param("id") String id);

    @Select("select * from msle_receive where receive_centerid='${receiveCenterId}'")
    List<MsleReceivePO> getReceiveByCenterId(@Param("receiveCenterId") String receiveCenterId);


//    @Select("select * from msle_receive where receive_status='${status}'")
//    List<MsleReceivePO> getReceiveByStatus(@Param("status") String status);
//
//    @Update("update msle_receive set receive_status='${status}'" +
//            "where receive_id='${id}'")
//    boolean updateReceiveStatus(@Param("id") Integer id,@Param("status") String status);






    @Insert("insert into msle_dispatch values(#{dispatchId},#{dispatchHallId}," +
            "#{dispatchDispatchId},#{dispatchArriveDate},#{dispatchOrderNo}," +
            "#{dispatchPostman},#{dispatchStatus})")
    boolean addDisptach(MsleDispatchPO dispatchPO);

    @Select("select * from msle_dispatch where dispatch_id='${id}'")
    MsleDispatchPO getDisptachById(@Param("id") String id);

    @Select("select * from msle_dispatch where dispatch_postman='${dispatchPostman}'")
    List<MsleDispatchPO> getDisptachByPostman(@Param("dispatchPostman") String dispatchPostman);

    @Select("select * from msle_dispatch where dispatch_hallid='${dispatchHallId}'")
    List<MsleDispatchPO> getDisptachByHallId(@Param("dispatchHallId") String dispatchHallId);
//    @Select("select * from msle_dispatch where receive_dispatch='${status}'")
//    List<MsleDispatchPO> getDisptachByStatus(@Param("status") String status);

//    @Update("update msle_dispatch set dispatch_status='${status}'" +
//            "where dispatch_id='${id}'")
//    boolean updateDisptachStatus(@Param("id") String id,@Param("status") String status);




    @Insert("insert into msle_car values(#{carId},#{carCarNo}," +
            "#{carNo},#{carBuyTime},#{carEngineNo}," +
            "#{carBaseplateNo},#{carAge},#{carImage},#{carHallId},#{carState})")
    boolean addCar(MsleCarPO carPO);

    @Delete("delete from msle_car where car_id='${id}'")
    boolean deleteCar(@Param("id") String id);

    @Update("update msle_car set car_no=#{carNo}," +
            "car_carno=#{carCarNo},car_buyTime=#{carBuyTime},car_engineNo=#{carEngineNo}," +
            "car_baseplateNo=#{carBaseplateNo},car_age=#{carAge}," +
            "car_image=#{carImage},car_hallId=#{carHallId},car_statUS=#{carStatus}" +
            "where car_id=#{carId}")
    boolean updateCar(MsleCarPO carPO);

    @Select("select * from msle_car where car_hallid='${carHallId}'")
    List<MsleCarPO> queryAllCars(@Param("carHallId") String carHallId);

    @Select("select * from msle_car where car_id='${id}'")
    MsleCarPO queryCarById(@Param("id") String id);




    @Insert("insert into msle_arrival values(#{arrivalId},#{arrivalArriveDate}," +
            "#{arrivalTransferId},#{arrivalDeparture},#{arrivalState}," +
            "#{arrivalStatus},#{arrivalHallId})")
    boolean addArrival (MsleArrivalPO arrivalPO);

    @Select("select * from msle_arrival where arrival_id='${id}'")
    MsleArrivalPO getArrivalById(@Param("id") String id);

    @Select("select * from msle_arrival where arrival_hallid='${id}'")
    List<MsleArrivalPO> getArrivalByHallId(@Param("id") String id);

//    @Select("select * from msle_arrival where arrivalStatus='${status}'")
//    List<MsleArrivalPO> getArrivalByStatus(@Param("status") String status);

//    @Update("update msle_arrival set arrival_status='${status}'" +
//            "where arrival_id='${id}'")
//    boolean updateArrivalStatus(@Param("id") Integer id,@Param("status") String status);
//


    @Insert("insert into msle_centerload values(#{centerLoadId},#{centerLoadCenterId}," +
            "#{centerLoadLoadId},#{centerLoadDate},#{centerLoadTranno}," +
            "#{centerLoadDsetination},#{centerLoadCarNo},#{centerLoadSupervisor}," +
            "#{centerLoadSupercargo},#{centerLoadOrder},#{centerLoadFee},#{centerLoadStatus})")
    boolean addCenterLoad(MsleCenterLoadPO centerLoadPO);



    @Select("select * from msle_centerload where centerLoad_id='${id}'")
    List<MsleCenterLoadPO> getCenterLoadById(@Param("id") String id);

    @Select("select * from msle_centerload where centerLoad_centerid='${id}'")
    List<MsleCenterLoadPO> getCenterLoadByCenterId(@Param("id") String id);

//    @Select("select * from msle_centerload where centerload_status='${status}'")
//    List<MsleCenterLoadPO> getCenterLoadByStatus(@Param("status") String status);

//    @Update("update msle_centerload set centerload_status='${status}'" +
//            "where centerload_id='${id}'")
//    boolean updateCenterLoadStatus(@Param("id") Integer id,@Param("status") String status);
//



    @Insert("insert into msle_transfer values(#{transferId},#{transferTransferId}," +
            "#{transferNo},#{transferDate},#{transferShipment}," +
            "#{transferShipmentNo},#{transferDeparture},#{transferDestination}," +
            "#{transferContainerNo},#{transferSupervisor},#{transferOrderId}," +
            "#{transferFee},#{transferStatus})")
    boolean addTransfer(MsleTransferPO transferPO);

    @Select("select * from msle_transfer where transfer_id='${id}'")
    MsleTransferPO getTransferById(@Param("id") String id);

    @Select("select * from msle_transfer where transfer_transferid='${id}'")
    List<MsleTransferPO> getTransferByListId(@Param("id") String id);

    @Select("select * from msle_transfer where transfer_no='${id}'")
    List<MsleTransferPO> getTransferByCenterId(@Param("id") String id);

//    @Select("select * from msle_transfer where transfer_status='${status}'")
//    List<MsleTransferPO> getTransferByStatus(@Param("status") String status);
//
//    @Update("update msle_transfer set transfer_status='${status}'" +
//            "where transfer_id='${id}'")
//    boolean updateTransferStatus(@Param("id") Integer id,@Param("status") String status);


    @Insert("insert into msle_driver values(#{driverId},#{driverNo}," +
            "#{driverName},#{driverBirthdate},#{driverIDNum}," +
            "#{driverPhone},#{driverCarUnit},#{driverSex},#{driverDue},#{driverHallId}," +
            "#{driverStatus})")
    boolean addDriver(MsleDriverPO driverPO);

    @Delete("delete from msle_driver where driver_id='${driverId}'")
    boolean deleteDriver(@Param("driverId") String driverId);

    @Update("update msle_driver set driver_no=#{driverNo},driver_name=#{driverName}," +
            "driver_birthdate=#{driverBirthdate},driver_idnum=#{driverIDNum}," +
            "driver_phone=#{driverPhone}," +
            "driver_carUnit=#{driverCarUnit},driver_sex=#{driverSex}," +
            "driver_due=#{driverDue},driver_hallId=#{driverHallId},driver_status=#{driverStatus}" +
            "where driver_id=#{driverId}")
    boolean updateDriver(MsleDriverPO driverPO);

    @Select("select * from msle_driver where driver_hallId='${driverHallId}'  ")
    List<MsleDriverPO> queryAllDrivers(@Param("driverHallId") String driverHallId);

    @Select("select * from msle_driver where driver_id='${driverId}'")
    MsleDriverPO queryDriverById(@Param("driverId") String driverId);

}
