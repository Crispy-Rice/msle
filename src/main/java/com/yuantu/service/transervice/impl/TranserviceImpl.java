package com.yuantu.service.transervice.impl;

import com.yuantu.dao.trandao.ITranDao;
import com.yuantu.po.tranpo.*;
import com.yuantu.service.transervice.ITranService;
import com.yuantu.util.UUID;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TranserviceImpl implements ITranService {
    @Resource
    ITranDao tranDao;

    @Override
    public boolean addLoadingList(MsleLoadingListPo loadingListPO) {

        loadingListPO.setLoadingListId(UUID.createID());
        return tranDao.addLoadingList(loadingListPO);
    }

    @Override
    public MsleLoadingListPo getLoadingListById(String id) {
        return tranDao.getLoadingListById(id);
    }

    @Override
    public List<MsleLoadingListPo> getLoadingListByHallId(String loadlingListHallNo) {
        return tranDao.getLoadingListByHallId(loadlingListHallNo);
    }

    @Override
    public List<String> getOrderByLoadingListId(String loadId) {
        return tranDao.getOrderByLoadingListId(loadId);
    }

//    @Override
//    public List<MsleLoadingListPo> getLoadingListByStatus(String status) {
//        return tranDao.getLoadingListByStatus(status);
//    }

//    @Override
//    public boolean updateLoadingListStatus(Integer id, String status) {
//        return tranDao.updateLoadingListStatus(id,status);
//    }


    @Override
    public boolean addReceive(MsleReceivePo receivePO) {
        receivePO.setReceiveId(UUID.createID());
        return tranDao.addReceive(receivePO);
    }

    @Override
    public MsleReceivePo getReceiveById(String id) {
        return tranDao.getReceiveById(id);
    }

    @Override
    public List<MsleReceivePo> getReceiveByCenterId(String receiveCenterId) {
        return tranDao.getReceiveByCenterId(receiveCenterId);
    }


    @Override
    public boolean addDisptach(MsleDispatchPo dispatchPO) {

        dispatchPO.setDispatchId(UUID.createID());
        return tranDao.addDisptach(dispatchPO);
    }

    @Override
    public MsleDispatchPo getDisptachById(String disptachId) {
        return tranDao.getDisptachById(disptachId);
    }

    @Override
    public List<MsleDispatchPo> getDisptachByPostman(String dispatchPostman) {
        return tranDao.getDisptachByPostman(dispatchPostman);
    }

    @Override
    public List<MsleDispatchPo> getDisptachByHallId(String dispatchHallId) {
        return tranDao.getDisptachByHallId(dispatchHallId);
    }


    @Override
    public boolean addArrival(MsleArrivalPo arrivalPO) {
        arrivalPO.setArrivalId(UUID.createID());
        return tranDao.addArrival(arrivalPO);
    }

    @Override
    public MsleArrivalPo getArrivalById(String id) {
        return tranDao.getArrivalById(id);
    }

    @Override
    public List<MsleArrivalPo> getArrivalByHallId(String id) {

        return tranDao.getArrivalByHallId(id);
    }


    @Override
    public boolean addCar(MsleCarPO carPO) {
        carPO.setCarId(UUID.createID());
        return tranDao.addCar(carPO);
    }

    @Override
    public boolean deleteCar(String id) {
        return tranDao.deleteCar(id);
    }

    @Override
    public boolean updateCar(MsleCarPO carPO) {
        return tranDao.updateCar(carPO);
    }

    @Override
    public List<MsleCarPO> queryAllCars(String carHallId) {
        return tranDao.queryAllCars(carHallId);
    }

    @Override
    public MsleCarPO queryCarById(String id) {
        return tranDao.queryCarById(id);
    }


    @Override
    public boolean addCenterLoad(MsleCenterLoadPo centerLoadPO) {
        centerLoadPO.setCenterLoadId(UUID.createID());
        return tranDao.addCenterLoad(centerLoadPO);
    }

    @Override
    public List<MsleCenterLoadPo> getCenterLoadById(String id) {
        return tranDao.getCenterLoadById(id);
    }

    @Override
    public List<MsleCenterLoadPo> getCenterLoadByCenterId(String id) {
        return tranDao.getCenterLoadByCenterId(id);
    }


    @Override
    public boolean addTransfer(MsleTransferPo transferPO) {
        transferPO.setTransferId(UUID.createID());
        return tranDao.addTransfer(transferPO);
    }

    @Override
    public MsleTransferPo getTransferById(String id) {
        return tranDao.getTransferById(id);
    }

    @Override
    public List<MsleTransferPo> getTransferByListId(String id) {
        return tranDao.getTransferByListId(id);
    }

    @Override
    public List<MsleTransferPo> getTransferByCenterId(String id) {
        return tranDao.getTransferByCenterId(id);
    }

    @Override
    public boolean addDriver(MsleDriverPo driverPO) {

        driverPO.setDriverId(UUID.createID());
        return tranDao.addDriver(driverPO);
    }

    @Override
    public boolean deleteDriver(String driverId) {
        return tranDao.deleteDriver(driverId);
    }

    @Override
    public boolean updateDriver(MsleDriverPo driverPO) {
        return tranDao.updateDriver(driverPO);
    }

    @Override
    public List<MsleDriverPo> queryAllDrivers(String driverHallId) {
        return tranDao.queryAllDrivers(driverHallId);
    }

    @Override
    public MsleDriverPo queryDriverById(String driverId) {
        return tranDao.queryDriverById(driverId);
    }


}
