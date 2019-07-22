package com.yuantu.po.accountpo;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 *账户PO类
 */
@Data
public class MsleAccountPO {

    private String  accountId;//账户id
    private String  accountName;//账户名称
    private Double  accountSurplus;//账户余额


//    public MsleAccountPO(String  accountId, String accountName, Double accountSurplus) {
//        this.account_id = accountId;
//        this.account_name = accountName;
//        this.account_surplus = accountSurplus;
//    }
//
//    public MsleAccountPO() {
//    }
//
//    public String getAccountId() {
//        return accountId;
//    }
//
//    public void setAccountId(String accountId) {
//        this.accountId = accountId;
//    }
//
//    public String getAccountName() {
//        return accountName;
//    }
//
//    public void setAccountName(String accountName) {
//        this.accountName = accountName;
//    }
//
//    public Double getAccountSurplus() {
//        return accountSurplus;
//    }
//
//    public void setAccountSurplus(Double accountSurplus) {
//        this.accountSurplus = accountSurplus;
//    }
}

