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
    public boolean addLoadingList(MsleLoadingListPo loadingListPo) {

        loadingListPo.setLoadingListId(UUID.creatId());
        return tranDao.addLoadingList(loadingListPo);
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

    @Override
    public boolean deleteLoadingListById(String loadingListId) {
        return tranDao.deleteLoadingListById(loadingListId);
    }

//    @Override
//    public List<MsleloadingListPo> getLoadingListByStatus(String status) {
//        return tranDao.getLoadingListByStatus(status);
//    }

//    @Override
//    public boolean updateLoadingListStatus(Integer id, String status) {
//        return tranDao.updateLoadingListStatus(id,status);
//    }


    @Override
    public boolean addReceive(MsleReceivePo receivePo) {
        receivePo.setReceiveId(UUID.creatId());
        return tranDao.addReceive(receivePo);
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
    public boolean deleteReceiveById(String receiveId) {
        return tranDao.deleteReceiveById(receiveId);
    }


    @Override
    public boolean addDisptach(MsleDispatchPo dispatchPo) {

        dispatchPo.setDispatchId(UUID.creatId());
        return tranDao.addDisptach(dispatchPo);
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
    public boolean deleteDisptachById(String disptachId) {
        return tranDao.deleteDisptachById(disptachId);
    }


    @Override
    public boolean addArrival(MsleArrivalPo arrivalPo) {
        arrivalPo.setArrivalId(UUID.creatId());
        return tranDao.addArrival(arrivalPo);
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
    public boolean deleteArrivalById(String arrivalId) {
        return tranDao.deleteArrivalById(arrivalId);
    }


    @Override
    public boolean addCar(MsleCarPo carPo) {
        carPo.setCarId(UUID.creatId());
        return tranDao.addCar(carPo);
    }

    @Override
    public boolean deleteCar(String id) {
        return tranDao.deleteCar(id);
    }

    @Override
    public boolean updateCar(MsleCarPo carPo) {
        return tranDao.updateCar(carPo);
    }

    @Override
    public List<MsleCarPo> queryAllCars(String carHallId) {
        return tranDao.queryAllCars(carHallId);
    }

    @Override
    public MsleCarPo queryCarById(String id) {
        return tranDao.queryCarById(id);
    }


    @Override
    public boolean addCenterLoad(MsleCenterLoadPo centerLoadPo) {
        centerLoadPo.setCenterLoadId(UUID.creatId());
        return tranDao.addCenterLoad(centerLoadPo);
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
    public boolean deleteCenterLoadById(String centerloadId) {
        return tranDao.deleteCenterLoadById(centerloadId);
    }


    @Override
    public boolean addTransfer(MsleTransferPo transferPo) {
        transferPo.setTransferId(UUID.creatId());
        return tranDao.addTransfer(transferPo);
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
    public boolean deleteTransferById(String transferId) {
        return tranDao.deleteTransferById(transferId);
    }

    @Override
    public boolean addDriver(MsleDriverPo driverPo) {

        driverPo.setDriverId(UUID.creatId());
        return tranDao.addDriver(driverPo);
    }

    @Override
    public boolean deleteDriver(String driverId) {
        return tranDao.deleteDriver(driverId);
    }

    @Override
    public boolean updateDriver(MsleDriverPo driverPo) {
        return tranDao.updateDriver(driverPo);
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
