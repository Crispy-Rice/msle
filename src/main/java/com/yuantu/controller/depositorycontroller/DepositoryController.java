package com.yuantu.controller.depositorycontroller;

import com.yuantu.po.depositorypo.MsleStorehousePO;
import com.yuantu.service.depositoryservice.IDepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value="/depository")
public class DepositoryController {
@Autowired
private IDepositoryService depositoryService;
    @RequestMapping(value="/getAreasById", method = RequestMethod.GET)//通过id查找仓库区域
    @ResponseBody
    public List<MsleStorehousePO>getAreasById(String id){
       return depositoryService.getAreasById(id);



    }
    @RequestMapping(value="/getAlertLineById", method = RequestMethod.GET)
    @ResponseBody
    public MsleStorehousePO getAlertLineById(String storehouseid, Integer areaid){
        return depositoryService.getAlertLineById(storehouseid,areaid);



    }

    @RequestMapping(value="/updateAlertLineById", method = RequestMethod.GET)
    @ResponseBody
    public int updateAlertLineById(String storehouseid,Integer areaid,double alertline){
        return depositoryService.updateAlertLineById(storehouseid,areaid,alertline);



    }

    @RequestMapping(value="/getPositionState", method = RequestMethod.GET)
    @ResponseBody
    public String getPositionState(String storehouseId,
                                                      Integer storehouseStateAreaNo, Integer storehouseStateLineNo,
                                                      Integer storehouseStateShelfNo,Integer storehouseStatePostionNo){
        return depositoryService.getPositionState(storehouseId, storehouseStatePostionNo, storehouseStateAreaNo, storehouseStateLineNo, storehouseStateShelfNo);



    }

    @RequestMapping(value="/updatePositionState", method = RequestMethod.GET)
    @ResponseBody
    public  boolean updatePositionState(String storehouseStateState, String storehouseId, Integer storehouseStatePostionNo,
                                Integer storehouseStateAreaNo, Integer storehouseStateLineNo,
                                Integer storehouseStateShelfNo){
        return depositoryService.updatePositionState(storehouseStateState,
                storehouseId, storehouseStatePostionNo, storehouseStateAreaNo,
                storehouseStateLineNo, storehouseStateShelfNo);



    }
}
