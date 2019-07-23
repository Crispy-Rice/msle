package com.yuantu.serviceinterface.strategyinterface;

import com.yuantu.po.MsleStaffPo;

import java.util.List;

/**
 *
 *@author tai
 *@Time
 *策略接口
 *
 */
public interface IStrategyService {
    List<MsleStaffPo> geAllUsers();

}
