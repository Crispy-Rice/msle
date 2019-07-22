package com.yuantu.po;

import lombok.Data;

@Data
public class Msle_LogisticsPo {
    private String logisticsId;
    private Long logisticsOrderid;
    private String logisticsSender;
    private String logisticsSenderleavetime;
    private String logisticsSenderServicehall;
    private String logisticsSenderServicehallqrrivetime;
    private String logisticsSenderServicehallleavetime;
    private String logisticsSenderIntermediate;
    private String logisticsSenderIntermediatearrivetime;
    private String logisticsSenderIntermediateleavetime;
    private String logisticsRecipientsServicehall;
    private String logisticsRecipientsServicehallarrivetime;
    private String logisticsRecipientsServicehallleavetime;
    private String logisticsRecipientsIntermediate;
    private String logisticsRecipientsIntermediatearrivetime;
    private String logisticsRecipientsIntermediateleavetime;
    private String logisticsCourierId;
    private String logisticsCourierIdtime;
    private String logisticsRecipients;
    private String logisticsRecipientstime;

   }

