package com.yuantu.dao;


import com.yuantu.po.Msle_OrganizationPo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface IOrganizationDao {

    //获得城市下营业厅
    @Select("select * from msle_organization  where" +
            " organization_city='${organization_city}'" +
            " and organization_type='servicehall'")
    List<Msle_OrganizationPo> getServicehallByCity(
            @Param("organization_city") String organizationCity);

    //获取所用机构
    @Select("select * from msle_organization ")
    List<Msle_OrganizationPo> getAllOrganization();

    //根据机构名找机构
    @Select("select * from msle_organization where " +
            "organization_name='${msle_organizationPo.organizationName}'")
    List<Msle_OrganizationPo> getOrganizationByName(
            @Param("msle_organizationPo") Msle_OrganizationPo msle_organizationPo);

    //物理删除一条机构记录
    @Delete("delete from msle_organization where organization_Id='${organizationId}'")
    void deleteOrganization(@Param("organizationId") String organizationId);


    //添加一个机构记录
    @Insert("insert into msle_organization values" +
            "('${msle_organizationPo.organizationId}'" +
            ",'${msle_organizationPo.organizationName}'" +
            ",'${msle_organizationPo.organizationType}'"+
            ",'${msle_organizationPo.organizationCity}')")
    void insertOrganization(@Param("msle_organizationPo") Msle_OrganizationPo msle_organizationPo);


    //修改一条机构记录
    @Update("update msle_organization set " +
            "organization_Name = '${msle_organizationPo.organizationName}'" +
            ",organization_Type ='${msle_organizationPo.organizationType}' " +
            ",organization_City ='${msle_organizationPo.organizationCity}' " +
            "where organization_Id = '${msle_organizationPo.organizationId}'")
    void updateOrganization(@Param("msle_organizationPo") Msle_OrganizationPo msle_organizationPo);

}
