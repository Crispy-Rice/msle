package com.yuantu.dao.accountdao;


import com.yuantu.po.accountpo.MslePaymentPo;
import com.yuantu.po.accountpo.MsleReceiptPo;
import com.yuantu.po.accountpo.MsleAccountPo;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IAccountDao {
    @Insert("insert into msle_receipt values(#{receiptId},#{receiptNo},#{receiptDate}," +
            "#{receiptHall},#{receiptPostman},#{receiptCollections}," +
            "#{receiptStatus},#{receiptOrderId},#{receiptAccountName},#{receiptDeleteState})")
    boolean addReceipt(MsleReceiptPo receiptPo);

    @Delete("delete from msle_receipt where receipt_id='${receiptId}'")
    boolean deleteReceiptById(@Param("receiptId") String receiptId);

    @Update("update msle_receipt set receipt_deleteState='${receiptDeleteState}' where receipt_id='${receiptId}'")
    boolean updateReceiptDeleteState(@Param("receiptDeleteState") String receiptDeleteState
            , @Param("receiptId") String receiptId);

    @Update("update msle_receipt set receipt_status='${receiptStatus}' where receipt_id='${receiptId}'")
    boolean updateReceiptStatus(@Param("receiptStatus") String receiptStatus
            , @Param("receiptId") String receiptId);

    @Select("select * from msle_receipt where receipt_id='${id}'")
    MsleReceiptPo getReceiptById(@Param("id") String id);

    @Select("select * from msle_receipt")
    List<MsleReceiptPo> getReceipt();

    @Select("select * from msle_receipt where receipt_hall='${hallname}'")
    List<MsleReceiptPo> getReceiptByHallName(@Param("hallname") String hallName);

    @Select("select sum(receipt_collections) from msle_receipt where receipt_hall='${hallname}'")
    Double getTotalReceiptByHallName(@Param("hallname") String hallName);

    @Select("select * from msle_receipt where  TO_SECONDS(receipt_date) BETWEEN " +
            "TO_SECONDS('${beginDay}') AND TO_SECONDS('${endDay}')")
    List<MsleReceiptPo> getReceiptByBeginAndEndDay(@Param("beginDay") String beginDay,
                                                   @Param("endDay") String endDay);

    @Select("select sum(receipt_collections) from msle_receipt where  TO_SECONDS(receipt_date) BETWEEN " +
            "TO_SECONDS('${beginDay}') AND TO_SECONDS('${endDay}')")
    Double getTotalReceiptByBeginAndEndDay(@Param("beginDay") String beginDay,
                                                    @Param("endDay") String endDay);

    @Insert("insert into msle_account values(#{accountId},#{accountName}," +
            "#{accountSurplus})")
    boolean addAccount(MsleAccountPo accountPo);

    @Update("update msle_account set account_surplus='${accountSurplus}' " +
            "where account_name='${accountName}'")
    boolean updateAccount(@Param("accountName") String accountName
            ,@Param("accountSurplus") Double accountSurplus);

    @Delete("delete from msle_account where account_id='${id}'")
    boolean deleteAccountById(@Param("id") String id);

    @Select("select * from msle_account where account_name='${accountName}'")
    MsleAccountPo getAccountByName(@Param("accountName") String accountName);

    @Insert("insert into msle_payment values(#{paymentId},#{paymentDate}," +
            "#{paymentAmount},#{paymentPayer},#{paymentAccount}," +
            "#{paymentType},#{paymentRemark},#{paymentStatus},#{paymentDeleteState})")
    boolean addPayment(MslePaymentPo paymentPo);

    @Delete("delete from msle_payment where payment_id='${id}'")
    boolean deletePaymentById(@Param("id") String id);

    @Update("update msle_payment set payment_date=#{paymentDate}," +
            "payment_amount=#{paymentAmount},payment_payer=#{paymentPayer}," +
            "payment_account=#{paymentAccount},payment_type=#{paymentType}," +
            "payment_remark=#{paymentRemark},payment_status=#{paymentStatus} " +
            "where payment_id=#{paymentId}")
    boolean updatePayment(MslePaymentPo paymentPo);

    @Update("update msle_payment set payment_deleteState='${paymentDeleteState}' where payment_id='${paymentId}'")
    boolean updatePaymentDeleteState(@Param("paymentDeleteState") String paymentDeleteState,
                                     @Param("paymentId") String paymentId);

    @Update("update msle_payment set payment_status='${paymentStatus}' where payment_id='${paymentId}'")
    boolean updatePaymentStatus(@Param("paymentStatus") String paymentStatus,
                                     @Param("paymentId") String paymentId);

    @Select("select * from msle_payment where payment_id='${id}'")
    MslePaymentPo getPaymentById(@Param("id") String id);


    @Select("select * from msle_payment where  TO_SECONDS(payment_date) BETWEEN " +
            "TO_SECONDS('${beginDay}') AND TO_SECONDS('${endDay}')")
    List<MslePaymentPo> getPaymentByBeginAndEndDay(@Param("beginDay") String beginDay,
                                                   @Param("endDay") String endDay);

    @Select("select * from msle_payment where payment_type='${type}'")
    List<MslePaymentPo> selectPaymentByType(@Param("type") String type);

    @Select("select * from msle_payment")
    List<MslePaymentPo> selectPayments();


    @Select("select * from msle_account where account_id='${id}'")
    MsleAccountPo getAccountById(@Param("id") String id);

    @Select("select * from msle_account")
    List<MsleAccountPo> getAccount();


}
