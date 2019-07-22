package com.yuantu.po;

import lombok.Data;

import javax.validation.constraints.NotNull;

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
    private  String logPeople;

}

