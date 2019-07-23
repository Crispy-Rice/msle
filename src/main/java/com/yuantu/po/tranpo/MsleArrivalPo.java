package com.yuantu.po.tranpo;

import lombok.Data;
import lombok.ToString;

/**
 * @ClassName MslearrivalPo
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
    private String arrivalId;
    /**
     * 到达日期
     */
    private String arrivalArriveDate;
    /**
     * 中转单id
     */
    private String arrivalTransferId;
    /**
     * 出发地
     */
    private String arrivalDeparture;
    /**
     * 货物到达状态
     */
    private String arrivalState;
    /**
     * 到达单状态
     */
    private String arrivalStatus;
    /**
     * 营业厅id
     */
    private String arrivalHallId;

}