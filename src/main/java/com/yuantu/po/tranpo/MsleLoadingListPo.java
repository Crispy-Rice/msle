package com.yuantu.po.tranpo;

import lombok.Data;
import lombok.ToString;

/**
 * @ClassName MsleLoadingListPo
 * @Description //营业厅装车单po类
 * @Author  yukun
 * @Date  2019/7/23
 * @Version  1.0
 **/
@Data
@ToString
public class MsleLoadingListPo {
    /**
     * 营业厅装车记录id
     */

    private String  loadingListId;
    /**
     * 装车id
     */
    private String  loadingListLoadId;
    /**
     * 装车日期
     */
    private String  loadingListLoadDate;
    /**
     * 营业厅id
     */
    private String  loadingListHallNo;
    /**
     * 汽运编号
     */
    private String  loadingListTranNo;
    /**
     * 到达地（营业厅，中转中心）
     */
    private String  loadingListDestination;
    /**
     * 汽运编号
     */
    private String  loadingListCarno;
    /**
     * 监装员
     */
    private String  loadingListSupervisor;
    /**
     * 押运员
     */
    private String  loadingListSupercargo;
    /**
     * 订单条形码号
     */
    private String  loadingListOrderId;
    /**
     * 运费
     */
    private Double  loadingListFee;
    /**
     * 审核状态
     */
    private String  loadingListStatus;




}
