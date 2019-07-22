package com.yuantu.po.depositorypo;

/**
 * 入库单PO类
 */
public class MsleGoDownEntryPO {
    private String  godownentryExpressNo;//快递编号
    private String  godownentryStorehouseId;//仓库id
    private String  godownentryId;//入库单条目id
    private String  godownentryGodownentryId;//入库单id
    private String  godownenrtyDestination;//目的地
    private String  godownenrtyEntryDate;//入库日期
    private Integer godownentryAreaNo;//区号
    private Integer godownentryLineNo;//行号
    private Integer godownentryShelfNo;//架号
    private Integer godownentryPositionNo;//位号
    private String  godownentryStatus;//审核状态

    public MsleGoDownEntryPO(String godownentryExpressNo, String godownentryStorehouseId, String godownentryId, String godownentryGodownentryId, String godownenrtyDestination, String godownenrtyEntryDate, Integer godownentryAreaNo, Integer godownentryLineNo, Integer godownentryShelfNo, Integer godownentryPositionNo, String godownentryStatus) {
        this.godownentryExpressNo = godownentryExpressNo;
        this.godownentryStorehouseId = godownentryStorehouseId;
        this.godownentryId = godownentryId;
        this.godownentryGodownentryId = godownentryGodownentryId;
        this.godownenrtyDestination = godownenrtyDestination;
        this.godownenrtyEntryDate = godownenrtyEntryDate;
        this.godownentryAreaNo = godownentryAreaNo;
        this.godownentryLineNo = godownentryLineNo;
        this.godownentryShelfNo = godownentryShelfNo;
        this.godownentryPositionNo = godownentryPositionNo;
        this.godownentryStatus = godownentryStatus;
    }

    public MsleGoDownEntryPO() {
    }

    public String getGodownentryExpressNo() {
        return godownentryExpressNo;
    }

    public void setGodownentryExpressNo(String godownentryExpressNo) {
        this.godownentryExpressNo = godownentryExpressNo;
    }

    public String getGodownentryStorehouseId() {
        return godownentryStorehouseId;
    }

    public void setGodownentryStorehouseId(String godownentryStorehouseId) {
        this.godownentryStorehouseId = godownentryStorehouseId;
    }

    public String getGodownentryId() {
        return godownentryId;
    }

    public void setGodownentryId(String godownentryId) {
        this.godownentryId = godownentryId;
    }

    public String getGodownentryGodownentryId() {
        return godownentryGodownentryId;
    }

    public void setGodownentryGodownentryId(String godownentryGodownentryId) {
        this.godownentryGodownentryId = godownentryGodownentryId;
    }

    public String getGodownenrtyDestination() {
        return godownenrtyDestination;
    }

    public void setGodownenrtyDestination(String godownenrtyDestination) {
        this.godownenrtyDestination = godownenrtyDestination;
    }

    public String getGodownenrtyEntryDate() {
        return godownenrtyEntryDate;
    }

    public void setGodownenrtyEntryDate(String godownenrtyEntryDate) {
        this.godownenrtyEntryDate = godownenrtyEntryDate;
    }

    public Integer getGodownentryAreaNo() {
        return godownentryAreaNo;
    }

    public void setGodownentryAreaNo(Integer godownentryAreaNo) {
        this.godownentryAreaNo = godownentryAreaNo;
    }

    public Integer getGodownentryLineNo() {
        return godownentryLineNo;
    }

    public void setGodownentryLineNo(Integer godownentryLineNo) {
        this.godownentryLineNo = godownentryLineNo;
    }

    public Integer getGodownentryShelfNo() {
        return godownentryShelfNo;
    }

    public void setGodownentryShelfNo(Integer godownentryShelfNo) {
        this.godownentryShelfNo = godownentryShelfNo;
    }

    public Integer getGodownentryPositionNo() {
        return godownentryPositionNo;
    }

    public void setGodownentryPositionNo(Integer godownentryPositionNo) {
        this.godownentryPositionNo = godownentryPositionNo;
    }

    public String getGodownentryStatus() {
        return godownentryStatus;
    }

    public void setGodownentryStatus(String godownentryStatus) {
        this.godownentryStatus = godownentryStatus;
    }
}
