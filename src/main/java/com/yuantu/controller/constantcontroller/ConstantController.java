package com.yuantu.controller.constantcontroller;


import com.yuantu.po.Msle_ConstantPo;
import com.yuantu.po.Msle_LogisticsPo;
import com.yuantu.serviceinterface.constantinterface.IConstantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/constant")
public class ConstantController {
    @Autowired
    IConstantService iConstantService;
    //修改一条常量
    @RequestMapping(value = "/updateConstant",method = RequestMethod.GET)
    public Boolean updateConstant(Msle_ConstantPo msle_constantPo){
        return iConstantService.updateConstant(msle_constantPo);
    }

    //添加一条常量
    @RequestMapping(value = "/insertConstant",method = RequestMethod.GET)
    public Boolean insertConstant(Msle_ConstantPo msle_constantPo){
        return iConstantService.insertConstant( msle_constantPo);
    }

    //获得一条常量
    @RequestMapping(value = "/getConstant",method = RequestMethod.GET)
    public Msle_ConstantPo getConstant(Msle_ConstantPo msle_constantPo){
        return iConstantService.getConstant( msle_constantPo);
    }


    //获得物流信息
//    @RequestMapping(value = "/getLogisticsInformation",method = RequestMethod.GET)
//    public List<Msle_LogisticsPo> getLogisticsInformation (Msle_ConstantPo msle_constantPo){
//        return iConstantService.getLogisticsInformation( msle_constantPo);
//    }

    //根据起始和开始城市查看物流信息
    @RequestMapping(value = "/getLogisticsByCity",method = RequestMethod.GET)
    List<Msle_LogisticsPo> getLogisticsByCity( Msle_ConstantPo msle_constantPo){
        return iConstantService.getLogisticsByCity( msle_constantPo);
    };

}
