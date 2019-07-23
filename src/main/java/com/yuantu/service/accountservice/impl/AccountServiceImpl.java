package com.yuantu.service.accountservice.impl;

import com.yuantu.constant.ListStatus;
import com.yuantu.dao.accountdao.IAccountDao;
import com.yuantu.po.accountPo.MsleaccountPo;
import com.yuantu.po.accountPo.MslepaymentPo;
import com.yuantu.po.accountPo.MsleReceiptPo;
import com.yuantu.service.accountservice.IAccountService;
import com.yuantu.util.UUID;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AccountServiceImpl implements IAccountService {
    @Resource
    IAccountDao accountDao;
    @Override
    public boolean addReceipt(MsleReceiptPo receiptPo) {

        receiptPo.setReceiptId(UUID.createID());
        return accountDao.addReceipt(receiptPo);
    }

    @Override
    public boolean deleteReceiptById(String receiptId) {
        return accountDao.deleteReceiptById(receiptId);
    }

    @Override
    public boolean updateReceiptDeleteState(String receiptDeleteState, String receiptId) {
        return accountDao.updateReceiptDeleteState(receiptDeleteState,receiptId);
    }

    @Override
    public boolean updateReceiptStatuS(String receiptStatus, String receiptId) {
        accountDao.updateReceiptStatuS(receiptStatus, receiptId);
        if(receiptStatus.equals(ListStatus.SUCCESS)){
            MsleReceiptPo myReceipPo=accountDao.getReceiptById(receiptId);
            double receiptMoney=myReceipPo.getReceiptCollections();
            String accountName=myReceipPo.getReceiptAccountName();
            double accountSurplus=accountDao.getAccountByName(accountName).getAccountSurplus();
            double newaccountSurplus=accountSurplus+receiptMoney;
            return accountDao.updateAccount(accountName,newaccountSurplus);

        }
       else {
            return  accountDao.updateReceiptStatuS(receiptStatus, receiptId);
        }
    }

    @Override
    public MsleReceiptPo getReceiptById(String id) {
        return accountDao.getReceiptById(id);
    }

    @Override
    public List<MsleReceiptPo> getReceipt() {
        return accountDao.getReceipt();
    }

    @Override
    public List<MsleReceiptPo> getReceiptByHallName(String orgazation) {
        return accountDao.getReceiptByHallName(orgazation);
    }

    @Override
    public Double getTotalReceiptByHallName(String orgazation) {
        return accountDao.getTotalReceiptByHallName(orgazation);
    }

    @Override
    public List<MsleReceiptPo> getReceiptByBeginAndEndDay(String beginDay, String endDay) {
        return accountDao.getReceiptByBeginAndEndDay(beginDay, endDay);
    }

    @Override
    public Double getTotalReceiptByBeginAndEndDay(String beginDay, String endDay) {
        return accountDao.getTotalReceiptByBeginAndEndDay(beginDay, endDay);
    }

    @Override
    public boolean addAccount(MsleaccountPo accountPo) {

        accountPo.setAccountId(UUID.createID());
        return accountDao.addAccount(accountPo);
    }

    @Override
    public boolean updateAccount(String accountName, Double accountSurplus) {
        return accountDao.updateAccount(accountName, accountSurplus);
    }

    @Override
    public boolean deleteAccountById(String id) {
        return accountDao.deleteAccountById(id);
    }

    @Override
    public MsleaccountPo getAccountByName(String accountName) {
        return accountDao.getAccountByName(accountName);
    }

    @Override
    public boolean addPayment(MslepaymentPo paymentPo)
    {   paymentPo.setPaymentId(UUID.createID());
        return accountDao.addPayment(paymentPo);
    }

    @Override
    public boolean updatePaymentDeleteState(String paymentDeleteState, String paymentId) {
        return accountDao.updatePaymentDeleteState(paymentDeleteState, paymentId);
    }

    @Override
    public boolean updatePaymentStatus(String paymentStatus, String paymentId) {
        accountDao.updatePaymentStatus(paymentStatus, paymentId);
        if(paymentStatus.equals(ListStatus.SUCCESS)){
            MslepaymentPo mypaymentPo=accountDao.getPaymentById(paymentId);
            double payMoney=mypaymentPo.getPaymentAmount();
            String accountName=mypaymentPo.getPaymentAccount();
            double accountSurplus=accountDao.getAccountByName(accountName).getAccountSurplus();
            double newAccountSurplus=accountSurplus-payMoney;
            return accountDao.updateAccount(accountName,newAccountSurplus);

        }
        else {
            return  accountDao.updatePaymentStatus(paymentStatus, paymentId);
        }
    }

    @Override
    public boolean deletePaymentById(String id) {
        return accountDao.deletePaymentById(id);
    }

    @Override
    public boolean updatePayment(MslepaymentPo paymentPo) {
        return accountDao.updatePayment(paymentPo);
    }

    @Override
    public MslepaymentPo getPaymentById(String id) {
        return accountDao.getPaymentById(id);
    }

    @Override
    public List<MslepaymentPo> getPaymentByBeginAndEndDay(String beginDay, String endDay) {
        return accountDao.getPaymentByBeginAndEndDay(beginDay, endDay);
    }

    @Override
    public List<MslepaymentPo> selectPaymentByType(String type) {
        return accountDao.selectPaymentByType(type);
    }

    @Override
    public List<MslepaymentPo> selectPayments() {
        return accountDao.selectPayments();
    }

    @Override
    public MsleaccountPo getAccountById(String id) {
        return accountDao.getAccountById(id);
    }

    @Override
    public List<MsleaccountPo> getAccount() {
        return accountDao.getAccount();
    }
}
