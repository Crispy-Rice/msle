package com.yuantu.dao.trandao;


import com.yuantu.po.tranpo.*;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ITranDao {

    @Insert("insert into msle_loadinglist values(#{loadingListId},#{loadingListLoadId}," +
            "#{loadingListLoadDate},#{loadingListHallNo},#{loadingListTranNo},#{loadingListDestination}," +
            "#{loadingListCarno},#{loadingListSupervisor},#{loadingListSupercargo}," +
            "#{loadingListOrderId},#{loadingListFee},#{loadingListStatus})")
    boolean addLoadingList(MsleLoadingListPo loadingListPo);

    @Select("select * from msle_loadinglist where loadingList_id='${loadingListId}'")
    MsleLoadingListPo getLoadingListById(@Param("loadingListId") String loadingListId);

//    @Select("select * from msle_loadinglist where loadinglistStatus='${status}'")
//    List<MsleloadingListPo> getLoadingListByStatus(@Param("status") String status);

    @Select("select * from msle_loadinglist where loadingList_hallno='${loadlingListHallNo}'")
    List<MsleLoadingListPo> getLoadingListByHallId(@Param("loadlingListHallNo") String loadlingListHallNo);

    @Delete("delete from msle_loadinglist where loadinglist_id='${loadingListId}'")
    boolean deleteLoadingListById(@Param("loadingListId") String loadingListId);

//    @Update("update msle_loadinglist set loadinglistStatus='${status}'" +
//            "where loadingListId='${id}'")
//    boolean updateLoadingListStatus(
//            @Param("id") String id,@Param("status") String status);


    @Select("select loadingList_orderid from mlse_loadinglist where loadlingList_id='${loadId}'")
    List<String> getOrderByLoadingListId(@Param("loadId") String loadId);


    @Insert("insert into msle_receive values(#{receiveId},#{receiveCenterId}," +
            "#{receiveArriveDate},#{receiveTransferId},#{receiveDepature}," +
            "#{receiveArrivateState},#{receiveState})")
    boolean addReceive(MsleReceivePo receivePo);

    @Select("select * from msle_receive where receive_id='${id}'")
    MsleReceivePo getReceiveById(@Param("id") String id);

    @Select("select * from msle_receive where receive_centerid='${receiveCenterId}'")
    List<MsleReceivePo> getReceiveByCenterId(@Param("receiveCenterId") String receiveCenterId);


    @Delete("delete from msle_receive where receive_id='${receiveId}'")
    boolean deleteReceiveById(@Param("receiveId") String receiveId);
//    @Select("select * from msle_receive where receive_status='${status}'")
//    List<MslereceivePo> getReceiveByStatus(@Param("status") String status);
//
//    @Update("update msle_receive set receive_status='${status}'" +
//            "where receive_id='${id}'")
//    boolean updateReceiveStatus(@Param("id") Integer id,@Param("status") String status);






    @Insert("insert into msle_dispatch values(#{dispatchId},#{dispatchHallId}," +
            "#{dispatchDispatchId},#{dispatchArriveDate},#{dispatchOrderNo}," +
            "#{dispatchPostman},#{dispatchStatus})")
    boolean addDisptach(MsleDispatchPo dispatchPo);

    @Select("select * from msle_dispatch where dispatch_id='${id}'")
    MsleDispatchPo getDisptachById(@Param("id") String id);

    @Select("select * from msle_dispatch where dispatch_postman='${dispatchPostman}'")
    List<MsleDispatchPo> getDisptachByPostman(@Param("dispatchPostman") String dispatchPostman);

    @Select("select * from msle_dispatch where dispatch_hallid='${dispatchHallId}'")
    List<MsleDispatchPo> getDisptachByHallId(@Param("dispatchHallId") String dispatchHallId);
//    @Select("select * from msle_dispatch where receive_dispatch='${status}'")
//    List<MsledispatchPo> getDisptachByStatus(@Param("status") String status);

//    @Update("update msle_dispatch set dispatch_status='${status}'" +
//            "where dispatch_id='${id}'")
//    boolean updateDisptachStatus(@Param("id") String id,@Param("status") String status);

    @Delete("delete from msle_dispatch where dispatch_id='${disptachId}'")
    boolean deleteDisptachById(@Param("disptachId") String disptachId);


    @Insert("insert into msle_car values(#{carId},#{carCarNo}," +
            "#{carNo},#{carBuyTime},#{carEngineNo}," +
            "#{carBaseplateNo},#{carAge},#{carImage},#{carHallId},#{carStatus})")
    boolean addCar(MsleCarPo carPo);

    @Delete("delete from msle_car where car_id='${id}'")
    boolean deleteCar(@Param("id") String id);

    @Update("update msle_car set car_no=#{carNo}," +
            "car_carno=#{carCarNo},car_buyTime=#{carBuyTime},car_engineNo=#{carEngineNo}," +
            "car_baseplateNo=#{carBaseplateNo},car_age=#{carAge}," +
            "car_image=#{carImage},car_hallId=#{carHallId},car_statUS=#{carStatus}" +
            "where car_id=#{carId}")
    boolean updateCar(MsleCarPo carPo);

    @Select("select * from msle_car where car_hallid='${carHallId}'")
    List<MsleCarPo> queryAllCars(@Param("carHallId") String carHallId);

    @Select("select * from msle_car where car_id='${id}'")
    MsleCarPo queryCarById(@Param("id") String id);




    @Insert("insert into msle_arrival values(#{arrivalId},#{arrivalArriveDate}," +
            "#{arrivalTransferId},#{arrivalDeparture},#{arrivalState}," +
            "#{arrivalStatus},#{arrivalHallId})")
    boolean addArrival (MsleArrivalPo arrivalPo);

    @Select("select * from msle_arrival where arrival_id='${id}'")
    MsleArrivalPo getArrivalById(@Param("id") String id);

    @Select("select * from msle_arrival where arrival_hallid='${id}'")
    List<MsleArrivalPo> getArrivalByHallId(@Param("id") String id);

    @Delete("delete from msle_arrival where arrival_id='${arrivalId}'")
    boolean deleteArrivalById(@Param("arrivalId") String arrivalId);

//    @Select("select * from msle_arrival where arrivalStatus='${status}'")
//    List<MslearrivalPo> getArrivalByStatus(@Param("status") String status);

//    @Update("update msle_arrival set arrival_status='${status}'" +
//            "where arrival_id='${id}'")
//    boolean updateArrivalStatus(@Param("id") Integer id,@Param("status") String status);
//


    @Insert("insert into msle_centerload values(#{centerLoadId},#{centerLoadCenterId}," +
            "#{centerLoadLoadId},#{centerLoadDate},#{centerLoadTranno}," +
            "#{centerLoadDestination},#{centerLoadCarNo},#{centerLoadSupervisor}," +
            "#{centerLoadSupercargo},#{centerLoadOrder},#{centerLoadFee},#{centerLoadStatus})")
    boolean addCenterLoad(MsleCenterLoadPo centerLoadPo);



    @Select("select * from msle_centerload where centerLoad_id='${id}'")
    List<MsleCenterLoadPo> getCenterLoadById(@Param("id") String id);

    @Select("select * from msle_centerload where centerLoad_centerid='${id}'")
    List<MsleCenterLoadPo> getCenterLoadByCenterId(@Param("id") String id);

    @Delete("delete from msle_centerload where centerload_id='${centerloadId}'")
    boolean deleteCenterLoadById(@Param("centerloadId") String centerloadId);

//    @Select("select * from msle_centerload where centerload_status='${status}'")
//    List<MslecenterLoadPo> getCenterLoadByStatus(@Param("status") String status);

//    @Update("update msle_centerload set centerload_status='${status}'" +
//            "where centerload_id='${id}'")
//    boolean updateCenterLoadStatus(@Param("id") Integer id,@Param("status") String status);
//



    @Insert("insert into msle_transfer values(#{transferId},#{transferTransferId}," +
            "#{transferNo},#{transferDate},#{transferShipment}," +
            "#{transferShipmentNo},#{transferDeparture},#{transferDestination}," +
            "#{transferContainerNo},#{transferSupervisor},#{transferOrderId}," +
            "#{transferFee},#{transferStatus})")
    boolean addTransfer(MsleTransferPo transferPo);

    @Select("select * from msle_transfer where transfer_id='${id}'")
    MsleTransferPo getTransferById(@Param("id") String id);

    @Select("select * from msle_transfer where transfer_transferid='${id}'")
    List<MsleTransferPo> getTransferByListId(@Param("id") String id);

    @Select("select * from msle_transfer where transfer_no='${id}'")
    List<MsleTransferPo> getTransferByCenterId(@Param("id") String id);

    @Delete("delete from msle_transfer where transfer_id='${transferId}'")
    boolean deleteTransferById(@Param("transferId") String transferId);

//    @Select("select * from msle_transfer where transfer_status='${status}'")
//    List<MsletransferPo> getTransferByStatus(@Param("status") String status);
//
//    @Update("update msle_transfer set transfer_status='${status}'" +
//            "where transfer_id='${id}'")
//    boolean updateTransferStatus(@Param("id") Integer id,@Param("status") String status);


    @Insert("insert into msle_driver values(#{driverId},#{driverNo}," +
            "#{driverName},#{driverBirthdate},#{driverIdNum}," +
            "#{driverPhone},#{driverCarUnit},#{driverSex},#{driverDue},#{driverHallId}," +
            "#{driverStatus})")
    boolean addDriver(MsleDriverPo driverPo);

    @Delete("delete from msle_driver where driver_id='${driverId}'")
    boolean deleteDriver(@Param("driverId") String driverId);

    @Update("update msle_driver set driver_no=#{driverNo},driver_name=#{driverName}," +
            "driver_birthdate=#{driverBirthdate},driver_idnum=#{driverIdNum}," +
            "driver_phone=#{driverPhone}," +
            "driver_carUnit=#{driverCarUnit},driver_sex=#{driverSex}," +
            "driver_due=#{driverDue},driver_hallId=#{driverHallId},driver_status=#{driverStatus}" +
            "where driver_id=#{driverId}")
    boolean updateDriver(MsleDriverPo driverPo);

    @Select("select * from msle_driver where driver_hallId='${driverHallId}'  ")
    List<MsleDriverPo> queryAllDrivers(@Param("driverHallId") String driverHallId);

    @Select("select * from msle_driver where driver_id='${driverId}'")
    MsleDriverPo queryDriverById(@Param("driverId") String driverId);

}
