package com.yuantu.dao.depositorydao;

import com.yuantu.po.depositorypo.MsleStorehousePO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IDepositoryDao {
    @Select("select * from msle_storehouse where storehouse_id='${storehouseId}'")
    List<MsleStorehousePO> getAreasById(@Param("storehouseId") String storehouseId);

    @Select("select * from msle_storehouse where storehouse_id='${storehouseId}' " +
            "and storehouse_areaid='${storehouseAreaId}'")
    MsleStorehousePO getAlertLineById(@Param("storehouseId") String storehouseId,
                                      @Param("storehouseAreaId") Integer storehouseAreaId);

    @Update("update msle_storehouse set storehouse_alertLine='${alertline}' where " +
            "storehouse_id='${storehouseId}'and storehouse_areaid='${areaid}'")
    boolean updateAlertLineById(@Param("storehouseId") String storehouseid,
                                @Param("areaid") Integer areaid,
                                @Param("alertline") Double alertline);

    @Select("select storehouseState_state from msle_storehousestate where " +
            "storehousestate_storehouseid='${storehouseId}' and storehouseState_areano=" +
            "'${storehouseStateAreaNo}' and storehouseState_lineno='${storehouseStateLineNo}'" +
            "and storehouseState_shelfno='${storehouseStateShelfNo}' and storehouseState_postionno" +
            "='${storehouseStatePostionNo}'")
    String getPositionState(@Param("storehouseId") String storehouseId,
                                               @Param("storehouseStatePostionNo") Integer storehouseStatePostionNo,
                                               @Param("storehouseStateAreaNo") Integer storehouseStateAreaNo,
                                               @Param("storehouseStateLineNo") Integer storehouseStateLineNo,
                                               @Param("storehouseStateShelfNo") Integer storehouseStateShelfNo);

    @Update("update msle_storehousestate set storehouseState_state='${storehouseStateState}' where " +
            "storehousestate_storehouseid='${storehouseId}' and storehouseState_areano=" +
            "'${storehouseStateAreaNo}' and storehouseState_lineNo='${storehouseStateLineNo}'" +
            "and storehouseState_shelfNo='${storehouseStateShelfNo}' and storehouseState_postionNo" +
            "='${storehouseStatePostionNo}'")
    boolean updatePositionState(@Param("storehouseStateState") String storehouseStateState,
                                @Param("storehouseId") String storehouseId,
                                @Param("storehouseStatePostionNo") Integer storehouseStatePostionNo,
                                @Param("storehouseStateAreaNo") Integer storehouseStateAreaNo,
                                @Param("storehouseStateLineNo") Integer storehouseStateLineNo,
                                @Param("storehouseStateShelfNo") Integer storehouseStateShelfNo);


}
