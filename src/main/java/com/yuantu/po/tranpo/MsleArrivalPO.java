package com.yuantu.po.tranpo;

/**
 * 营业厅到达单类PO
 */
public class MsleArrivalPO {
    private String  arrivalId;//到达单id
    private String  arrivalArriveDate;//到达日期
    private String  arrivalTransferId;//中转单id
    private String  arrivalDeparture;//出发地
    private String  arrivalState;//货物到达状态
    private String  arrivalStatus;//到达单状态
    private String  arrivalHallId;//营业厅id

    public MsleArrivalPO(String arrivalId, String arrivalArriveDate,
                         String arrivalTransferId, String arrivalDeparture,
                         String arrivalState, String arrivalStatus,
                         String arrivalHallId) {
        this.arrivalId = arrivalId;
        this.arrivalArriveDate = arrivalArriveDate;
        this.arrivalTransferId = arrivalTransferId;
        this.arrivalDeparture = arrivalDeparture;
        this.arrivalState = arrivalState;
        this.arrivalStatus = arrivalStatus;
        this.arrivalHallId = arrivalHallId;
    }

    public MsleArrivalPO() {
    }

    public String getArrivalId() {
        return arrivalId;
    }

    public void setArrivalId(String arrivalId) {
        this.arrivalId = arrivalId;
    }


    public String getArrivalArriveDate() {
        return arrivalArriveDate;
    }

    public void setArrivalArriveDate(String arrivalArriveDate) {
        this.arrivalArriveDate = arrivalArriveDate;
    }

    public String getArrivalTransferId() {
        return arrivalTransferId;
    }

    public void setArrivalTransferId(String arrivalTransferId) {
        this.arrivalTransferId = arrivalTransferId;
    }

    public String getArrivalDeparture() {
        return arrivalDeparture;
    }

    public void setArrivalDeparture(String arrivalDeparture) {
        this.arrivalDeparture = arrivalDeparture;
    }

    public String getArrivalState() {
        return arrivalState;
    }

    public void setArrivalState(String arrivalState) {
        this.arrivalState = arrivalState;
    }

    public String getArrivalStatus() {
        return arrivalStatus;
    }

    public void setArrivalStatus(String arrivalStatus) {
        this.arrivalStatus = arrivalStatus;
    }

    public String getArrivalHallId() {
        return arrivalHallId;
    }

    public void setArrivalHallId(String arrivalHallId) {
        this.arrivalHallId = arrivalHallId;
    }
}
