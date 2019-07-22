package com.yuantu.service.depositoryservice;


import com.yuantu.po.depositorypo.MsleStorehousePO;

import java.util.List;

public interface IDepositoryService {
    List<MsleStorehousePO> getAreasById(String id);

    MsleStorehousePO getAlertLineById(String storehouseId, Integer areaId);

    int updateAlertLineById(String storehouseId,Integer areaId,double alertline);

    String getPositionState(String storehouseId, Integer storehouseStatePostionNo,
                                               Integer storehouseStateAreaNo, Integer storehouseStateLineNo,
                                               Integer storehouseStateShelfNo);

    boolean updatePositionState(String storehouseStateState, String storehouseId, Integer storehouseStatePostionNo,
                                Integer storehouseStateAreaNo, Integer storehouseStateLineNo,
                                Integer storehouseStateShelfNo);


}
