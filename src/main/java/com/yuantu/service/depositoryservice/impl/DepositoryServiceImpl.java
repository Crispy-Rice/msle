package com.yuantu.service.depositoryservice.impl;

import com.yuantu.dao.depositorydao.IDepositoryDao;
import com.yuantu.po.depositorypo.MsleStorehousePo;
import com.yuantu.service.depositoryservice.IDepositoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DepositoryServiceImpl implements IDepositoryService {

    @Resource
    private IDepositoryDao depositoryDao;

    @Override
    public List<MsleStorehousePo> getAreasById(String id) {
        return depositoryDao.getAreasById(id);
    }

    @Override
    public MsleStorehousePo getAlertLineById(String storehouseid, Integer areaid) {
        return depositoryDao.getAlertLineById(storehouseid, areaid);
    }

    /**
     *
     * @param storehouseid 仓库ID
     * @param areaid 区域id
     * @param alertline 修改的预警线
     * @return 0 预警线数值错误 1 数据库插入成功 2 数据库插入失败
     */

    @Override
    public int updateAlertLineById(String storehouseid, Integer areaid, double alertline) {
        if (alertline < 0 || alertline > 1) {
            return 0;
        } else {
            if (depositoryDao.updateAlertLineById(storehouseid, areaid, alertline)) {
                return 1;
            } else {
                return 0;
            }
        }

    }

    @Override
    public String getPositionState(String storehouseId, Integer storehouseStatePostionNo, Integer storehouseStateAreaNo, Integer storehouseStateLineNo, Integer storehouseStateShelfNo) {
        return depositoryDao.getPositionState(storehouseId, storehouseStatePostionNo,
                storehouseStateAreaNo, storehouseStateLineNo, storehouseStateShelfNo);
    }

    @Override
    public boolean updatePositionState(String storehouseStateState, String storehouseId, Integer storehouseStatePostionNo, Integer storehouseStateAreaNo, Integer storehouseStateLineNo, Integer storehouseStateShelfNo) {
        return depositoryDao.updatePositionState(storehouseStateState, storehouseId,
                storehouseStatePostionNo, storehouseStateAreaNo,
                storehouseStateLineNo, storehouseStateShelfNo);
    }
}
