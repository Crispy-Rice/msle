package com.yuantu.service.staffservice;

import com.yuantu.dao.IStaffDao;
import com.yuantu.po.MsleStaffPo;
import com.yuantu.serviceinterface.staffinterface.IStaffService;
import com.yuantu.util.UUID;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 *
 *@author tai
 *@Time
 *员工管理接口是实现类
 *
 */
@Service
public class StaffServiceImpl implements IStaffService {
    @Resource
    private IStaffDao iStaffDao;

    @Override
    public List<MsleStaffPo> getPersonnelByOrganization(String organizationId) {
        return iStaffDao.getPersonnelByOrganization(organizationId);
    }

    @Override
    public MsleStaffPo getPersonnelInformation(String staffId) {
        return iStaffDao.getPersonnelInformation(staffId);
    }

    @Override
    public List<MsleStaffPo> getAllStaffs() {
        return iStaffDao.getAllStaffs();
    }

    @Override
    public List<MsleStaffPo> getAllStaffsOnjob() {
        return iStaffDao.getAllStaffsOnjob();
    }

    @Override
    public Integer updateStaffSalary(MsleStaffPo msleStaffPo) {
        return iStaffDao.updateStaffSalary(msleStaffPo);
    }

    @Override
    public MsleStaffPo getStaffSalary(String staffId) {
        return iStaffDao.getStaffSalary(staffId);
    }

    @Override
    public Integer updateStaffStatus(String staffId) {
        return iStaffDao.updateStaffStatus(staffId);
    }

    @Override
    public Integer addStaff(MsleStaffPo msleStaffPo) {
        String id= UUID.creatId();
        msleStaffPo.setStaffId(id);
        return iStaffDao.addStaff(msleStaffPo);
    }

    @Override
    public Integer updatePersonalInformation(MsleStaffPo msleStaffPo) {
        return iStaffDao.updatePersonalInformation(msleStaffPo);
    }

    @Override
    public Integer updateSalaryByPosition(MsleStaffPo msleStaffPo) {
        return iStaffDao.updateSalaryByPosition(msleStaffPo);
    }
}
