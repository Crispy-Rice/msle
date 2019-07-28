package com.yuantu.controller.logcontroller;

import com.yuantu.po.MsleLogPo;
import com.yuantu.serviceinterface.loginterface.ILogService;
import com.yuantu.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 *@author tai
 *@Time
 *日志管理模块
 *
 */
@RestController
@RequestMapping( "/log")
public class LogController {
    @Autowired
    private ILogService iLogService;

    /**
     获取某日期下所有日志
     */
    @RequestMapping(value = "/getLog", method = RequestMethod.GET)
    @ResponseBody
    PageUtil<MsleLogPo> getLog (String date) {
        List<MsleLogPo> list=iLogService.getLog(date);
        PageUtil<MsleLogPo> pageUtil=new PageUtil<MsleLogPo>(list);
        return pageUtil;
    }

    @RequestMapping(value = "/getAllLog", method = RequestMethod.GET)
    @ResponseBody
    PageUtil<MsleLogPo> getAllLog () {
        List<MsleLogPo> list=iLogService.getAllLog();
        PageUtil<MsleLogPo> pageUtil=new PageUtil<MsleLogPo>(list);
        return pageUtil;
    }
}
