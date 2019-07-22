package com.yuantu.po.tranpo;

/**
 * 中转单PO类
 */
public class MsleTransferPO {
    private String  transferId;//中转单记录id
    private String  transferTransferId;//中转单id
    private String  transferNo;//中转中心编号
    private String  transferDate;//到达日期
    private String  transferShipment;//转运方式
    private String  transferShipmentNo;//汽运号，航班号等
    private String  transferDeparture;//出发地
    private String  transferDestination;//目的地
    private String  transferContainerNo;//货柜号
    private String  transferSupervisor;//监装员
    private String  transferOrderId;//订单号
    private Double  transferFee;//运费
    private String  transferStatus;//审核状态

    public MsleTransferPO(String transferId, String transferTransferId,
                          String transferNo, String transferDate,
                          String transferShipment, String transferShipmentNo,
                          String transferDeparture, String transferDestination,
                          String transferContainerNo, String transferSupervisor,
                          String transferOrderId, Double transferFee,
                          String transferStatus) {
        this.transferId = transferId;
        this.transferTransferId = transferTransferId;
        this.transferNo = transferNo;
        this.transferDate = transferDate;
        this.transferShipment = transferShipment;
        this.transferShipmentNo = transferShipmentNo;
        this.transferDeparture = transferDeparture;
        this.transferDestination = transferDestination;
        this.transferContainerNo = transferContainerNo;
        this.transferSupervisor = transferSupervisor;
        this.transferOrderId = transferOrderId;
        this.transferFee = transferFee;
        this.transferStatus = transferStatus;
    }

    public MsleTransferPO() {
    }

    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }

    public String getTransferTransferId() {
        return transferTransferId;
    }

    public void setTransferTransferId(String transferTransferId) {
        this.transferTransferId = transferTransferId;
    }

    public String getTransferNo() {
        return transferNo;
    }

    public void setTransferNo(String transferNo) {
        this.transferNo = transferNo;
    }

    public String getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(String transferDate) {
        this.transferDate = transferDate;
    }

    public String getTransferShipment() {
        return transferShipment;
    }

    public void setTransferShipment(String transferShipment) {
        this.transferShipment = transferShipment;
    }

    public String getTransferShipmentNo() {
        return transferShipmentNo;
    }

    public void setTransferShipmentNo(String transferShipmentNo) {
        this.transferShipmentNo = transferShipmentNo;
    }

    public String getTransferDeparture() {
        return transferDeparture;
    }

    public void setTransferDeparture(String transferDeparture) {
        this.transferDeparture = transferDeparture;
    }

    public String getTransferDestination() {
        return transferDestination;
    }

    public void setTransferDestination(String transferDestination) {
        this.transferDestination = transferDestination;
    }

    public String getTransferContainerNo() {
        return transferContainerNo;
    }

    public void setTransferContainerNo(String transferContainerNo) {
        this.transferContainerNo = transferContainerNo;
    }

    public String getTransferSupervisor() {
        return transferSupervisor;
    }

    public void setTransferSupervisor(String transferSupervisor) {
        this.transferSupervisor = transferSupervisor;
    }

    public String getTransferOrderId() {
        return transferOrderId;
    }

    public void setTransferOrderId(String transferOrderId) {
        this.transferOrderId = transferOrderId;
    }

    public Double getTransferFee() {
        return transferFee;
    }

    public void setTransferFee(Double transferFee) {
        this.transferFee = transferFee;
    }

    public String getTransferStatus() {
        return transferStatus;
    }

    public void setTransferStatus(String transferStatus) {
        this.transferStatus = transferStatus;
    }
}
