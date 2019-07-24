package com.yuantu.service.strategyservice;

import com.yuantu.dao.IStaffDao;
import com.yuantu.po.MsleStaffPo;
import com.yuantu.serviceinterface.strategyinterface.IStrategyService;

import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

/**
 *
 *@author tai
 *@Time
 *策略管理接口是实现类
 *
 */
@Service
public class StrategyServiceImpl implements IStrategyService {
    @Resource
    private IStaffDao iStaffDao;

    @Override
    public List<MsleStaffPo> geAllUsers(){
        return iStaffDao.getAllStaffs();
    }
}
