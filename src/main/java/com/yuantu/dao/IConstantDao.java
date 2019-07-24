package com.yuantu.dao;

import com.yuantu.po.MsleConstantPo;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 *
 *@author  tai
 *@Time
 *常量表数据库操作
 *
 */
@Mapper
public interface IConstantDao {

    /**
     * 获取所有常量
     * @return  常量实体类集合
     */
    @Select("select * from msle_constant ")
    List<MsleConstantPo> getAllConstants();

    /**
     *
     * 根据起始和终点城市获取对应常量
     * @param msleConstantPo set了起始城市和终点城市的常量实体类
     * @return MsleConstantPo 起始终点城市与参数相同的常量
     *                        实体类
     */
    @Select("select * from msle_constant where" +
            " constant_City_Start ='${msleConstantPo.constantCityStart}'" +
            "and constant_City_End ='${msleConstantPo.constantCityEnd}'")
    MsleConstantPo getConstant(@Param("msleConstantPo") MsleConstantPo msleConstantPo);


    /**
     * 修改一条常量
     * @param msleConstantPo set了所有属性的常量实体类(必须全部填写)
     */
    @Update("update msle_constant  set " +
            "constant_City_Start ='${msleConstantPo.constantCityStart}'" +
            ",constant_City_End ='${msleConstantPo.constantCityEnd}'" +
            ",constant_Distance ='${msleConstantPo.constantDistance}'" +
            ",constant_Price ='${msleConstantPo.constantPrice}' " +
            ",constant_Time_Substantial='${msleConstantPo.constantTimeSubstantial}'" +
            ",constant_Time_Standard='${msleConstantPo.constantTimeStandard}'" +
            ",constant_Time_Posthaste='${msleConstantPo.constantTimePosthaste}'" +
            "where constant_Id = '${msleConstantPo.constantId}'")
    Integer updateConstant(@Param("msleConstantPo") MsleConstantPo msleConstantPo);


    /**
     * 增添一条常量
     * @param msleConstantPo set了所有属性的常量实体类(必须全部填写)
     */
    @Insert("insert into msle_constant " +
            "(constant_Id,constant_City_Start" +
            ",constant_City_End,constant_Distance,constant_Price" +
            ",constant_Time_Substantial,constant_Time_Standard,constant_Time_Posthaste) " +
            "values" +
            "( '${msleConstantPo.constantId}','${msleConstantPo.constantCityStart}'" +
            ",'${msleConstantPo.constantCityEnd}','${msleConstantPo.constantDistance}'" +
            ",'${msleConstantPo.constantPrice}','${msleConstantPo.constantTimeSubstantial}'" +
            ",'${msleConstantPo.constantTimeStandard}'" +
            ",'${msleConstantPo.constantTimePosthaste}')")
    Integer insertConstant(@Param("msleConstantPo") MsleConstantPo msleConstantPo);



}
