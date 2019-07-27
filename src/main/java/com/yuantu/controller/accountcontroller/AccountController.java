package com.yuantu.controller.accountcontroller;



import com.yuantu.po.accountpo.MslePaymentPo;
import com.yuantu.po.accountpo.MsleReceiptPo;
import com.yuantu.po.accountpo.MsleAccountPo;
import com.yuantu.service.accountservice.IAccountService;
import com.yuantu.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
/**
 * @ClassName AccountController
 * @Description //账户操作
 * @Author  yukun
 * @Date  2019/7/26
 * @Version  1.0
 **/
@Controller
@RequestMapping(value = "/account")
public class AccountController {
    @Autowired
    IAccountService accountService;

    @RequestMapping("/login")
    public String login(){
        return "SalesClerk";
    }


    /*
     * @Description //添加收款单
     * @Date2019/7/26
     * @Param [receiptPo, peopleId] 收款单  操作人员
     * @return com.yuantu.util.PageUtil<java.lang.Boolean> 是否添加成功
     **/
    @RequestMapping(value = "/addReceipt", method = RequestMethod.POST)
    @ResponseBody
    public PageUtil<Boolean> addReceipt(@Valid @RequestBody MsleReceiptPo receiptPo,@RequestParam String peopleId) {//添加收款单
        List<Boolean> resultList=new ArrayList<Boolean>();

        resultList.add(accountService.addReceipt(receiptPo));
        return new PageUtil<Boolean>(resultList);


    }

    @RequestMapping(value = "/deleteReceiptById", method = RequestMethod.DELETE)
    @ResponseBody
    public PageUtil<Boolean> deleteReceiptById(String receiptId,String peopleId) {//根据id删除收款单
        List<Boolean> resultList=new ArrayList<Boolean>();
        Boolean result=accountService.deleteReceiptById(receiptId);
        resultList.add(result);

        return new PageUtil<Boolean>(resultList);


    }

    @RequestMapping(value = "/updateReceiptDeleteState", method = RequestMethod.PUT)
    @ResponseBody
    public  PageUtil<Boolean> updateReceiptDeleteState(String receiptDeleteState
            , String receiptId) {//修改收款单删除状态

        List<Boolean> resultList=new ArrayList<Boolean>();

        resultList.add(accountService.updateReceiptDeleteState(receiptDeleteState, receiptId));
        return new PageUtil<Boolean>(resultList);


    }

    @RequestMapping(value = "/updateReceiptStatus", method = RequestMethod.PUT)
    @ResponseBody
    public PageUtil<Boolean> updateReceiptStatus(String receiptStatus
            , String receiptId) {//
        List<Boolean> resultList=new ArrayList<Boolean>();

        resultList.add(accountService.updateReceiptStatus(receiptStatus, receiptId));

        return new PageUtil<Boolean>(resultList);


    }

    @RequestMapping(value = "/updatePaymentDeleteState", method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<Boolean> updatePaymentDeleteState(String paymentDeleteState,
                                            String paymentId) {//根据id查询收款单
        List<Boolean> resultList=new ArrayList<Boolean>();

        resultList.add(accountService.updatePaymentDeleteState(paymentDeleteState, paymentId));


        return new PageUtil<Boolean>(resultList);


    }

    @RequestMapping(value = "/updatePaymentStatus", method = RequestMethod.PUT)
    @ResponseBody
    public PageUtil<Boolean> updatePaymentStatus(String paymentStatus, String paymentId) {//根据id查询收款单
        List<Boolean> resultList=new ArrayList<Boolean>();

        resultList.add(accountService.updatePaymentStatus(paymentStatus, paymentId));

        return new PageUtil<Boolean>(resultList);


    }



    @RequestMapping(value = "/getReceiptById", method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MsleReceiptPo> getReceiptById(String recepitId) {//根据id查询收款单
        List<MsleReceiptPo>  list=new ArrayList<MsleReceiptPo>();
        list.add(accountService.getReceiptById(recepitId));
       PageUtil<MsleReceiptPo>  receiptjson=new PageUtil<MsleReceiptPo>(list) ;

        return receiptjson;
    }

    @RequestMapping(value = "/getReceiptByHallName", method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MsleReceiptPo> getReceiptByHallName(String hallName) {//根据营业厅名字查询收款单
        return new PageUtil(accountService.getReceiptByHallName(hallName));


    }

    @RequestMapping(value = "/getTotalReceiptByHallName", method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<Double> getTotalReceiptByHallName(String hallName) {//根据营业厅名字查询收款单合计
        List<Double> resultList=new ArrayList<Double>();

        resultList.add(accountService.getTotalReceiptByHallName(hallName));

        return new PageUtil<Double>(resultList);


    }

    @RequestMapping(value = "/getReceipt", method = RequestMethod.GET)//查询全部收款单
    @ResponseBody
    public PageUtil<MsleReceiptPo> getReceipt() {
        return new PageUtil<MsleReceiptPo>(accountService.getReceipt());


    }


    @RequestMapping(value = "/getReceiptByBeginAndEndDay", method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MsleReceiptPo> getReceiptByBeginAndEndDay(String beginDay, String endDay) {
        //查询指定日期内的收款单
        return new PageUtil<MsleReceiptPo>(accountService.getReceiptByBeginAndEndDay(beginDay, endDay));


    }

    @RequestMapping(value = "/getTotalReceiptByBeginAndEndDay", method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<Double> getTotalReceiptByBeginAndEndDay(String beginDay, String endDay) {
        //查询指定日期内的收款单总计
        List<Double> resultList=new ArrayList<Double>();

        resultList.add( accountService.getTotalReceiptByBeginAndEndDay(beginDay, endDay));

        return new PageUtil<Double>(resultList) ;


    }


    @RequestMapping(value = "/addAccount", method = RequestMethod.POST)
    @ResponseBody
    public PageUtil<Boolean> addAccount(@Valid  @RequestBody MsleAccountPo accountPo,String peopleId) {//增加账户
        List<Boolean> resultList=new ArrayList<Boolean>();

        resultList.add(accountService.addAccount(accountPo));


        return new PageUtil<Boolean>(resultList);


    }

    @RequestMapping(value = "/updateAccount", method = RequestMethod.PUT)
    @ResponseBody
    public PageUtil<Boolean> updateAccount(String accountName,Double accountSurplus,String peopleId) {//更新账户
        List<Boolean> resultList=new ArrayList<Boolean>();

        resultList.add(accountService.updateAccount(accountName, accountSurplus));

        return new PageUtil<Boolean>(resultList);


    }

    @RequestMapping(value = "/deleteAccountById", method = RequestMethod.DELETE)
    @ResponseBody
    public PageUtil<Boolean> deleteAccountById(String id,String peopleId) {//删除账户
        List<Boolean> resultList=new ArrayList<Boolean>();

        resultList.add(accountService.deleteAccountById(id));


        return new PageUtil<Boolean>(resultList);


    }

    @RequestMapping(value = "/getAccountByName", method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MsleAccountPo> getAccountByName(String accountName) {//查询账户
        List<MsleAccountPo> resultList=new ArrayList<MsleAccountPo>();
        resultList.add(accountService.getAccountByName(accountName));

        return new PageUtil<MsleAccountPo>(resultList);


    }

    @RequestMapping(value = "/addPayment", method = RequestMethod.POST)
    @ResponseBody
    public PageUtil<Boolean> addPayment(@Valid @RequestBody MslePaymentPo paymentPo,String peopleId) {//新建付款单
        List<Boolean> resultList=new ArrayList<Boolean>();

        resultList.add(accountService.addPayment(paymentPo));

        return new PageUtil<Boolean>(resultList);


    }

    @RequestMapping(value = "/deletePaymentById", method = RequestMethod.DELETE)
    @ResponseBody
    public PageUtil<Boolean> deletePaymentById(String id,String peopleId) {//根据id删除付款单
        List<Boolean> resultList=new ArrayList<Boolean>();

        resultList.add(accountService.deletePaymentById(id));


        return new PageUtil<Boolean>(resultList);


    }

    @RequestMapping(value = "/updatePayment", method = RequestMethod.PUT)
    @ResponseBody
    public PageUtil<Boolean> updatePayment(@RequestBody MslePaymentPo paymentPo,String peopleId) {
        List<Boolean> resultList=new ArrayList<Boolean>();
//更新付款单
        resultList.add(accountService.updatePayment(paymentPo));


        return new PageUtil<Boolean>(resultList);


    }

    @RequestMapping(value = "/getPaymentById", method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MslePaymentPo> getPaymentById(String id) {//根据id查询付款单
       List<MslePaymentPo> resultList=new ArrayList<MslePaymentPo>();
       resultList.add(accountService.getPaymentById(id));
       return new PageUtil<MslePaymentPo>(resultList);


    }

    @RequestMapping(value = "/getPaymentByBeginAndEndDay", method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MslePaymentPo> getPaymentByBeginAndEndDay(String beginDay, String endDay) {
        return new PageUtil<MslePaymentPo>(accountService.getPaymentByBeginAndEndDay(beginDay, endDay));


    }

    @RequestMapping(value = "/selectPaymentByType", method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MslePaymentPo> selectPaymentByType(String type) {
        return new PageUtil<MslePaymentPo>(accountService.selectPaymentByType(type));


    }

    @RequestMapping(value = "/selectPayments", method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MslePaymentPo> selectPayments() {
        return new PageUtil<MslePaymentPo>(accountService.selectPayments());


    }

    @RequestMapping(value = "/getAccountById", method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MsleAccountPo> getAccountById(String id) {
        List<MsleAccountPo> resultList=new ArrayList<MsleAccountPo>();
        resultList.add(accountService.getAccountById(id));

        return new PageUtil<MsleAccountPo>(resultList);


    }

    @RequestMapping(value = "/getAccount", method = RequestMethod.GET)
    @ResponseBody
    public PageUtil<MsleAccountPo> getAccount() {
        return new PageUtil<MsleAccountPo>(accountService.getAccount());


    }

}
