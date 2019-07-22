package com.yuantu.po.tranpo;



public class MsleDriverPO {
   private String  driverId;//司机id
   private String  driverNo;//司机编号
   private String  driverName;//姓名
   private String  driverBirthdate;//生日
   private String  driverIDNum;//身份证号
   private String  driverPhone;//手机号
   private String  driverCarUnit;//车辆单位
   private String  driverSex;//性别
   private String  driverDue;//行驶证期限
   private String  driverHallId;//营业厅id
   private String  driverStatus;//空闲状态

    public MsleDriverPO(String driverId, String driverNo, String driverName,
                        String driverBirthdate, String driverIDNum,
                        String driverPhone, String driverCarUnit,
                        String driverSex, String driverDue, String driverHallId,
                        String driverStatus) {
        this.driverId = driverId;
        this.driverNo = driverNo;
        this.driverName = driverName;
        this.driverBirthdate = driverBirthdate;
        this.driverIDNum = driverIDNum;
        this.driverPhone = driverPhone;
        this.driverCarUnit = driverCarUnit;
        this.driverSex = driverSex;
        this.driverDue = driverDue;
        this.driverHallId = driverHallId;
        this.driverStatus = driverStatus;
    }

    public MsleDriverPO() {
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getDriverNo() {
        return driverNo;
    }

    public void setDriverNo(String driverNo) {
        this.driverNo = driverNo;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverBirthdate() {
        return driverBirthdate;
    }

    public void setDriverBirthdate(String driverBirthdate) {
        this.driverBirthdate = driverBirthdate;
    }

    public String getDriverIDNum() {
        return driverIDNum;
    }

    public void setDriverIDNum(String driverIDNum) {
        this.driverIDNum = driverIDNum;
    }

    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }

    public String getDriverCarUnit() {
        return driverCarUnit;
    }

    public void setDriverCarUnit(String driverCarUnit) {
        this.driverCarUnit = driverCarUnit;
    }

    public String getDriverSex() {
        return driverSex;
    }

    public void setDriverSex(String driverSex) {
        this.driverSex = driverSex;
    }

    public String getDriverDue() {
        return driverDue;
    }

    public void setDriverDue(String driverDue) {
        this.driverDue = driverDue;
    }

    public String getDriverHallId() {
        return driverHallId;
    }

    public void setDriverHallId(String driverHallId) {
        this.driverHallId = driverHallId;
    }

    public String getDriverStatus() {
        return driverStatus;
    }

    public void setDriverStatus(String driverStatus) {
        this.driverStatus = driverStatus;
    }
}
