package com.yuantu.po.accountPo;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Data
@ToString
/**
 * @ClassName MsleaccountPo
 * @Description //账户po类
 * @Author  yukun
 * @Date 19:00 2019/7/22
 * @Version  1.0
 **/
public class MsleaccountPo {
    @Size(min=12,max=12,message = "id长度错误")
    /**账户id
     *
     */
    private String  accountId;
    /**账户名称
     *
     */
    private String  accountName;
    @Max(value = 100000000 ,message="余额过多")
    @Min(value =0,message = "余额必须大于等于0")
    /**账户余额
     *
     */
    private Double  accountSurplus;
}

