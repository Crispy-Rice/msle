package com.yuantu.serviceinterface.constantinterface;

import com.yuantu.po.MsleConstantPo;
import com.yuantu.po.MsleLogisticsPo;
import java.util.List;

/**
 *
 *@author tai
 *@Time
 *常量管理接口
 *
 */
public interface IConstantService {
    Integer updateConstant(MsleConstantPo msleConstantPo);

    Integer insertConstant(MsleConstantPo msleConstantPo);

    MsleConstantPo getConstant(MsleConstantPo msleConstantPo);

    List<MsleLogisticsPo> getLogisticsByCity(MsleConstantPo msleConstantPo);

    List<MsleConstantPo> getAllConstants();
}
