package com.yuantu.service.logservice;

import com.yuantu.dao.ILogDao;
import com.yuantu.po.MsleLogPo;
import com.yuantu.serviceinterface.loginterface.ILogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LogServiceImpl implements ILogService {

    @Resource
    private ILogDao iLogDao;
    @Override
    public void insertLog(MsleLogPo MsleLogPo) {
        iLogDao.insertLog(MsleLogPo);
    }
}