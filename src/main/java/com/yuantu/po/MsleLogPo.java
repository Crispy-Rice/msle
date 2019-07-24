package com.yuantu.po;

import lombok.Data;

import javax.validation.constraints.Size;

/**
 *
 *@author tai
 *@Time
 *日志表实体类
 *
 */
@Data
public class MsleLogPo
{
    @Size(min=12,max=12,message="id长度错误")
    private String logId;
    /**
     * 日志生成时间
     */
    private String logDate;
    /**
     * 日志内容
     */
    private  String logContent;
    /**
     * 操作人员
     */
    @Size(min=12,max=12,message="id长度错误")
    private  String logPeople;

}
