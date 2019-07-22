package com.yuantu.controller.depositorycontroller;



import com.yuantu.po.depositorypo.MsleGoDownEntryPO;
import com.yuantu.po.depositorypo.MsleOutBoundPO;
import com.yuantu.po.depositorypo.MsleReservePO;
import com.yuantu.service.depositoryservice.IReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value="/reserve")
public class ReserveController {
@Autowired
private IReserveService reserveService;
    @RequestMapping(value="/addgodownentry",method = RequestMethod.POST)
    @ResponseBody
    public int addGodownentry(@RequestBody MsleGoDownEntryPO goDownEntryPO){
        return reserveService.addGodownentry(goDownEntryPO);
    }

    @RequestMapping(value="/addoutbound",method = RequestMethod.POST)
    @ResponseBody
    public int addOutbound(@RequestBody MsleOutBoundPO outBoundPO){
        return reserveService.addOutbound(outBoundPO);
    }

    @RequestMapping(value="/getClosurePoint",method = RequestMethod.GET)
    @ResponseBody
    public  String  getClosurePoint(){
       return   reserveService.getClosure();
    }

    @RequestMapping(value="/getReserveByClosurePoint",method = RequestMethod.GET)
    @ResponseBody
    public List<MsleReservePO> getReserveByClosurePoint(String storehouseid){
       return  reserveService.getReserveByClosurePoint(storehouseid);
    }

    @RequestMapping(value="/updateReserve",method = RequestMethod.GET)
    @ResponseBody
    public boolean updateReserve(String id ,String checkStatus){
        return  reserveService.updateReserve(id,checkStatus);
    }

    @RequestMapping(value="/checkAlertline",method = RequestMethod.GET)
    @ResponseBody
    public String checkAlertline(String storehouseid,Integer areaid){
        return  reserveService.checkAlertline(storehouseid,areaid);
    }

//    @RequestMapping(value="/getGoDownEntryByStatus",method = RequestMethod.GET)
//    @ResponseBody
//    public List<MsleGoDownEntryPO> getGoDownEntryByStatus(String status){
//        return  reserveService.getGoDownEntryByStatus(status);
//    }
//
//    @RequestMapping(value="/getOutBoundByStatus",method = RequestMethod.GET)
//    @ResponseBody
//    public List<MsleOutBoundPO> getOutBoundByStatus(String status){
//
//        return  reserveService.getOutBoundByStatus(status);
//    }

    @RequestMapping(value="/getGoDownEntryById",method = RequestMethod.GET)
    @ResponseBody
    public MsleGoDownEntryPO getGoDownEntryById(String id){
        return  reserveService.getGoDownEntryById(id);
    }

    @RequestMapping(value="/getOutBoundById",method = RequestMethod.GET)
    @ResponseBody
    public MsleOutBoundPO getOutBoundById(String id){

        return  reserveService.getOutBoundById(id);
    }

    @RequestMapping(value="/getGoDownEntryByListId",method = RequestMethod.GET)
    @ResponseBody
    public  List<MsleGoDownEntryPO> getGoDownEntryByListId(String godownentryGodownentryId){
        return  reserveService.getGoDownEntryByListId(godownentryGodownentryId);
    }

    @RequestMapping(value="/getOutBoundByListId",method = RequestMethod.GET)
    @ResponseBody
    public List<MsleOutBoundPO> getOutBoundByListId(String outboundOutboundId){

        return  reserveService.getOutBoundByListId(outboundOutboundId);
    }


//    @RequestMapping(value="/updateGoDownEntryStatus",method = RequestMethod.GET)
//    @ResponseBody
//    public boolean updateGoDownEntryStatus(Integer id,String status){
//
//        return  reserveService.updateGoDownEntryStatus(id,status);
//    }

//    @RequestMapping(value="/updateOutBoundStatus",method = RequestMethod.GET)
//    @ResponseBody
//    public boolean updateOutBoundStatus(Integer id,String status){
//
//        return  reserveService.updateOutBoundStatus(id,status);
//    }

}
