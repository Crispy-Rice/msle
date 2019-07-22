package com.yuantu.serviceinterface.constantinterface;

import com.yuantu.po.Msle_ConstantPo;
import com.yuantu.po.Msle_LogisticsPo;

import java.util.List;

public interface IConstantService {
    public Boolean updateConstant(Msle_ConstantPo msle_constantPo);

    public Boolean insertConstant(Msle_ConstantPo msle_constantPo);

    public Msle_ConstantPo getConstant(Msle_ConstantPo msle_constantPo);

//    public List<Msle_LogisticsPo> getLogisticsInformation(Msle_ConstantPo msle_constantPo);

    List<Msle_LogisticsPo> getLogisticsByCity(Msle_ConstantPo msle_constantPo);
}
