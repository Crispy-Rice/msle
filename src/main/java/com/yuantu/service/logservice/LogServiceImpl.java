package com.yuantu.service.logservice;

import com.yuantu.dao.ILogDao;
import com.yuantu.po.Msle_LogPo;
import com.yuantu.serviceinterface.loginterface.ILogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LogServiceImpl implements ILogService {

    @Resource
    private ILogDao iLogDao;
    @Override
    public void insertLog(Msle_LogPo msle_LogPo) {
        iLogDao.insertLog(msle_LogPo);
    }
}