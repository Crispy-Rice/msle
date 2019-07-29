package com.yuantu.po;

import lombok.Data;

import javax.validation.constraints.Size;

/**
 *
 *@author tai
 *@Time
 *员工表实体类
 *
 */
@Data
public class MsleStaffPo {
    @Size(min=12,max=12,message="id长度错误")
    private String staffId;
    /**
     * 员工名(登陆名)
     */
    private String staffName;
    /**
     * 员工登陆密码
     */
    private String staffPassword;
    /**
     * 员工性别
     */
    private String staffGender;
    /**
     * 员工年龄
     */
    private Integer staffAge;
    /**
     * 员工手机号
     */
    private Long staffPhone;
    /**
     * 员工职位
     */
    private String staffPosition;
    /**
     * 员工职责
     */
    private String staffResponsibility;
    /**
     * 薪资（按月）
     */
    private Double staffStrategyMonthly;
    /**
     * 薪资（计次）
     */
    private Double staffStrategyMetering;
    /**
     * 薪资（提成）
     */
    private Double staffStrategyRate;
    /**
     * 员工所属机构
     */
  //  @Size(min=12,max=12,message="员工所属机构id长度错误")
    private String staffOrganization;
    /**
     * 员工状态(在职-onjob/离职-dimission)
     */
    private String staffStatus;


}
