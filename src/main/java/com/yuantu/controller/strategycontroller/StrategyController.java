package com.yuantu.controller.strategycontroller;

import com.yuantu.po.Msle_StaffPo;
import com.yuantu.serviceinterface.strategyinterface.IStrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/strategy")
public class StrategyController {
    @Autowired
    private IStrategyService iStaffService;

    //获取所有员工
    @RequestMapping(value = "/getAllUsers",method = RequestMethod.GET)
    public List<Msle_StaffPo> getAllUsers (){//获取所有用户
        return   iStaffService.geAllUsers();
    }

    //修改薪资
//    @RequestMapping(value = "/updateUserSalary",method = RequestMethod.GET)
//    @ResponseBody
//    public Boolean updateUserSalary (Long staffId, Double staffStrategyMonthly,
//             Double staffStrategyMetering, Double staffStrategyRate){
//        return   iStaffService.updateUserSalary(staffId
//                ,staffStrategyMonthly,staffStrategyMetering,staffStrategyRate);
//    }
}


