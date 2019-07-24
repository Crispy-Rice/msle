package com.yuantu.service.accountservice.impl;

import com.yuantu.constant.ListStatus;
import com.yuantu.dao.accountdao.IAccountDao;
import com.yuantu.po.accountpo.MsleAccountPo;
import com.yuantu.po.accountpo.MslePaymentPo;
import com.yuantu.po.accountpo.MsleReceiptPo;
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

        receiptPo.setReceiptId(UUID.creatId());
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
    public boolean updateReceiptStatus(String receiptStatus, String receiptId) {
        accountDao.updateReceiptStatus(receiptStatus, receiptId);
        if(receiptStatus.equals(ListStatus.SUCCESS)){
            MsleReceiptPo myReceipPo=accountDao.getReceiptById(receiptId);
            double receiptMoney=myReceipPo.getReceiptCollections();
            String accountName=myReceipPo.getReceiptAccountName();
            double accountSurplus=accountDao.getAccountByName(accountName).getAccountSurplus();
            double newaccountSurplus=accountSurplus+receiptMoney;
            return accountDao.updateAccount(accountName,newaccountSurplus);

        }
       else {
            return  accountDao.updateReceiptStatus(receiptStatus, receiptId);
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
    public boolean addAccount(MsleAccountPo accountPo) {

        accountPo.setAccountId(UUID.creatId());
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
    public MsleAccountPo getAccountByName(String accountName) {
        return accountDao.getAccountByName(accountName);
    }

    @Override
    public boolean addPayment(MslePaymentPo paymentPo)
    {   paymentPo.setPaymentId(UUID.creatId());
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
            MslePaymentPo mypaymentPo=accountDao.getPaymentById(paymentId);
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
    public boolean updatePayment(MslePaymentPo paymentPo) {
        return accountDao.updatePayment(paymentPo);
    }

    @Override
    public MslePaymentPo getPaymentById(String id) {
        return accountDao.getPaymentById(id);
    }

    @Override
    public List<MslePaymentPo> getPaymentByBeginAndEndDay(String beginDay, String endDay) {
        return accountDao.getPaymentByBeginAndEndDay(beginDay, endDay);
    }

    @Override
    public List<MslePaymentPo> selectPaymentByType(String type) {
        return accountDao.selectPaymentByType(type);
    }

    @Override
    public List<MslePaymentPo> selectPayments() {
        return accountDao.selectPayments();
    }

    @Override
    public MsleAccountPo getAccountById(String id) {
        return accountDao.getAccountById(id);
    }

    @Override
    public List<MsleAccountPo> getAccount() {
        return accountDao.getAccount();
    }
}
