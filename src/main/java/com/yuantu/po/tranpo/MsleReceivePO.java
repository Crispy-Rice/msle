package com.yuantu.po.tranpo;

/**
 * 中转中心到达单po类
 */
public class MsleReceivePO {
   private String  receiveId;//接收单id
   private String  receiveCenterId;//中转中心id
   private String  receiveArriveDate;//到达日期
   private String  receiveTransferId;//中转单编号
   private String  receiveDepature;//出发地
   private String  receiveArrivateState;//到达状态
   private String  receiveState;//提交状态

    public MsleReceivePO(String receiveId, String receiveCenterId,
                         String receiveArriveDate, String receiveTransferId,
                         String receiveDepature, String receiveArrivateState,
                         String receiveState) {
        this.receiveId = receiveId;
        this.receiveCenterId = receiveCenterId;
        this.receiveArriveDate = receiveArriveDate;
        this.receiveTransferId = receiveTransferId;
        this.receiveDepature = receiveDepature;
        this.receiveArrivateState = receiveArrivateState;
        this.receiveState = receiveState;
    }

    public MsleReceivePO() {
    }

    public String getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(String receiveId) {
        this.receiveId = receiveId;
    }

    public String getReceiveCenterId() {
        return receiveCenterId;
    }

    public void setReceiveCenterId(String receiveCenterId) {
        this.receiveCenterId = receiveCenterId;
    }

    public String getReceiveArriveDate() {
        return receiveArriveDate;
    }

    public void setReceiveArriveDate(String receiveArriveDate) {
        this.receiveArriveDate = receiveArriveDate;
    }

    public String getReceiveTransferId() {
        return receiveTransferId;
    }

    public void setReceiveTransferId(String receiveTransferId) {
        this.receiveTransferId = receiveTransferId;
    }

    public String getReceiveDepature() {
        return receiveDepature;
    }

    public void setReceiveDepature(String receiveDepature) {
        this.receiveDepature = receiveDepature;
    }

    public String getReceiveArrivateState() {
        return receiveArrivateState;
    }

    public void setReceiveArrivateState(String receiveArrivateState) {
        this.receiveArrivateState = receiveArrivateState;
    }

    public String getReceiveState() {
        return receiveState;
    }

    public void setReceiveState(String receiveState) {
        this.receiveState = receiveState;
    }
}
