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

    int insertLog(MsleLogPo msleLogPo);

    List<MsleLogPo> getLog (String date);

    List<MsleLogPo> getAllLog();
}
