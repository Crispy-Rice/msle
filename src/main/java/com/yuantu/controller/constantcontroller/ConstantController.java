package com.yuantu.controller.constantcontroller;


import com.yuantu.po.MsleConstantPo;
import com.yuantu.po.MsleLogisticsPo;
import com.yuantu.serviceinterface.constantinterface.IConstantService;
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
 *常量管理模块
 *
 */
@RestController
@RequestMapping(value = "/constant")
public class ConstantController {
    @Autowired
    IConstantService iConstantService;

    /**
     *修改一条记录
     */
    @RequestMapping(value = "/updateConstant",method = RequestMethod.GET)
    public PageUtil<Integer> updateConstant(@RequestBody MsleConstantPo msleConstantPo){
        List<Integer> list=new ArrayList<Integer>();
        list.add(iConstantService.updateConstant(msleConstantPo));
        PageUtil<Integer> pageUtil=new PageUtil<Integer>(list);
        return pageUtil;
    }

    /**
     添加一条常量
     */
    @RequestMapping(value = "/insertConstant",method = RequestMethod.GET)
    public PageUtil<Integer> insertConstant(@RequestBody @Valid MsleConstantPo msleConstantPo){
        List<Integer> list=new ArrayList<Integer>();
        list.add(iConstantService.insertConstant(msleConstantPo));
        PageUtil<Integer> pageUtil=new PageUtil<Integer>(list);
        return pageUtil;
    }

    /**
     获得一条常量
     */
    @RequestMapping(value = "/getConstant",method = RequestMethod.GET)
    public  PageUtil<MsleConstantPo> getConstant(@RequestBody MsleConstantPo msleConstantPo){
        MsleConstantPo constantServiceReturn=new MsleConstantPo();
        constantServiceReturn=iConstantService.getConstant(msleConstantPo);
        List<MsleConstantPo> list=new ArrayList<MsleConstantPo>();
        list.add(constantServiceReturn);
        PageUtil<MsleConstantPo> pageUtil=new PageUtil<MsleConstantPo>(list);
        return pageUtil;
    }

    /**
     获得所有常量
     */
    @RequestMapping(value = "/getAllConstants",method = RequestMethod.GET)
    public PageUtil<MsleConstantPo> getAllConstants(){
        List<MsleConstantPo> list=iConstantService.getAllConstants();
        PageUtil<MsleConstantPo> pageUtil=new PageUtil<MsleConstantPo>(list);
        return pageUtil;
    }

    /**
     根据起始和开始城市查看物流信息
     */
    @RequestMapping(value = "/getLogisticsByCity",method = RequestMethod.GET)
    public PageUtil<MsleLogisticsPo> getLogisticsByCity(@RequestBody MsleConstantPo msleConstantPo){
        List<MsleLogisticsPo> list=iConstantService.getLogisticsByCity(msleConstantPo);
        PageUtil<MsleLogisticsPo> pageUtil=new PageUtil<MsleLogisticsPo>(list);
        return pageUtil;
    }

}
