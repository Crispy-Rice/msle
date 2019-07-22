package com.yuantu.service.accountservice;

import com.yuantu.po.accountpo.MsleAccountPO;
import com.yuantu.po.accountpo.MslePaymentPO;
import com.yuantu.po.accountpo.MsleReceiptPO;


import java.util.List;

public interface IAccountService {

    boolean addReceipt(MsleReceiptPO receiptPO);

    boolean deleteReceiptById(String receiptId);

    boolean updateReceiptDeleteState(String receiptDeleteState
            , String receiptId);

    boolean updateReceiptStatuS(String receiptStatus
            , String receiptId);


    MsleReceiptPO getReceiptById(String id);


    List<MsleReceiptPO> getReceipt();


    List<MsleReceiptPO> getReceiptByHallName(String orgazation);


    Double getTotalReceiptByHallName(String orgazation);


    List<MsleReceiptPO> getReceiptByBeginAndEndDay(String beginDay, String endDay);


    Double getTotalReceiptByBeginAndEndDay( String beginDay, String endDay);

    boolean addAccount(MsleAccountPO accountPO);


    boolean updateAccount(String accountName,Double accountSurplus);


    boolean deleteAccountById(String id);

    MsleAccountPO getAccountByName(String accountName);



    boolean addPayment(MslePaymentPO paymentPO);


    boolean updatePaymentDeleteState(String paymentDeleteState,
                                     String paymentId);


    boolean updatePaymentStatus(String paymentStatus, String paymentId);



    boolean deletePaymentById( String id);


    boolean updatePayment(MslePaymentPO paymentPO);


    MslePaymentPO getPaymentById(String id);



    List<MslePaymentPO> getPaymentByBeginAndEndDay(String beginDay, String endDay);


    List<MslePaymentPO> selectPaymentByType(String type);


    List<MslePaymentPO> selectPayments();



    MsleAccountPO getAccountById(String Id);


    List<MsleAccountPO> getAccount();

}
