package com.yuantu.po;

import lombok.Data;

@Data
public class Msle_StaffPo {
    private String staffId;
    private String staffName;
    private String staffPassword;
    private String staffGender;
    private Integer staffAge;
    private Long staffPhone;
    private String staffPosition;
    private String staffResponsibility;
    private Double staffStrategyMonthly;
    private Double staffStrategyMetering;
    private Double staffStrategyRate;
    private Long staffOrganization;
    private String staffStatus;

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffPassword() {
        return staffPassword;
    }

    public void setStaffPassword(String staffPassword) {
        this.staffPassword = staffPassword;
    }

    public String getStaffGender() {
        return staffGender;
    }

    public void setStaffGender(String staffGender) {
        this.staffGender = staffGender;
    }

    public Integer getStaffAge() {
        return staffAge;
    }

    public void setStaffAge(Integer staffAge) {
        this.staffAge = staffAge;
    }

    public Long getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(Long staffPhone) {
        this.staffPhone = staffPhone;
    }

    public String getStaffPosition() {
        return staffPosition;
    }

    public void setStaffPosition(String staffPosition) {
        this.staffPosition = staffPosition;
    }

    public String getStaffResponsibility() {
        return staffResponsibility;
    }

    public void setStaffResponsibility(String staffResponsibility) {
        this.staffResponsibility = staffResponsibility;
    }

    public Double getStaffStrategyMonthly() {
        return staffStrategyMonthly;
    }

    public void setStaffStrategyMonthly(Double staffStrategyMonthly) {
        this.staffStrategyMonthly = staffStrategyMonthly;
    }

    public Double getStaffStrategyMetering() {
        return staffStrategyMetering;
    }

    public void setStaffStrategyMetering(Double staffStrategyMetering) {
        this.staffStrategyMetering = staffStrategyMetering;
    }

    public Double getStaffStrategyRate() {
        return staffStrategyRate;
    }

    public void setStaffStrategyRate(Double staffStrategyRate) {
        this.staffStrategyRate = staffStrategyRate;
    }

    public Long getStaffOrganization() {
        return staffOrganization;
    }

    public void setStaffOrganization(Long staffOrganization) {
        this.staffOrganization = staffOrganization;
    }

    public String getStaffStatus() {
        return staffStatus;
    }

    public void setStaffStatus(String staffStatus) {
        this.staffStatus = staffStatus;
    }
}
