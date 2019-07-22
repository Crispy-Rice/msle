package com.yuantu.dao;

import com.yuantu.po.Msle_ConstantPo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface IConstantDao {

    //查询所有常量
    @Select("select * from msle_constant ")
    List<Msle_ConstantPo> getAllConstants();

    //查询一条常量
    @Select("select * from msle_constant where" +
            "constant_City_Start ='${msle_constantPo.constantCityStart}'" +
            "and constant_City_End ='${msle_constantPo.constantCityEnd}'")
    Msle_ConstantPo getConstant(@Param("msle_constantPo") Msle_ConstantPo msle_constantPo);


    //修改一条常量记录
    @Update("update msle_constant  set " +
            "constant_City_Start ='${msle_constantPo.constantCityStart}'" +
            ",constant_City_End ='${msle_constantPo.constantCityEnd}'" +
            ",constant_Distance ='${msle_constantPo.constantDistance}'" +
            ",constant_Price ='${msle_constantPo.constantPrice}' " +
            ",constant_Time_Substantial='${msle_constantPo.constantTimeSubstantial}'" +
            ",constant_Time_Standard='${msle_constantPo.constantTimeStandard}'" +
            ",constant_Time_Posthaste='${msle_constantPo.constantTimePosthaste}'" +
            "where constant_Id = '${msle_constantPo.constantId}'")
    void updateConstant(@Param("msle_constantPo") Msle_ConstantPo msle_constantPo);


    //添加一条常量记录
    @Insert("insert into msle_constant " +
            "(constant_Id,constant_City_Start" +
            ",constant_City_End,constant_Distance,constant_Price" +
            ",constant_Time_Substantial,constant_Time_Standard,constant_Time_Posthaste) " +
            "values" +
            "( '${msle_constantPo.constantId}','${msle_constantPo.constantCityStart}'" +
            ",'${msle_constantPo.constantCityEnd}','${msle_constantPo.constantDistance}'" +
            ",'${msle_constantPo.constantPrice}','${msle_constantPo.constantTimeSubstantial}'" +
            ",'${msle_constantPo.constantTimePosthaste}'" +
            ",'${msle_constantPo.constantTimePosthaste}')")
    void insertConstant(@Param("msle_constantPo") Msle_ConstantPo msle_constantPo);



}
