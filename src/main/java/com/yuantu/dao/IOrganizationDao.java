package com.yuantu.dao;


import com.yuantu.po.MsleOrganizationPo;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 *
 *@author tai
 *@Time
 *机构表数据库操作
 *
 */
@Mapper
public interface IOrganizationDao {

    //获得城市下营业厅
    @Select("select * from msle_organization  where" +
            " organization_city='${organization_city}'" +
            " and organization_type='servicehall'")
    List<MsleOrganizationPo> getServicehallByCity(
            @Param("organization_city") String organizationCity);

    //获取所用机构
    @Select("select * from msle_organization ")
    List<MsleOrganizationPo> getAllOrganization();

    //根据机构名找机构
    @Select("select * from msle_organization where " +
            "organization_name='${msleOrganizationPo.organizationName}'")
    List<MsleOrganizationPo> getOrganizationByName (
            @Param("msleOrganizationPo") MsleOrganizationPo msleOrganizationPo);

    //物理删除一条机构记录
    @Delete("delete from msle_organization where organization_Id='${organizationId}'")
    Integer deleteOrganization(@Param("organizationId") String organizationId);


    //添加一个机构记录
    @Insert("insert into msle_organization values" +
            "('${msleOrganizationPo.organizationId}'" +
            ",'${msleOrganizationPo.organizationName}'" +
            ",'${msleOrganizationPo.organizationType}'"+
            ",'${msleOrganizationPo.organizationCity}')")
    Integer insertOrganization(@Param("msleOrganizationPo") MsleOrganizationPo msleOrganizationPo);


    //修改一条机构记录
    @Update("update msle_organization set " +
            "organization_Name = '${msleOrganizationPo.organizationName}'" +
            ",organization_Type ='${msleOrganizationPo.organizationType}' " +
            ",organization_City ='${msleOrganizationPo.organizationCity}' " +
            "where organization_Id = '${msleOrganizationPo.organizationId}'")
    Integer updateOrganization(@Param("msleOrganizationPo") MsleOrganizationPo msleOrganizationPo);

}
