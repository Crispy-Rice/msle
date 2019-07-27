package com.yuantu.serviceinterface.staffinterface;

import com.yuantu.po.MsleStaffPo;

import java.util.List;

/**
 *
 *@author tai
 *@Time
 *员工管理接口
 *
 */
public interface IStaffService {

    List<MsleStaffPo> getPersonnelByOrganization( String organizationType);

    MsleStaffPo getPersonnelInformation(String staffId);

    List<MsleStaffPo> getAllStaffs();

    List<MsleStaffPo> getAllStaffsOnjob();

    Integer  updateStaffSalary(MsleStaffPo msleStaffPo);

    MsleStaffPo getStaffSalary(String staffId);

    Integer updateStaffStatus( String staffId);

    Integer addStaff(MsleStaffPo msleStaffPo);

    Integer updatePersonalInformation(MsleStaffPo msleStaffPo);

    Integer updateSalaryByPosition(MsleStaffPo msleStaffPo);
}
