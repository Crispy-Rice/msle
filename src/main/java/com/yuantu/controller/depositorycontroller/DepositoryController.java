package com.yuantu.controller.depositorycontroller;

import com.yuantu.po.depositorypo.MsleStorehousePo;
import com.yuantu.service.depositoryservice.IDepositoryService;
import com.yuantu.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value="/depository")
public class DepositoryController {
@Autowired
private IDepositoryService depositoryService;
    @RequestMapping(value="/getAreasById", method = RequestMethod.GET)//通过id查找仓库区域
    @ResponseBody
    public PageUtil<MsleStorehousePo> getAreasById(String id){
       return new PageUtil<MsleStorehousePo>(depositoryService.getAreasById(id));



    }
    @RequestMapping(value="/getAlertLineById", method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MsleStorehousePo> getAlertLineById(String storehouseid, Integer areaid){
       List<MsleStorehousePo> resultList=new ArrayList<MsleStorehousePo>();
       resultList.add(depositoryService.getAlertLineById(storehouseid,areaid));

        return new PageUtil<MsleStorehousePo>(resultList);



    }

    @RequestMapping(value="/updateAlertLineById", method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<Integer> updateAlertLineById(String storehouseid,Integer areaid,double alertline){
        List<Integer> resultList =new ArrayList<Integer>();
        resultList.add(depositoryService.updateAlertLineById(storehouseid,areaid,alertline));
        return new PageUtil<Integer>(resultList);



    }

    @RequestMapping(value="/getPositionState", method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<String> getPositionState(String storehouseId,
                                                      Integer storehouseStateAreaNo, Integer storehouseStateLineNo,
                                                      Integer storehouseStateShelfNo,Integer storehouseStatePostionNo){
        List<String> resultList=new ArrayList<String>();
        resultList.add(depositoryService.getPositionState(storehouseId, storehouseStatePostionNo,
                storehouseStateAreaNo, storehouseStateLineNo, storehouseStateShelfNo));


        return  new PageUtil<String>(resultList);



    }

    @RequestMapping(value="/updatePositionState", method = RequestMethod.GET)
    @ResponseBody
    public  PageUtil<Boolean> updatePositionState(String storehouseStateState, String storehouseId, Integer storehouseStatePostionNo,
                                Integer storehouseStateAreaNo, Integer storehouseStateLineNo,
                                Integer storehouseStateShelfNo){
        List<Boolean> resultList=new ArrayList<Boolean>();
        resultList.add(depositoryService.updatePositionState(storehouseStateState,
                storehouseId, storehouseStatePostionNo, storehouseStateAreaNo,
                storehouseStateLineNo, storehouseStateShelfNo));

        return new PageUtil<Boolean>(resultList);



    }
}
