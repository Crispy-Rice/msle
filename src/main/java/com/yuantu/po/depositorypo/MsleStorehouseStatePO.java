package com.yuantu.po.depositorypo;

import lombok.Data;


public class MsleStorehouseStatePO {
    private String  storehouseStateId;//仓库位置状态对应id
    private String  storehouseStatsStorehouseId;//仓库id
    private Integer storehouseStateAreaNo;//区号
    private Integer storehouseStateLineNo;//排号
    private Integer storehouseStateShelfNo;//架号
    private Integer storehouseStatePostionNo;//位号
    private Integer storehouseStateState;//状态（空闲 占有）
    private Double  storehouseStateVolume;//体积

    public MsleStorehouseStatePO(String storehouseStateId, String storehouseStatsStorehouseId,
                                 Integer storehouseStateAreaNo, Integer storehouseStateLineNo,
                                 Integer storehouseStateShelfNo, Integer storehouseStatePostionNo, Integer storehouseStateState, Double storehouseStateVolume) {
        this.storehouseStateId = storehouseStateId;
        this.storehouseStatsStorehouseId = storehouseStatsStorehouseId;
        this.storehouseStateAreaNo = storehouseStateAreaNo;
        this.storehouseStateLineNo = storehouseStateLineNo;
        this.storehouseStateShelfNo = storehouseStateShelfNo;
        this.storehouseStatePostionNo = storehouseStatePostionNo;
        this.storehouseStateState = storehouseStateState;
        this.storehouseStateVolume = storehouseStateVolume;
    }

    public MsleStorehouseStatePO() {
    }

    public String getStorehouseStateId() {
        return storehouseStateId;
    }

    public void setStorehouseStateId(String storehouseStateId) {
        this.storehouseStateId = storehouseStateId;
    }

    public String getStorehouseStatsStorehouseId() {
        return storehouseStatsStorehouseId;
    }

    public void setStorehouseStatsStorehouseId(String storehouseStatsStorehouseId) {
        this.storehouseStatsStorehouseId = storehouseStatsStorehouseId;
    }

    public Integer getStorehouseStateAreaNo() {
        return storehouseStateAreaNo;
    }

    public void setStorehouseStateAreaNo(Integer storehouseStateAreaNo) {
        this.storehouseStateAreaNo = storehouseStateAreaNo;
    }

    public Integer getStorehouseStateLineNo() {
        return storehouseStateLineNo;
    }

    public void setStorehouseStateLineNo(Integer storehouseStateLineNo) {
        this.storehouseStateLineNo = storehouseStateLineNo;
    }

    public Integer getStorehouseStateShelfNo() {
        return storehouseStateShelfNo;
    }

    public void setStorehouseStateShelfNo(Integer storehouseStateShelfNo) {
        this.storehouseStateShelfNo = storehouseStateShelfNo;
    }

    public Integer getStorehouseStatePostionNo() {
        return storehouseStatePostionNo;
    }

    public void setStorehouseStatePostionNo(Integer storehouseStatePostionNo) {
        this.storehouseStatePostionNo = storehouseStatePostionNo;
    }

    public Integer getStorehouseStateState() {
        return storehouseStateState;
    }

    public void setStorehouseStateState(Integer storehouseStateState) {
        this.storehouseStateState = storehouseStateState;
    }

    public Double getStorehouseStateVolume() {
        return storehouseStateVolume;
    }

    public void setStorehouseStateVolume(Double storehouseStateVolume) {
        this.storehouseStateVolume = storehouseStateVolume;
    }
}
