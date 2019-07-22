package com.yuantu.service.staffservice;

import com.yuantu.dao.IStaffDao;
import com.yuantu.po.Msle_StaffPo;
import com.yuantu.serviceinterface.staffinterface.IStaffService;
import com.yuantu.util.UUID;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StaffServiceImpl implements IStaffService {
    @Resource
    private IStaffDao iStaffDao;
    @Override
    public Msle_StaffPo getPersonnelInformation(String staffId) {
        return iStaffDao.getPersonnelInformation(staffId);
    }

    @Override
    public List<Msle_StaffPo> getAllStaffs() {
        return iStaffDao.getAllStaffs();
    }

    @Override
    public List<Msle_StaffPo> getAllStaffsOnjob() {
        return iStaffDao.getAllStaffsOnjob();
    }

    @Override
    public Boolean updateStaffSalary(Msle_StaffPo msle_staffPo) {
        iStaffDao.updateStaffSalary(msle_staffPo);
        return true;
    }

    @Override
    public Msle_StaffPo getStaffSalary(String staffId) {
        return iStaffDao.getStaffSalary(staffId);
    }

    @Override
    public Boolean updateStaffStatus(String staffId) {
        iStaffDao.updateStaffStatus(staffId);
        return true;
    }

    @Override
    public List<Msle_StaffPo> getAllDriver() {
        return iStaffDao.getAllDriver();
    }

    @Override
    public Boolean addStaff(Msle_StaffPo msle_staffPo) {
    String id="wrong";
    id= UUID.createID();
    msle_staffPo.setStaffId(id);
        iStaffDao.addStaff(msle_staffPo);
        return true;
    }

    @Override
    public Boolean updatePersonalInformation(Msle_StaffPo msle_staffPo) {
        iStaffDao.updatePersonalInformation(msle_staffPo);
        return true;
    }

    @Override
    public Boolean updateSalaryByPosition(Msle_StaffPo msle_staffPo) {
        iStaffDao.updateSalaryByPosition(msle_staffPo);
        return true;
    }
}
