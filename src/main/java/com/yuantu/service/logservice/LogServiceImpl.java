package com.yuantu.service.logservice;

import com.yuantu.dao.ILogDao;
import com.yuantu.po.MsleLogPo;
import com.yuantu.serviceinterface.loginterface.ILogService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 *
 *@author tai
 *@Time
 *日志管理接口是实现类
 *
 */
@Service
public class LogServiceImpl implements ILogService {
    @Resource
    private ILogDao iLogDao;

    @Override
    public Integer insertLog(MsleLogPo msleLogPo) {
        return iLogDao.insertLog(msleLogPo);
    }

    /**
     * date=date+"%"因为数据库中日期和前端传入来的日期格式不同
     * 用次表达式使sql语句变为模糊查询
     * @param date
     * @return
     */
    @Override
    public List<MsleLogPo> getLog(String date) {
        date=date+"%";
        return iLogDao.getLog(date);
    }

    @Override
    public List<MsleLogPo> getAllLog() {
        return iLogDao.getAllLog();
    }


}
