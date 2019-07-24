package com.yuantu.serviceinterface.organizationinterface;

import com.yuantu.po.MsleOrganizationPo;
import com.yuantu.po.MsleStaffPo;

import java.util.List;

/**
 *
 *@author tai
 *@Time
 *人员机构管理接口
 *
 */
public interface IOrganizationService {
    List<MsleStaffPo> getAllUsers ();

    MsleStaffPo getPersonnelInformation (String staffId);

    Integer updateBelongsOrganization (MsleStaffPo msleStaffPo);

    List<MsleOrganizationPo> getAllOrganization ();

    String insertOrganization (MsleOrganizationPo msleOrganizationPo);

    String deleteOrganization (String organizationId);

    Integer updateOrganization (MsleOrganizationPo msleOrganizationPo);
}
