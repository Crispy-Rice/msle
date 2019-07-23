package com.yuantu.serviceinterface.loginterface;

import com.yuantu.po.MsleLogPo;

import java.util.List;

/**
 *
 *@author tai
 *@Time
 *日志管理接口
 *
 */
public interface ILogService {
    Integer insertLog(MsleLogPo msleLogPo);
    List<MsleLogPo> getLog (String date);
}
