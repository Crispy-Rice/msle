package com.yuantu.po.tranpo;

/**
 * 中转中心装车单po类
 */
public class MsleCenterLoadPO {
    private String  centerLoadId;//中转中心装车单记录id
    private String  centerLoadCenterId;//中转中心id
    private String  centerLoadLoadId;//中转中心装车单id
    private String  centerLoadDate;//装车日期
    private String  centerLoadTranno;//汽运编号
    private Integer centerLoadDsetination;//到达地（营业厅）
    private Integer centerLoadCarNo;//车辆代号
    private String  centerLoadSupervisor;//监装员
    private String  centerLoadSupercargo;//押运员
    private String  centerLoadOrder;//装车单订单条形码号（10位）
    private Double  centerLoadFee;//运费
    private String  centerLoadStatus;//装车单审核状态（草稿，提交，审批后）

    public MsleCenterLoadPO(String centerLoadId, String centerLoadCenterId,
                            String centerLoadLoadId, String centerLoadDate,
                            String centerLoadTranno, Integer centerLoadDsetination,
                            Integer centerLoadCarNo, String centerLoadSupervisor,
                            String centerLoadSupercargo, String centerLoadOrder,
                            Double centerLoadFee, String centerLoadStatus) {
        this.centerLoadId = centerLoadId;
        this.centerLoadCenterId = centerLoadCenterId;
        this.centerLoadLoadId = centerLoadLoadId;
        this.centerLoadDate = centerLoadDate;
        this.centerLoadTranno = centerLoadTranno;
        this.centerLoadDsetination = centerLoadDsetination;
        this.centerLoadCarNo = centerLoadCarNo;
        this.centerLoadSupervisor = centerLoadSupervisor;
        this.centerLoadSupercargo = centerLoadSupercargo;
        this.centerLoadOrder = centerLoadOrder;
        this.centerLoadFee = centerLoadFee;
        this.centerLoadStatus = centerLoadStatus;
    }

    public MsleCenterLoadPO() {
    }

    public String getCenterLoadId() {
        return centerLoadId;
    }

    public void setCenterLoadId(String centerLoadId) {
        this.centerLoadId = centerLoadId;
    }

    public String getCenterLoadCenterId() {
        return centerLoadCenterId;
    }

    public void setCenterLoadCenterId(String centerLoadCenterId) {
        this.centerLoadCenterId = centerLoadCenterId;
    }

    public String getCenterLoadLoadId() {
        return centerLoadLoadId;
    }

    public void setCenterLoadLoadId(String centerLoadLoadId) {
        this.centerLoadLoadId = centerLoadLoadId;
    }

    public String getCenterLoadDate() {
        return centerLoadDate;
    }

    public void setCenterLoadDate(String centerLoadDate) {
        this.centerLoadDate = centerLoadDate;
    }

    public String getCenterLoadTranno() {
        return centerLoadTranno;
    }

    public void setCenterLoadTranno(String centerLoadTranno) {
        this.centerLoadTranno = centerLoadTranno;
    }

    public Integer getCenterLoadDsetination() {
        return centerLoadDsetination;
    }

    public void setCenterLoadDsetination(Integer centerLoadDsetination) {
        this.centerLoadDsetination = centerLoadDsetination;
    }

    public Integer getCenterLoadCarNo() {
        return centerLoadCarNo;
    }

    public void setCenterLoadCarNo(Integer centerLoadCarNo) {
        this.centerLoadCarNo = centerLoadCarNo;
    }

    public String getCenterLoadSupervisor() {
        return centerLoadSupervisor;
    }

    public void setCenterLoadSupervisor(String centerLoadSupervisor) {
        this.centerLoadSupervisor = centerLoadSupervisor;
    }

    public String getCenterLoadSupercargo() {
        return centerLoadSupercargo;
    }

    public void setCenterLoadSupercargo(String centerLoadSupercargo) {
        this.centerLoadSupercargo = centerLoadSupercargo;
    }

    public String getCenterLoadOrder() {
        return centerLoadOrder;
    }

    public void setCenterLoadOrder(String centerLoadOrder) {
        this.centerLoadOrder = centerLoadOrder;
    }

    public Double getCenterLoadFee() {
        return centerLoadFee;
    }

    public void setCenterLoadFee(Double centerLoadFee) {
        this.centerLoadFee = centerLoadFee;
    }

    public String getCenterLoadStatus() {
        return centerLoadStatus;
    }

    public void setCenterLoadStatus(String centerLoadStatus) {
        this.centerLoadStatus = centerLoadStatus;
    }
}
