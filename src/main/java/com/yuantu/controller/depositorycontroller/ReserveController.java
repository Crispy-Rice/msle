package com.yuantu.controller.depositorycontroller;



import ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import com.yuantu.po.depositorypo.MsleGoDownEntryPo;
import com.yuantu.po.depositorypo.MsleOutBoundPo;
import com.yuantu.po.depositorypo.MsleReservePo;
import com.yuantu.service.depositoryservice.IReserveService;
import com.yuantu.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value="/reserve")
public class ReserveController {
@Autowired
private IReserveService reserveService;
    @RequestMapping(value="/addgodownentry",method = RequestMethod.POST)
    @ResponseBody
    public PageUtil<Integer> addGodownentry(@Valid @RequestBody MsleGoDownEntryPo goDownEntryPo){
        List<Integer> resultList=new ArrayList<Integer>();
        resultList.add(reserveService.addGodownentry(goDownEntryPo));

        return new PageUtil<Integer>(resultList);
    }

    @RequestMapping(value="/addoutbound",method = RequestMethod.POST)
    @ResponseBody
    public PageUtil<Integer> addOutbound(@Valid @RequestBody MsleOutBoundPo outBoundPo){
        List<Integer> resultList=new ArrayList<Integer>();
        resultList.add(reserveService.addOutbound(outBoundPo));

        return new PageUtil<Integer>(resultList);

    }

    @RequestMapping(value="/getClosurePoint",method = RequestMethod.GET)
    @ResponseBody
    public  PageUtil<String>  getClosurePoint(){
       List<String> resultList=new ArrayList<String>();
        resultList.add( reserveService.getClosure());
        return  new PageUtil<String>(resultList);
    }

    @RequestMapping(value="/getReserveByClosurePoint",method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MsleReservePo> getReserveByClosurePoint(String storehouseid){
       return  new PageUtil<MsleReservePo>(reserveService.getReserveByClosurePoint(storehouseid));
    }

    @RequestMapping(value="/updateReserve",method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<Boolean> updateReserve(String id ,String checkStatus){
       List<Boolean> resultList=new ArrayList<Boolean>();
       resultList.add(reserveService.updateReserve(id,checkStatus));

        return  new PageUtil<Boolean>(resultList);
    }

    @RequestMapping(value="/checkAlertline",method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<String> checkAlertline(String storehouseid,Integer areaid){
        List<String> resultList=new ArrayList<String>();
        resultList.add(reserveService.checkAlertline(storehouseid,areaid));

        return  new PageUtil<String>(resultList);
    }

//    @RequestMapping(value="/getGoDownEntryByStatus",method = RequestMethod.GET)
//    @ResponseBody
//    public List<MslegoDownEntryPo> getGoDownEntryByStatus(String status){
//        return  reserveService.getGoDownEntryByStatus(status);
//    }
//
//    @RequestMapping(value="/getOutBoundByStatus",method = RequestMethod.GET)
//    @ResponseBody
//    public List<MsleOutBoundPo> getOutBoundByStatus(String status){
//
//        return  reserveService.getOutBoundByStatus(status);
//    }

    @RequestMapping(value="/getGoDownEntryById",method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MsleGoDownEntryPo> getGoDownEntryById(String id)
    {
        List<MsleGoDownEntryPo> resultList=new ArrayList<MsleGoDownEntryPo>();
        resultList.add(reserveService.getGoDownEntryById(id));
        return  new PageUtil<MsleGoDownEntryPo>(resultList);
    }

    @RequestMapping(value="/getOutBoundById",method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MsleOutBoundPo> getOutBoundById(String id){
        List<MsleOutBoundPo> resultList=new ArrayList<MsleOutBoundPo>();
        resultList.add(reserveService.getOutBoundById(id));
        return  new PageUtil<MsleOutBoundPo>(resultList);
    }

    @RequestMapping(value="/getGoDownEntryByListId",method = RequestMethod.GET)
    @ResponseBody
    public  PageUtil<MsleGoDownEntryPo> getGoDownEntryByListId(String godownentryGodownentryId){
        return  new PageUtil<MsleGoDownEntryPo>(reserveService.getGoDownEntryByListId(godownentryGodownentryId));
    }

    @RequestMapping(value="/getOutBoundByListId",method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MsleOutBoundPo> getOutBoundByListId(String outboundOutboundId){

        return  new PageUtil<MsleOutBoundPo>(reserveService.getOutBoundByListId(outboundOutboundId));
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
