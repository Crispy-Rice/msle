package com.yuantu.po;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Size;

/**
 *
 *@author tai
 *@Time
 *物流表实体类
 *
 */
@Data
public class MsleLogisticsPo {
    @Size(min=12,max=12,message="id长度错误")
    private String logisticsId;
    /**
     * 物流表对应订单(订单)
     */
    @Length(min=2, max=20,message="姓名长度有误")
    private String logisticsOrderid;
    /**
     * 寄件人
     */
    private String logisticsSender;
    /**
     * 离开寄件人时间
     */
    private String logisticsSenderleavetime;
    /**
     * 起始城市营业厅id
     */
    @Size(min=12,max=12,message="起始城市营业厅id长度错误")
    private String logisticsSenderServicehall;
    /**
     * 到达起始城市营业厅时间
     */
    private String logisticsSenderServicehallarrivetime;
    /**
     * 离开起始城市营业厅时间
     */
    private String logisticsSenderServicehallleavetime;
    /**
     * 起始城市中转中心id
     */
    @Size(min=12,max=12,message="起始城市中转中心id长度错误")
    private String logisticsSenderIntermediate;
    /**
     * 到达起始城市中转中心时间
     */
    private String logisticsSenderIntermediatearrivetime;
    /**
     * 离开起始城市中转中心时间
     */
    private String logisticsSenderIntermediateleavetime;
    /**
     * 终点城市营业厅id
     */
    @Size(min=12,max=12,message="终点城市营业厅id长度错误")
    private String logisticsRecipientsServicehall;
    /**
     * 到达终点城市营业厅时间
     */
    private String logisticsRecipientsServicehallarrivetime;
    /**
     * 离开终点城市营业厅时间
     */
    private String logisticsRecipientsServicehallleavetime;
    /**
     * 终点城市中转中心id
     */
    @Size(min=12,max=12,message="终点城市中转中心id长度错误")
    private String logisticsRecipientsIntermediate;
    /**
     * 到达终点城市中转中心时间
     */
    private String logisticsRecipientsIntermediatearrivetime;
    /**
     * 离开终点城市中转中心时间
     */
    private String logisticsRecipientsIntermediateleavetime;
    /**
     * 派件员id
     */
    @Size(min=12,max=12,message="id长度错误")
    private String logisticsCourierId;
    /**
     * 派件员接收到快递时间
     */
    private String logisticsCourierIdtime;
    /**
     * 收件人
     */
    @Length(min=2, max=20,message="姓名长度有误")
    private String logisticsRecipients;
    /**
     * 快递签收时间
     */
    private String logisticsRecipientstime;

   }

