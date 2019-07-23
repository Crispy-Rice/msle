package com.yuantu.po.tranpo;

import lombok.Data;
import lombok.ToString;

/**
 * @ClassName MsleArrivalPo
 * @Description //到达单类po
 * @Author  yukun
 * @Date  2019/7/23
 * @Version  1.0
 **/
@Data
@ToString
public class MsleArrivalPo {
    /**
     * /到达单id
     */
    private String  arrivalId;
    /**
     * 到达日期
     */
    private String  arrivalArriveDate;
    /**
     * 中转单id
     */
    private String  arrivalTransferId;
    /**
     * 出发地
     */
    private String  arrivalDeparture;
    /**
     * 货物到达状态
     */
    private String  arrivalState;
    /**
     * 到达单状态
     */
    private String  arrivalStatus;
    /**
     * 营业厅id
     */
    private String  arrivalHallId;

    public MsleArrivalPo(String arrivalId, String arrivalArriveDate,
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

    public MsleArrivalPo() {
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
