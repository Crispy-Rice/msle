package com.yuantu.service.accountservice.impl;

import com.yuantu.constant.ListStatus;
import com.yuantu.dao.accountdao.IAccountDao;
import com.yuantu.po.accountpo.MsleAccountPO;
import com.yuantu.po.accountpo.MslePaymentPO;
import com.yuantu.po.accountpo.MsleReceiptPO;
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
    public boolean addReceipt(MsleReceiptPO receiptPO) {

        receiptPO.setReceiptId(UUID.createID());
        return accountDao.addReceipt(receiptPO);
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
            MsleReceiptPO myReceipPO=accountDao.getReceiptById(receiptId);
            double receiptMoney=myReceipPO.getReceiptCollections();
            String accountName=myReceipPO.getReceiptAccountName();
            double accountSurplus=accountDao.getAccountByName(accountName).getAccountSurplus();
            double newaccountSurplus=accountSurplus+receiptMoney;
            return accountDao.updateAccount(accountName,newaccountSurplus);

        }
       else {
            return  accountDao.updateReceiptStatuS(receiptStatus, receiptId);
        }
    }

    @Override
    public MsleReceiptPO getReceiptById(String id) {
        return accountDao.getReceiptById(id);
    }

    @Override
    public List<MsleReceiptPO> getReceipt() {
        return accountDao.getReceipt();
    }

    @Override
    public List<MsleReceiptPO> getReceiptByHallName(String orgazation) {
        return accountDao.getReceiptByHallName(orgazation);
    }

    @Override
    public Double getTotalReceiptByHallName(String orgazation) {
        return accountDao.getTotalReceiptByHallName(orgazation);
    }

    @Override
    public List<MsleReceiptPO> getReceiptByBeginAndEndDay(String beginDay, String endDay) {
        return accountDao.getReceiptByBeginAndEndDay(beginDay, endDay);
    }

    @Override
    public Double getTotalReceiptByBeginAndEndDay(String beginDay, String endDay) {
        return accountDao.getTotalReceiptByBeginAndEndDay(beginDay, endDay);
    }

    @Override
    public boolean addAccount(MsleAccountPO accountPO) {

        accountPO.setAccountId(UUID.createID());
        return accountDao.addAccount(accountPO);
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
    public MsleAccountPO getAccountByName(String accountName) {
        return accountDao.getAccountByName(accountName);
    }

    @Override
    public boolean addPayment(MslePaymentPO paymentPO)
    {   paymentPO.setPaymentId(UUID.createID());
        return accountDao.addPayment(paymentPO);
    }

    @Override
    public boolean updatePaymentDeleteState(String paymentDeleteState, String paymentId) {
        return accountDao.updatePaymentDeleteState(paymentDeleteState, paymentId);
    }

    @Override
    public boolean updatePaymentStatus(String paymentStatus, String paymentId) {
        accountDao.updatePaymentStatus(paymentStatus, paymentId);
        if(paymentStatus.equals(ListStatus.SUCCESS)){
            MslePaymentPO myPaymentPO=accountDao.getPaymentById(paymentId);
            double payMoney=myPaymentPO.getPaymentAmount();
            String accountName=myPaymentPO.getPaymentAccount();
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
    public boolean updatePayment(MslePaymentPO paymentPO) {
        return accountDao.updatePayment(paymentPO);
    }

    @Override
    public MslePaymentPO getPaymentById(String id) {
        return accountDao.getPaymentById(id);
    }

    @Override
    public List<MslePaymentPO> getPaymentByBeginAndEndDay(String beginDay, String endDay) {
        return accountDao.getPaymentByBeginAndEndDay(beginDay, endDay);
    }

    @Override
    public List<MslePaymentPO> selectPaymentByType(String type) {
        return accountDao.selectPaymentByType(type);
    }

    @Override
    public List<MslePaymentPO> selectPayments() {
        return accountDao.selectPayments();
    }

    @Override
    public MsleAccountPO getAccountById(String id) {
        return accountDao.getAccountById(id);
    }

    @Override
    public List<MsleAccountPO> getAccount() {
        return accountDao.getAccount();
    }
}
