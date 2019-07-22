package com.yuantu.po.depositorypo;

/**
 * 库存po类
 */
public class MsleReservePO {
  private String   reserveId;//库存id
  private String   reserveStorehouseId;//仓库id
  private String   reserveExpressNo;//快递编号
  private String   reserveEntryDate;//入库日期
  private String   reserveDestination;//目的地
  private Integer  reserveAreaNo;//区号
  private Integer  reserveLineNo;//排号
  private Integer  reserveShelfNo;//架号
  private Integer  reservePositionNo;//位号
  private String   reserveCheckStatus;//盘点状态
  private String   reserveStatus;//审核状态

    public MsleReservePO(String reserveId, String reserveStorehouseId,
                         String reserveExpressNo, String reserveEntryDate,
                         String reserveDestination, Integer reserveAreaNo,
                         Integer reserveLineNo, Integer reserveShelfNo,
                         Integer reservePositionNo, String reserveCheckStatus,
                         String reserveStatus) {
        this.reserveId = reserveId;
        this.reserveStorehouseId = reserveStorehouseId;
        this.reserveExpressNo = reserveExpressNo;
        this.reserveEntryDate = reserveEntryDate;
        this.reserveDestination = reserveDestination;
        this.reserveAreaNo = reserveAreaNo;
        this.reserveLineNo = reserveLineNo;
        this.reserveShelfNo = reserveShelfNo;
        this.reservePositionNo = reservePositionNo;
        this.reserveCheckStatus = reserveCheckStatus;
        this.reserveStatus = reserveStatus;
    }

    public MsleReservePO() {
    }

    public String getReserveId() {
        return reserveId;
    }

    public void setReserveId(String reserveId) {
        this.reserveId = reserveId;
    }

    public String getReserveStorehouseId() {
        return reserveStorehouseId;
    }

    public void setReserveStorehouseId(String reserveStorehouseId) {
        this.reserveStorehouseId = reserveStorehouseId;
    }

    public String getReserveExpressNo() {
        return reserveExpressNo;
    }

    public void setReserveExpressNo(String reserveExpressNo) {
        this.reserveExpressNo = reserveExpressNo;
    }

    public String getReserveEntryDate() {
        return reserveEntryDate;
    }

    public void setReserveEntryDate(String reserveEntryDate) {
        this.reserveEntryDate = reserveEntryDate;
    }

    public String getReserveDestination() {
        return reserveDestination;
    }

    public void setReserveDestination(String reserveDestination) {
        this.reserveDestination = reserveDestination;
    }

    public Integer getReserveAreaNo() {
        return reserveAreaNo;
    }

    public void setReserveAreaNo(Integer reserveAreaNo) {
        this.reserveAreaNo = reserveAreaNo;
    }

    public Integer getReserveLineNo() {
        return reserveLineNo;
    }

    public void setReserveLineNo(Integer reserveLineNo) {
        this.reserveLineNo = reserveLineNo;
    }

    public Integer getReserveShelfNo() {
        return reserveShelfNo;
    }

    public void setReserveShelfNo(Integer reserveShelfNo) {
        this.reserveShelfNo = reserveShelfNo;
    }

    public Integer getReservePositionNo() {
        return reservePositionNo;
    }

    public void setReservePositionNo(Integer reservePositionNo) {
        this.reservePositionNo = reservePositionNo;
    }

    public String getReserveCheckStatus() {
        return reserveCheckStatus;
    }

    public void setReserveCheckStatus(String reserveCheckStatus) {
        this.reserveCheckStatus = reserveCheckStatus;
    }

    public String getReserveStatus() {
        return reserveStatus;
    }

    public void setReserveStatus(String reserveStatus) {
        this.reserveStatus = reserveStatus;
    }
}
