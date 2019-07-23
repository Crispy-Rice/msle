package com.yuantu.po;

import lombok.Data;

import javax.validation.constraints.Size;

/**
 *
 *@author tai
 *@Time
 *机构表实体类
 *
 */
@Data
public class MsleOrganizationPo {
    @Size(min=12,max=12,message="id长度错误")
    private String organizationId;
    /**
     * 机构名
     */
    private String organizationName;
    /**
     * 机构类型(营业厅，中转中心等)
     */
    private String organizationType;
    /**
     * 机构所属城市
     */
    private String organizationCity;
}
