package com.yuantu.controller.accountcontroller;


import com.yuantu.po.accountPo.MsleaccountPo;
import com.yuantu.po.accountPo.MslepaymentPo;
import com.yuantu.po.accountPo.MsleReceiptPo;
import com.yuantu.service.accountservice.IAccountService;
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
@RequestMapping(value = "/account")
public class AccountController {
    @Autowired
    IAccountService accountService;

    @RequestMapping("/login")
    public String login(){
        return "SalesClerk";
    }

    @RequestMapping(value = "/addReceipt", method = RequestMethod.POST)
    @ResponseBody
    public boolean addReceipt(@RequestBody MsleReceiptPo receiptPo) {//添加收款单

        return accountService.addReceipt(receiptPo);


    }

    @RequestMapping(value = "/deleteReceiptById", method = RequestMethod.DELETE)
    @ResponseBody
    public boolean deleteReceiptById(String receiptId) {//根据id删除收款单
        return accountService.deleteReceiptById(receiptId);


    }

    @RequestMapping(value = "/updateReceiptDeleteState", method = RequestMethod.PUT)
    @ResponseBody
    public  boolean updateReceiptDeleteState(String receiptDeleteState
            , String receiptId) {//根据id查询收款单
        return accountService.updateReceiptDeleteState(receiptDeleteState, receiptId);


    }

    @RequestMapping(value = "/updateReceiptStatuS", method = RequestMethod.PUT)
    @ResponseBody
    public boolean updateReceiptStatuS(String receiptStatus
            , String receiptId) {//根据id查询收款单
        return accountService.updateReceiptStatuS(receiptStatus, receiptId);


    }

    @RequestMapping(value = "/updatePaymentDeleteState", method = RequestMethod.GET)
    @ResponseBody
    public boolean updatePaymentDeleteState(String paymentDeleteState,
                                            String paymentId) {//根据id查询收款单
        return accountService.updatePaymentDeleteState(paymentDeleteState, paymentId);


    }

    @RequestMapping(value = "/updatePaymentStatus", method = RequestMethod.PUT)
    @ResponseBody
    public boolean updatePaymentStatus(String paymentStatus, String paymentId) {//根据id查询收款单
        return accountService.updatePaymentStatus(paymentStatus, paymentId);


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
    public Double getTotalReceiptByHallName(String hallName) {//根据营业厅名字查询收款单合计
        return accountService.getTotalReceiptByHallName(hallName);


    }

    @RequestMapping(value = "/getReceipt", method = RequestMethod.GET)//查询全部收款单
    @ResponseBody
    public List<MsleReceiptPo> getReceipt() {
        return accountService.getReceipt();


    }


    @RequestMapping(value = "/getReceiptByBeginAndEndDay", method = RequestMethod.GET)
    @ResponseBody
    public List<MsleReceiptPo> getReceiptByBeginAndEndDay(String beginDay, String endDay) {
        //查询指定日期内的收款单
        return accountService.getReceiptByBeginAndEndDay(beginDay, endDay);


    }

    @RequestMapping(value = "/getTotalReceiptByBeginAndEndDay", method = RequestMethod.GET)
    @ResponseBody
    public Double getTotalReceiptByBeginAndEndDay(String beginDay, String endDay) {
        //查询指定日期内的收款单总计
        return accountService.getTotalReceiptByBeginAndEndDay(beginDay, endDay);


    }


    @RequestMapping(value = "/addAccount", method = RequestMethod.POST)
    @ResponseBody
    public boolean addAccount(@Valid  @RequestBody MsleaccountPo accountPo) {//增加账户
        return accountService.addAccount(accountPo);


    }

    @RequestMapping(value = "/updateAccount", method = RequestMethod.PUT)
    @ResponseBody
    public boolean updateAccount(String accountName,Double accountSurplus) {//更新账户
        return accountService.updateAccount(accountName, accountSurplus);


    }

    @RequestMapping(value = "/deleteAccountById", method = RequestMethod.DELETE)
    @ResponseBody
    public boolean deleteAccountById(String id) {//删除账户
        return accountService.deleteAccountById(id);


    }

    @RequestMapping(value = "/getAccountByName", method = RequestMethod.GET)
    @ResponseBody
    public MsleaccountPo getAccountByName(String accountName) {//查询账户
        return accountService.getAccountByName(accountName);


    }

    @RequestMapping(value = "/addPayment", method = RequestMethod.POST)
    @ResponseBody
    public boolean addPayment(@RequestBody MslepaymentPo paymentPo) {//新建付款单
        return accountService.addPayment(paymentPo);


    }

    @RequestMapping(value = "/deletePaymentById", method = RequestMethod.DELETE)
    @ResponseBody
    public boolean deletePaymentById(String id) {//根据id删除付款单
        return accountService.deletePaymentById(id);


    }

    @RequestMapping(value = "/updatePayment", method = RequestMethod.PUT)
    @ResponseBody
    public boolean updatePayment(@RequestBody MslepaymentPo paymentPo) {
        return accountService.updatePayment(paymentPo);//更新付款单


    }

    @RequestMapping(value = "/getPaymentById", method = RequestMethod.GET)
    @ResponseBody
    public MslepaymentPo getPaymentById(String id) {//根据id查询付款单
        return accountService.getPaymentById(id);


    }

    @RequestMapping(value = "/getPaymentByBeginAndEndDay", method = RequestMethod.GET)
    @ResponseBody
    public List<MslepaymentPo> getPaymentByBeginAndEndDay(String beginDay, String endDay) {
        return accountService.getPaymentByBeginAndEndDay(beginDay, endDay);


    }

    @RequestMapping(value = "/selectPaymentByType", method = RequestMethod.GET)
    @ResponseBody
    public List<MslepaymentPo> selectPaymentByType(String type) {
        return accountService.selectPaymentByType(type);


    }

    @RequestMapping(value = "/selectPayments", method = RequestMethod.GET)
    @ResponseBody
    public List<MslepaymentPo> selectPayments() {
        return accountService.selectPayments();


    }

    @RequestMapping(value = "/getAccountById", method = RequestMethod.GET)
    @ResponseBody
    public MsleaccountPo getAccountById(String id) {
        return accountService.getAccountById(id);


    }

    @RequestMapping(value = "/getAccount", method = RequestMethod.GET)
    @ResponseBody
    public List<MsleaccountPo> getAccount() {
        return accountService.getAccount();


    }

}
