package com.yuantu.controller.organizationcontroller;

import com.yuantu.po.MsleOrganizationPo;
import com.yuantu.po.MsleStaffPo;
import com.yuantu.serviceinterface.organizationinterface.IOrganizationService;
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
 *人员机构管理模块
 *
 */
@RestController
@RequestMapping(value = "/organization")
public class OrganizationController {
    @Autowired
    private IOrganizationService iOrganizationService;

    /**
     获取所有员工信息
     */
    @RequestMapping(value = "/getAllUsers",method = RequestMethod.GET)
    public PageUtil<MsleStaffPo> getAllUsers (){
        PageUtil<MsleStaffPo> pageUtil=new PageUtil<MsleStaffPo>(
                iOrganizationService.getAllUsers());
        return   pageUtil;
    }

    /**
     获取一条员工信息
     */
    @RequestMapping(value = "/getPersonnelInformation",method = RequestMethod.GET)
    public PageUtil<MsleStaffPo> getPersonnelInformation (String staffId){
        List<MsleStaffPo> list=new ArrayList<MsleStaffPo>();
        list.add(iOrganizationService.getPersonnelInformation(staffId));
        PageUtil<MsleStaffPo> pageUtil=new PageUtil<MsleStaffPo>(list);
        return   pageUtil;
    }

    /**
     修改员工所属机构
     */
    @RequestMapping(value = "/updateBelongsOrganization",method = RequestMethod.GET)
    public PageUtil<Integer> updateBelongsOrganization (@Valid @RequestBody MsleStaffPo msleStaffPo){
        List<Integer> list=new ArrayList<Integer>();
        list.add(iOrganizationService.updateBelongsOrganization(msleStaffPo));
        PageUtil<Integer> pageUtil=new PageUtil<Integer>(list);
        return pageUtil;
    }

    /**
     获取所有机构信息
     */
    @RequestMapping(value = "/getAllOrganization",method = RequestMethod.GET)
    public PageUtil<MsleOrganizationPo> getAllOrganization (){
        PageUtil<MsleOrganizationPo> pageUtil=new PageUtil<MsleOrganizationPo>(
                iOrganizationService.getAllOrganization()
        );
        return   pageUtil;
    }

    /**
     增添机构
     */
    @RequestMapping(value = "/insertOrganization",method = RequestMethod.GET)
    public PageUtil<String> insertOrganization (@Valid @RequestBody MsleOrganizationPo msleOrganizationPo){
        List<String> list=new ArrayList<String>();
        list.add(iOrganizationService.insertOrganization(msleOrganizationPo));
        PageUtil<String> pageUtil=new PageUtil<String>(list);
        return   pageUtil;
    }

    /**
     删除已有机构(机构下有人不允许)
     */
    @RequestMapping(value = "/deleteOrganization",method = RequestMethod.GET)
    public PageUtil<String> deleteOrganization (String organizationId){
        List<String> list=new ArrayList<String>();
        list.add(iOrganizationService.deleteOrganization(organizationId));
        PageUtil<String> pageUtil=new PageUtil<String>(list);
        return   pageUtil;
    }

    /**
     修改机构信息
     */
    @RequestMapping(value = "/updateOrganization",method = RequestMethod.GET)
    public PageUtil<Integer> updateOrganization (@Valid @RequestBody MsleOrganizationPo msleOrganizationPo){
        List<Integer> list=new ArrayList<Integer>();
        list.add(iOrganizationService.updateOrganization(msleOrganizationPo));
        PageUtil<Integer> pageUtil=new PageUtil<Integer>(list);
        return pageUtil;
    }
}

