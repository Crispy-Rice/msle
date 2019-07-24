package com.yuantu.service.organizationservice;

import com.yuantu.dao.IOrganizationDao;
import com.yuantu.dao.IStaffDao;
import com.yuantu.po.MsleOrganizationPo;
import com.yuantu.po.MsleStaffPo;
import com.yuantu.service.strategyservice.StrategyServiceImpl;
import com.yuantu.serviceinterface.organizationinterface.IOrganizationService;
import com.yuantu.serviceinterface.staffinterface.IStaffService;
import com.yuantu.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 *
 *@author tai
 *@Time
 *机构管理接口是实现类
 *
 */
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
    public List<MsleStaffPo> getAllUsers() {
        return strategyService.geAllUsers();
    }

    @Override
    public MsleStaffPo getPersonnelInformation(String staffId) {
        return iStaffService.getPersonnelInformation(staffId);
    }

    @Override
    public Integer updateBelongsOrganization(MsleStaffPo msleStaffPo) {
        return iStaffDao.updateBelongsOrganization(msleStaffPo);
    }

    @Override
    public List<MsleOrganizationPo> getAllOrganization() {
        return iOrganizationDao.getAllOrganization();
    }

    /**
     * 营业厅添加时要排除同名
     * @param msleOrganizationPo
     * @return
     */
    @Override
    public String insertOrganization(MsleOrganizationPo msleOrganizationPo) {
        List<MsleOrganizationPo> list=iOrganizationDao.getOrganizationByName(msleOrganizationPo);
        if (list.size()==0){
            String id="wrong";
            id= UUID.creatId();
            msleOrganizationPo.setOrganizationId(id);
            iOrganizationDao.insertOrganization(msleOrganizationPo);
            return "true";
        }else{
            return "Organization have, can not add";
        }
    }

    /**
     * 机构下有员工时禁止删除
     * @param organizationId
     * @return
     */
    @Override
    public String deleteOrganization(String organizationId) {
        List<MsleStaffPo> list=iStaffDao.getPersonnelByOrganization(organizationId);
        if (list.size()==0){
            iOrganizationDao.deleteOrganization(organizationId);
            return "true";
        }else{
            return "Some people. Do not delete";
        }
    }



    @Override
    public Integer updateOrganization(MsleOrganizationPo msleOrganizationPo) {
        return iOrganizationDao.updateOrganization(msleOrganizationPo);
    }
}
