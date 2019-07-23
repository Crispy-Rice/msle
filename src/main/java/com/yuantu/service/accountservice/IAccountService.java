package com.yuantu.service.accountservice;

import com.yuantu.po.accountPo.MsleaccountPo;
import com.yuantu.po.accountPo.MslepaymentPo;
import com.yuantu.po.accountPo.MsleReceiptPo;


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

    boolean addAccount(MsleaccountPo accountPo);


    boolean updateAccount(String accountName,Double accountSurplus);


    boolean deleteAccountById(String id);

    MsleaccountPo getAccountByName(String accountName);



    boolean addPayment(MslepaymentPo paymentPo);


    boolean updatePaymentDeleteState(String paymentDeleteState,
                                     String paymentId);


    boolean updatePaymentStatus(String paymentStatus, String paymentId);



    boolean deletePaymentById( String id);


    boolean updatePayment(MslepaymentPo paymentPo);


    MslepaymentPo getPaymentById(String id);



    List<MslepaymentPo> getPaymentByBeginAndEndDay(String beginDay, String endDay);


    List<MslepaymentPo> selectPaymentByType(String type);


    List<MslepaymentPo> selectPayments();



    MsleaccountPo getAccountById(String Id);


    List<MsleaccountPo> getAccount();

}
