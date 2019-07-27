package com.yuantu.dao;

import com.yuantu.po.MsleStaffPo;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 *
 *@author tai
 *@Time
 *员工表数据库操作
 *
 */
@Mapper
public interface IStaffDao {

    //获取所用员工(包括离职)
    @Select("select * from msle_staff ")
    List<MsleStaffPo> getAllStaffs();


    //获取所用员工(不包括离职)
    @Select("select * from msle_staff where staff_Status='onjob'")
    List<MsleStaffPo> getAllStaffsOnjob();


    //获取一条员工信息(根据员工id)
    @Select("select * from msle_staff where staff_Id='${staffId}'")
    MsleStaffPo getPersonnelInformation(@Param("staffId") String staffId);

    //获取多条员工信息（根据机构id）
    @Select("select * from msle_staff where staff_organization='${staff_organization}' AND staff_Status='onjob'")
    List<MsleStaffPo> getPersonnelByOrganization(@Param("staff_organization") String organizationId);


    //根据员工id修改薪资
    @Update("update msle_staff  set" +
            " staff_Strategy_Monthly = '${msleStaffPo.staffStrategyMonthly}'" +
            ",staff_Strategy_Metering = '${msleStaffPo.staffStrategyMetering}'" +
            ",staff_Strategy_Rate = '${msleStaffPo.staffStrategyRate}'" +
            " where staff_Id = '${msleStaffPo.staffId}' AND staff_Status='onjob'")
    Integer updateStaffSalary(@Param("msleStaffPo") MsleStaffPo msleStaffPo);

    //根据职位改薪资
    @Update("update msle_staff  set" +
            " staff_Strategy_Monthly = '${msleStaffPo.staffStrategyMonthly}'" +
            ",staff_Strategy_Metering = '${msleStaffPo.staffStrategyMetering}'" +
            ",staff_Strategy_Rate = '${msleStaffPo.staffStrategyRate}'" +
            "  where staff_position = '${msleStaffPo.staffPosition}' AND staff_Status='onjob'")
    Integer updateSalaryByPosition(@Param("msleStaffPo") MsleStaffPo msleStaffPo);


    //根据员工id查看员工薪资
    @Select("select * from msle_staff where staff_Id = '${staffId}'")
    MsleStaffPo getStaffSalary(@Param("staffId") String staffId);


    //修改人员所属机构
    @Update("update msle_staff set" +
            " staff_Organization='${msleStaffPo.staffOrganization}'" +
            " where staff_Id = '${msleStaffPo.staffId}'")
    Integer updateBelongsOrganization(@Param("msleStaffPo") MsleStaffPo msleStaffPo);

    //修改人员状态(变为离职)
    @Update("update msle_staff set" +
            " staff_Status='dimission'" +
            " where staff_Id = '${staffId}'")
    Integer updateStaffStatus(@Param("staffId") String staffId);

    //修改个人信息
    @Update("update msle_staff set" +
            " staff_phone='${msleStaffPo.staffPhone}'" +
            " ,staff_Password='${msleStaffPo.staffPassword}'" +
            " where staffId = '${msleStaffPo.staffId}'")
    Integer updatePersonalInformation(@Param("msleStaffPo") MsleStaffPo msleStaffPo);


    //查询所有司机
    @Select("select * from msle_staff where staff_Position='driver' AND staff_Status='onjob'")
    List<MsleStaffPo> getAllDriver();

    //添加员工
    @Insert("insert into msle_staff values" +
            "('${msleStaffPo.staffId}'" +
            ",'${msleStaffPo.staffName}'" +
            ",'${msleStaffPo.staffPassword}'" +
            ",'${msleStaffPo.staffGender}'" +
            ",'${msleStaffPo.staffAge}'" +
            ",'${msleStaffPo.staffPhone}'" +
            ",'${msleStaffPo.staffPosition}'" +
            ",'${msleStaffPo.staffResponsibility}'" +
            ",'${msleStaffPo.staffStrategyMonthly}'" +
            ",'${msleStaffPo.staffStrategyMetering}'" +
            ",'${msleStaffPo.staffStrategyRate}'" +
            ",'${msleStaffPo.staffOrganization}'" +
            ",'onjob')")
    Integer addStaff(@Param("msleStaffPo") MsleStaffPo msleStaffPo);

    //返回营业厅下所有员工
    @Select("select * from msle_staff where staff_Organization='${staff_Organization}' AND staff_Status='onjob'")
    List<MsleStaffPo> getStaffByServicehall(
            @Param("staff_Organization") String staffOrganization);

    //根据用户名找密码
    @Select("select * from msle_staff where staff_name='${staff_name}' ")
    MsleStaffPo getPasswordByName(@Param("staff_name") String name);
}
