package com.yuantu.controller.staffcontroller;

import com.yuantu.po.MsleStaffPo;
import com.yuantu.serviceinterface.staffinterface.IStaffService;
import com.yuantu.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


/**
 *
 *@author tai
 *@Time
 *员工管理模块
 *
 */
@RestController
@RequestMapping(value = "/staff")
public class StaffController {
 @Autowired
 private IStaffService iStaffService;

 /**
  获取一条员工信息

  */
 @RequestMapping(value = "/getPersonnelInformation",method = RequestMethod.GET)
 @ResponseBody
 public PageUtil<MsleStaffPo> getPersonnelInformation(String staffId){
  List<MsleStaffPo> list=new ArrayList<MsleStaffPo>();
  list.add(iStaffService.getPersonnelInformation(staffId));
  PageUtil<MsleStaffPo> pageUtil=new PageUtil<MsleStaffPo>(list);
  return pageUtil;
 }

 /**
  获取所用员工(包括离职)
  */
 @RequestMapping(value = "/getAllStaffs",method = RequestMethod.GET)
 @ResponseBody
 PageUtil<MsleStaffPo> getAllStaffs(){
  PageUtil<MsleStaffPo> pageUtil=new PageUtil<MsleStaffPo>(iStaffService.getAllStaffs());
  return pageUtil;
 }

 /**
  获取所用员工(不包括离职)
  */
 @RequestMapping(value = "/getAllStaffsOnjob",method = RequestMethod.GET)
 @ResponseBody
 PageUtil<MsleStaffPo> getAllStaffsOnjob(){
  PageUtil<MsleStaffPo> pageUtil=new PageUtil<MsleStaffPo>(iStaffService.getAllStaffsOnjob());
  return pageUtil;
 }

 /**
  根据员工id修改薪资
  */
 @RequestMapping(value = "/updateStaffSalary",method = RequestMethod.GET)
 @ResponseBody
 PageUtil<Integer> updateStaffSalary(@RequestBody MsleStaffPo msleStaffPo, String peopleId){
  List<Integer> list=new ArrayList<Integer>();
  list.add(iStaffService.updateStaffSalary(msleStaffPo));
  PageUtil<Integer> pageUtil=new PageUtil<Integer>(list);
  return pageUtil;
 }

 /**
  根据员工id查看员工薪资
  */
 @RequestMapping(value = "/getStaffSalary",method = RequestMethod.GET)
 @ResponseBody
 PageUtil<MsleStaffPo> getStaffSalary(String staffId){
  List<MsleStaffPo> list=new ArrayList<MsleStaffPo>();
  list.add(iStaffService.getStaffSalary(staffId));
  PageUtil<MsleStaffPo> pageUtil=new PageUtil<MsleStaffPo>(list);
  return pageUtil;
 }

 /**
  修改人员状态(变为离职)
  */
 @RequestMapping(value = "/updateStaffStatus",method = RequestMethod.GET)
 @ResponseBody
 PageUtil<Integer> updateStaffStatus( String staffId){
  List<Integer> list=new ArrayList<Integer>();
  list.add(iStaffService.updateStaffStatus(staffId));
  PageUtil<Integer> pageUtil=new PageUtil<Integer>(list);
  return pageUtil;
 }

 /**
  添加员工
  */
 @RequestMapping(value = "/addStaff",method = RequestMethod.GET)
 @ResponseBody
 PageUtil<Integer> addStaff(@Valid @RequestBody MsleStaffPo msleStaffPo){
  List<Integer> list=new ArrayList<Integer>();
  list.add(iStaffService.addStaff( msleStaffPo));
  PageUtil<Integer> pageUtil=new PageUtil<Integer>(list);
  return pageUtil;
 }

 /**
  修改个人信息
  */
 @RequestMapping(value = "/updatePersonalInformation",method = RequestMethod.GET)
 @ResponseBody
 PageUtil<Integer> updatePersonalInformation(@Valid @RequestBody MsleStaffPo msleStaffPo){
  List<Integer> list=new ArrayList<Integer>();
  list.add(iStaffService.updatePersonalInformation(msleStaffPo));
  PageUtil<Integer> pageUtil=new PageUtil<Integer>(list);
  return pageUtil;
 }

 /**
  根据职位改工资
  */
 @RequestMapping(value = "/updateSalaryByPosition",method = RequestMethod.GET)
 @ResponseBody
 PageUtil<Integer> updateSalaryByPosition (@RequestBody MsleStaffPo msleStaffPo){
  List<Integer> list=new ArrayList<Integer>();
  list.add(iStaffService.updateSalaryByPosition(msleStaffPo));
  PageUtil<Integer> pageUtil=new PageUtil<Integer>(list);
  return pageUtil;
 }
}
