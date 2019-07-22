package com.yuantu.service.organizationservice;

import com.yuantu.dao.IOrganizationDao;
import com.yuantu.dao.IStaffDao;
import com.yuantu.po.Msle_OrganizationPo;
import com.yuantu.po.Msle_StaffPo;
import com.yuantu.service.strategyservice.StrategyServiceImpl;
import com.yuantu.serviceinterface.organizationinterface.IOrganizationService;
import com.yuantu.serviceinterface.staffinterface.IStaffService;
import com.yuantu.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrganizationServiceImpl implements IOrganizationService {
    @Resource
    private IOrganizationDao iOrganizationDao;
    @Resource
    private StrategyServiceImpl strategyService;
    @Resource
    private IStaffDao iStaffDao;
    @Autowired
    private IStaffService iStaffService;

    @Override
    public List<Msle_StaffPo> getAllUsers() {
        return strategyService.geAllUsers();
    }

    @Override
    public Msle_StaffPo getPersonnelInformation(String staffId) {
        return iStaffService.getPersonnelInformation(staffId);
    }

    @Override
    public Boolean updateBelongsOrganization(Msle_StaffPo msle_staffPo) {
        iStaffDao.updateBelongsOrganization(msle_staffPo);
        return true;
    }

    @Override
    public List<Msle_OrganizationPo> getAllOrganization() {
        return iOrganizationDao.getAllOrganization();
    }

    @Override
    public String insertOrganization(Msle_OrganizationPo msle_organizationPo) {
        List<Msle_OrganizationPo> list=iOrganizationDao.getOrganizationByName(msle_organizationPo);
        if (list.size()==0){
            String id="wrong";
            id= UUID.createID();
            msle_organizationPo.setOrganizationId(id);
            iOrganizationDao.insertOrganization(msle_organizationPo);
            return "true";
        }else{
            return "Organization have, can not add";
        }
    }

    @Override
    public String deleteOrganization(String organizationId) {
        List<Msle_StaffPo> list=iStaffDao.getPersonnelByOrganization(organizationId);
        if (list.size()==0){
            iOrganizationDao.deleteOrganization(organizationId);
            return "true";
        }else{
            return "Some people. Do not delete";
        }

    }



    @Override
    public Boolean updateOrganization(Msle_OrganizationPo msle_organizationPo) {
        iOrganizationDao.updateOrganization(msle_organizationPo);
        return true;
    }
}
