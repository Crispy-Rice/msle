package com.yuantu.service.constantservice;

import com.yuantu.dao.IConstantDao;
import com.yuantu.dao.ILogisticsDao;
import com.yuantu.po.MsleConstantPo;
import com.yuantu.po.MsleLogisticsPo;
import com.yuantu.serviceinterface.constantinterface.IConstantService;
import com.yuantu.util.UUID;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 *
 *@author tai
 *@Time
 *常量管理接口是实现类
 *
 */
@Service
public class ConstantServiceImpl implements IConstantService {
    @Resource
    private IConstantDao iConstantDao;
    @Resource
    private ILogisticsDao iLogisticsDao;

    @Override
    public Integer updateConstant(MsleConstantPo msleConstantPo) {
        return iConstantDao.updateConstant(msleConstantPo);
    }

    @Override
    public Integer insertConstant( MsleConstantPo msleConstantPo) {
        String id= UUID.creatId();
        msleConstantPo.setConstantId(id);
        return iConstantDao.insertConstant(msleConstantPo);
    }

    @Override
    public MsleConstantPo getConstant(MsleConstantPo msleConstantPo) {
        return iConstantDao.getConstant(msleConstantPo);
    }

    @Override
    public List<MsleLogisticsPo> getLogisticsByCity(MsleConstantPo msleConstantPo) {
        return iLogisticsDao.getLogisticsByCity(msleConstantPo);
    }

    @Override
    public List<MsleConstantPo> getAllConstants(){
        return iConstantDao.getAllConstants();
    }
}

