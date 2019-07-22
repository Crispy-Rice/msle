package com.yuantu.serviceinterface.organizationinterface;

import com.yuantu.po.Msle_OrganizationPo;
import com.yuantu.po.Msle_StaffPo;

import java.util.List;

public interface IOrganizationService {
    public List<Msle_StaffPo> getAllUsers();

    Msle_StaffPo getPersonnelInformation(String staffId);

    public Boolean updateBelongsOrganization (Msle_StaffPo msle_staffPo);

    public List<Msle_OrganizationPo> getAllOrganization();

    public String insertOrganization (Msle_OrganizationPo msle_organizationPo);

    public String deleteOrganization(String organizationId);


    public Boolean updateOrganization (Msle_OrganizationPo msle_organizationPo);
}
