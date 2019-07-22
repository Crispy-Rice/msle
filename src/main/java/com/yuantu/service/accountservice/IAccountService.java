package com.yuantu.service.accountservice;

import com.yuantu.po.accountpo.MsleAccountPo;
import com.yuantu.po.accountpo.MslePaymentPo;
import com.yuantu.po.accountpo.MsleReceiptPo;


import java.util.List;

public interface IAccountService {

    boolean addReceipt(MsleReceiptPo receiptPo);

    boolean deleteReceiptById(String receiptId);

    boolean updateReceiptDeleteState(String receiptDeleteState
            , String receiptId);

    boolean updateReceiptStatuS(String receiptStatus
            , String receiptId);


    MsleReceiptPo getReceiptById(String id);


    List<MsleReceiptPo> getReceipt();


    List<MsleReceiptPo> getReceiptByHallName(String orgazation);


    Double getTotalReceiptByHallName(String orgazation);


    List<MsleReceiptPo> getReceiptByBeginAndEndDay(String beginDay, String endDay);


    Double getTotalReceiptByBeginAndEndDay( String beginDay, String endDay);

    boolean addAccount(MsleAccountPo accountPO);


    boolean updateAccount(String accountName,Double accountSurplus);


    boolean deleteAccountById(String id);

    MsleAccountPo getAccountByName(String accountName);



    boolean addPayment(MslePaymentPo paymentPO);


    boolean updatePaymentDeleteState(String paymentDeleteState,
                                     String paymentId);


    boolean updatePaymentStatus(String paymentStatus, String paymentId);



    boolean deletePaymentById( String id);


    boolean updatePayment(MslePaymentPo paymentPO);


    MslePaymentPo getPaymentById(String id);



    List<MslePaymentPo> getPaymentByBeginAndEndDay(String beginDay, String endDay);


    List<MslePaymentPo> selectPaymentByType(String type);


    List<MslePaymentPo> selectPayments();



    MsleAccountPo getAccountById(String Id);


    List<MsleAccountPo> getAccount();

}
