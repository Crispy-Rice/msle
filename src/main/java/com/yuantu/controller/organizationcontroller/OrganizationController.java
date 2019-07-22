package com.yuantu.controller.organizationcontroller;

import com.yuantu.po.Msle_OrganizationPo;
import com.yuantu.po.Msle_StaffPo;
import com.yuantu.serviceinterface.organizationinterface.IOrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/organization")
public class OrganizationController {
    @Autowired
    private IOrganizationService iOrganizationService;

   //获取所有员工
    @RequestMapping(value = "/getAllUsers",method = RequestMethod.GET)
    public List<Msle_StaffPo> getAllUsers (){
        return   iOrganizationService.getAllUsers();
    }


    //获取一条员工信息
    @RequestMapping(value = "/getPersonnelInformation",method = RequestMethod.GET)
    @ResponseBody
    public Msle_StaffPo getPersonnelInformation (String staffId){
        return   iOrganizationService.getPersonnelInformation(staffId);
    }


    //修改人员所属机构
    @RequestMapping(value = "/updateBelongsOrganization",method = RequestMethod.GET)
    public Boolean updateBelongsOrganization (Msle_StaffPo msle_staffPo){
        return   iOrganizationService.updateBelongsOrganization(msle_staffPo);
    }


    //获取所有机构
    @RequestMapping(value = "/getAllOrganization",method = RequestMethod.GET)
    public List<Msle_OrganizationPo> getAllOrganization (){
        return   iOrganizationService.getAllOrganization();
    }


    //添加新机构
    @RequestMapping(value = "/insertOrganization",method = RequestMethod.GET)
    public String insertOrganization (Msle_OrganizationPo msle_organizationPo){
        return   iOrganizationService.insertOrganization(msle_organizationPo);
    }


    //删除已有机构
    @RequestMapping(value = "/deleteOrganization",method = RequestMethod.GET)
    public String deleteOrganization (String organizationId){
        return   iOrganizationService.deleteOrganization(organizationId);
    }


    //修改机构信息
    @RequestMapping(value = "/updateOrganization",method = RequestMethod.GET)
    public Boolean updateOrganization (Msle_OrganizationPo msle_organizationPo){
        return   iOrganizationService.updateOrganization(msle_organizationPo);
    }
}
