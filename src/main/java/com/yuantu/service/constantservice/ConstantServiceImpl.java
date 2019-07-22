package com.yuantu.service.constantservice;

import com.yuantu.dao.IConstantDao;
import com.yuantu.dao.ILogisticsDao;
import com.yuantu.po.Msle_ConstantPo;
import com.yuantu.po.Msle_LogisticsPo;
import com.yuantu.serviceinterface.constantinterface.IConstantService;
import com.yuantu.util.UUID;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ConstantServiceImpl implements IConstantService {
    @Resource
    private IConstantDao  iConstantDao;
    @Resource
    private ILogisticsDao iLogisticsDao;

    @Override
    public Boolean updateConstant(Msle_ConstantPo msle_constantPo) {

        iConstantDao.updateConstant(msle_constantPo);
        return true;
    }

    @Override
    public Boolean insertConstant(Msle_ConstantPo msle_constantPo) {
        String Id= UUID.createID();
        msle_constantPo.setConstantId(Id);
        iConstantDao.insertConstant(msle_constantPo);
        return true;
    }

    @Override
    public Msle_ConstantPo getConstant(Msle_ConstantPo msle_constantPo) {
        return iConstantDao.getConstant( msle_constantPo);
    }


//    public List<Msle_LogisticsPo> getLogisticsInformation(Msle_ConstantPo msle_constantPo) {
//        return iLogisticsDao.getLogisticsByCity(msle_constantPo);
//    }

    @Override
    public List<Msle_LogisticsPo> getLogisticsByCity(Msle_ConstantPo msle_constantPo) {
        return iLogisticsDao.getLogisticsByCity(msle_constantPo);
    }
}
