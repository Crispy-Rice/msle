package com.yuantu.service.strategyservice;

import com.yuantu.dao.IStaffDao;
import com.yuantu.po.Msle_StaffPo;
import com.yuantu.serviceinterface.strategyinterface.IStrategyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StrategyServiceImpl implements IStrategyService {
    @Resource
    private IStaffDao iStaffDao;
    @Override
    public List<Msle_StaffPo> geAllUsers(){
        return iStaffDao.getAllStaffs();

    }

//    @Override
//    public Boolean updateUserSalary(Long staffId, Double staffStrategyMonthly
//            , Double staffStrategyMetering, Double staffStrategyRate) {
//        iStaffDao.updateStaffSalary(staffId,staffStrategyMonthly
//                ,staffStrategyMetering,staffStrategyRate);
//        return true;
//    }
}
