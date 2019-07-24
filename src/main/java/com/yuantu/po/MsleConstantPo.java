package com.yuantu.po;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 *
 *@author tai
 *@Time
 *常量表实体类
 *
 */
@Data
public class MsleConstantPo {
    @Size(min=12,max=12,message="id长度错误")
    private String  constantId;
    /**
    起始城市
     */
    @NotBlank
    private String constantCityStart;
    /**
     终点城市
     */
    @NotBlank
    private String constantCityEnd;
    /**
     城市间距离
     */
    @Max(value=2000,message="城市距离不合法")
    @Min(value=1,message="城市距离不合法")
    private Long constantDistance;
    /**
     价格
     */
    @NotNull
    private Double constantPrice;
    /**
     预估时间(经济方式)
     */
    @Max(value=5,message="经济预估时间不合法")
    @Min(value=1,message="经济预估时间不合法")
    private Integer constantTimeSubstantial;
    /**
     预估时间(标准方式)
     */
    @Max(value=3,message="标准预估时间不合法")
    @Min(value=1,message="标准预估时间不合法")
    private Integer constantTimeStandard;
    /**
     预估时间(特快方式)
     */
    @Max(value=2,message="特快预估时间不合法")
    @Min(value=1,message="特快预估时间不合法")
    private Integer constantTimePosthaste;
}