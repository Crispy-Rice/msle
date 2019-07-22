package com.yuantu.serviceinterface.staffinterface;

import com.yuantu.po.Msle_StaffPo;

import java.util.List;

public interface IStaffService {
    public Msle_StaffPo getPersonnelInformation(String staffId);

    List<Msle_StaffPo> getAllStaffs();

    List<Msle_StaffPo> getAllStaffsOnjob();

    Boolean  updateStaffSalary(Msle_StaffPo msle_staffPo);

    Msle_StaffPo getStaffSalary(String staffId);

    Boolean updateStaffStatus(String staffId);

    List<Msle_StaffPo> getAllDriver();

    Boolean addStaff(Msle_StaffPo msle_staffPo);

    Boolean updatePersonalInformation(Msle_StaffPo msle_staffPo);

    Boolean updateSalaryByPosition(Msle_StaffPo msle_staffPo);
}
