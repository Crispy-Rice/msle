package com.yuantu.po.tranpo;

import lombok.Data;
import lombok.ToString;

/**
 * 营业厅装车单类
 */
@Data
@ToString
public class MsleLoadingListPO {
    private String  loadingListId;//营业厅装车记录id
    private String  loadingListLoadId;//装车id
    private String  loadingListLoadDate;//装车日期
    private String  loadingListHallNo;//营业厅id
    private String  loadingListTranNo;//汽运编号
    private String  loadingListDestination;//到达地（营业厅，中转中心）
    private String  loadingListCarno;//汽运编号
    private String  loadingListSupervisor;//监装员
    private String  loadingListSupercargo;//押运员
    private String  loadingListOrderId;//订单条形码号
    private Double  loadingListFee;//运费
    private String  loadingListStatus;//审核状态




}
