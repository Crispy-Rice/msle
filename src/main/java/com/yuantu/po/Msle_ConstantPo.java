package com.yuantu.po;

import lombok.Data;

@Data
public class Msle_ConstantPo {
    private String  constantId;
    private String constantCityStart;
    private String constantCityEnd;
    private Long constantDistance;
    private Double constantPrice;
    private Integer constantTimeSubstantial;
    private Integer constantTimeStandard;
    private Integer constantTimePosthaste;

    public Msle_ConstantPo(String constantId, String constantCityStart
            , String constantCityEnd, Long constantDistance
            , Double constantPrice, Integer constantTimeSubstantial
            ,Integer constantTimeStandard,Integer constantTimePosthaste) {
        this.constantId = constantId;
        this.constantCityStart = constantCityStart;
        this.constantCityEnd = constantCityEnd;
        this.constantDistance = constantDistance;
        this.constantPrice = constantPrice;
        this.constantTimeSubstantial = constantTimeSubstantial;
        this.constantTimeStandard = constantTimeStandard;
        this.constantTimePosthaste = constantTimePosthaste;
    }

    public Msle_ConstantPo( String constantCityStart
            , String constantCityEnd, Long constantDistance
            , Double constantPrice, Integer constantTimeSubstantial
            ,Integer constantTimeStandard,Integer constantTimePosthaste) {
        this.constantId = "null";
        this.constantCityStart = constantCityStart;
        this.constantCityEnd = constantCityEnd;
        this.constantDistance = constantDistance;
        this.constantPrice = constantPrice;
        this.constantTimeSubstantial = constantTimeSubstantial;
        this.constantTimeStandard = constantTimeStandard;
        this.constantTimePosthaste = constantTimePosthaste;
    }

    public String getConstantId() {
        return constantId;
    }

    public void setConstantId(String constantId) {
        this.constantId = constantId;
    }

    public String getConstantCityStart() {
        return constantCityStart;
    }

    public void setConstantCityStart(String constantCityStart) {
        this.constantCityStart = constantCityStart;
    }

    public String getConstantCityEnd() {
        return constantCityEnd;
    }

    public void setConstantCityEnd(String constantCityEnd) {
        this.constantCityEnd = constantCityEnd;
    }

    public Long getConstantDistance() {
        return constantDistance;
    }

    public void setConstantDistance(Long constantDistance) {
        this.constantDistance = constantDistance;
    }

    public Double getConstantPrice() {
        return constantPrice;
    }

    public void setConstantPrice(Double constantPrice) {
        this.constantPrice = constantPrice;
    }

    public Integer getConstantTimeSubstantial() {
        return constantTimeSubstantial;
    }

    public void setConstantTimeSubstantial(Integer constantTimeSubstantial) {
        this.constantTimeSubstantial = constantTimeSubstantial;
    }

    public Integer getConstantTimeStandard() {
        return constantTimeStandard;
    }

    public void setConstantTimeStandard(Integer constantTimeStandard) {
        this.constantTimeStandard = constantTimeStandard;
    }

    public Integer getConstantTimePosthaste() {
        return constantTimePosthaste;
    }

    public void setConstantTimePosthaste(Integer constantTimePosthaste) {
        this.constantTimePosthaste = constantTimePosthaste;
    }
}