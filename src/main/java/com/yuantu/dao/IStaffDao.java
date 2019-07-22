package com.yuantu.dao;

import com.yuantu.po.Msle_StaffPo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface IStaffDao {

    //获取所用员工(包括离职)
    @Select("select * from msle_staff ")
    List<Msle_StaffPo> getAllStaffs();


    //获取所用员工(不包括离职)
    @Select("select * from msle_staff where staff_Status='onjob'")
    List<Msle_StaffPo> getAllStaffsOnjob();


    //获取一条员工信息(根据员工id)
    @Select("select * from msle_staff where staff_Id='${staffId}'")
    Msle_StaffPo getPersonnelInformation(@Param("staffId") String staffId);

    //获取多条员工信息（根据机构id）
    @Select("select * from msle_staff where staff_organization='${staff_organization}' AND staff_Status='onjob'")
    List<Msle_StaffPo> getPersonnelByOrganization(@Param("staff_organization") String organizationId);


    //根据员工id修改薪资
    @Update("update msle_staff  set" +
            " staff_Strategy_Monthly = '${msle_staffPo.staffStrategyMonthly}'" +
            ",staff_Strategy_Metering = '${msle_staffPo.staffStrategyMetering}'" +
            ",staff_Strategy_Rate = '${msle_staffPo.staffStrategyRate}'" +
            " where staff_Id = '${msle_staffPo.staffId}'")
    void updateStaffSalary(@Param("msle_staffPo") Msle_StaffPo msle_staffPo);

    //根据职位改薪资
    @Update("update msle_staff  set" +
            " staff_Strategy_Monthly = '${msle_staffPo.staffStrategyMonthly}'" +
            ",staff_Strategy_Metering = '${msle_staffPo.staffStrategyMetering}'" +
            ",staff_Strategy_Rate = '${msle_staffPo.staffStrategyRate}'" +
            " where staff_position = '${msle_staffPo.staffPosition}'AND staff_Status='onjob'")
    void updateSalaryByPosition(@Param("msle_staffPo") Msle_StaffPo msle_staffPo);


    //根据员工id查看员工薪资
    @Select("select * from msle_staff where staff_Id = '${staffId}'")
    Msle_StaffPo getStaffSalary(@Param("staffId") String staffId);


    //修改人员所属机构
    @Update("update msle_staff set" +
            " staff_Organization='${msle_staffPo.staffOrganization}'" +
            " where staff_Id = '${msle_staffPo.staffId}'")
    void updateBelongsOrganization(@Param("msle_staffPo") Msle_StaffPo msle_staffPo);

    //修改人员状态(变为离职)
    @Update("update msle_staff set" +
            " staff_Status='dimission'" +
            " where staff_Id = '${staffId}'")
    void updateStaffStatus(@Param("staffId") String staffId);

    //修改个人信息
    @Update("update msle_staff set" +
            " staff_phone='${msle_staffPo.staffPhone}'" +
            " ,staff_Password='${msle_staffPo.staffPassword}'" +
            " where staff_Id = '${msle_staffPo.staffId}'")
    void updatePersonalInformation(@Param("msle_staffPo") Msle_StaffPo msle_staffPo);


    //查询所有司机
    @Select("select * from msle_staff where staff_Position='driver' AND staff_Status='onjob'")
    List<Msle_StaffPo> getAllDriver();

    //添加员工
    @Insert("insert into msle_staff values" +
            "('${msle_staffPo.staffId}'" +
            ",'${msle_staffPo.staffName}'" +
            ",'${msle_staffPo.staffPassword}'" +
            ",'${msle_staffPo.staffGender}'" +
            ",'${msle_staffPo.staffAge}'" +
            ",'${msle_staffPo.staffPhone}'" +
            ",'${msle_staffPo.staffPosition}'" +
            ",'${msle_staffPo.staffResponsibility}'" +
            ",'${msle_staffPo.staffStrategyMonthly}'" +
            ",'${msle_staffPo.staffStrategyMetering}'" +
            ",'${msle_staffPo.staffStrategyRate}'" +
            ",'${msle_staffPo.staffOrganization}'" +
            ",'onjob')")
    void addStaff(@Param("msle_staffPo") Msle_StaffPo msle_staffPo);

    //返回营业厅下所有员工
    @Select("select * from msle_staff where staff_Organization='${staff_Organization}' AND staff_Status='onjob'")
    List<Msle_StaffPo> getStaffByServicehall(
            @Param("staff_Organization") String staffOrganization);

}
