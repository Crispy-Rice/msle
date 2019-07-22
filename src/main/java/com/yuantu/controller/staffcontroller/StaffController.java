package com.yuantu.controller.staffcontroller;

import com.yuantu.po.Msle_StaffPo;
import com.yuantu.serviceinterface.staffinterface.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/staff")
public class StaffController {
   @Autowired
    private IStaffService iStaffService;

    //获取一条员工信息
    @RequestMapping(value = "/getPersonnelInformation",method = RequestMethod.GET)
    @ResponseBody
   public Msle_StaffPo getPersonnelInformation(String staffId){
        return iStaffService.getPersonnelInformation(staffId);
    }

    //获取所用员工(包括离职)
    @RequestMapping(value = "/getAllStaffs",method = RequestMethod.GET)
    @ResponseBody
    List<Msle_StaffPo> getAllStaffs(){
        return iStaffService.getAllStaffs();
    }

    //获取所用员工(不包括离职)
    @RequestMapping(value = "/getAllStaffsOnjob",method = RequestMethod.GET)
    @ResponseBody
    List<Msle_StaffPo> getAllStaffsOnjob(){
        return iStaffService.getAllStaffsOnjob();
    }

    //根据员工id修改薪资
    @RequestMapping(value = "/updateStaffSalary",method = RequestMethod.POST)
    @ResponseBody
    Boolean updateStaffSalary(@RequestBody Msle_StaffPo msle_staffPo,@RequestParam("peopleId") String peopleId){
     System.out.println(peopleId);
     return iStaffService.updateStaffSalary(msle_staffPo);
    }

    //根据员工id查看员工薪资
    @RequestMapping(value = "/getStaffSalary",method = RequestMethod.GET)
    @ResponseBody
    Msle_StaffPo getStaffSalary(String staffId){
        return iStaffService.getStaffSalary(staffId);
    }

    //修改人员状态(变为离职)
    @RequestMapping(value = "/updateStaffStatus",method = RequestMethod.GET)
    @ResponseBody
    Boolean updateStaffStatus( String staffId){
        return iStaffService.updateStaffStatus(staffId);
    }

    //查询所有司机
    @RequestMapping(value = "/getAllDriver",method = RequestMethod.GET)
    @ResponseBody
    List<Msle_StaffPo> getAllDriver(){
        return iStaffService.getAllDriver();
    }

    //添加员工
    @RequestMapping(value = "/addStaff",method = RequestMethod.GET)
    @ResponseBody
    Boolean addStaff(Msle_StaffPo msle_staffPo){
        return iStaffService.addStaff( msle_staffPo);
    }

    //修改个人信息
    @RequestMapping(value = "/updatePersonalInformation",method = RequestMethod.GET)
    @ResponseBody
    Boolean updatePersonalInformation(Msle_StaffPo msle_staffPo){
        return iStaffService.updatePersonalInformation(msle_staffPo);
    }

    //根据职位改工资
 @RequestMapping(value = "/updateSalaryByPosition",method = RequestMethod.GET)
 @ResponseBody
     Boolean updateSalaryByPosition (Msle_StaffPo msle_staffPo){
  return iStaffService.updateSalaryByPosition(msle_staffPo);
 }
}
