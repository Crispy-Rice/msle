package com.yuantu.dao.depositorydao;

import com.yuantu.po.depositorypo.MsleGoDownEntryPO;
import com.yuantu.po.depositorypo.MsleOutBoundPO;
import com.yuantu.po.depositorypo.MsleReservePO;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IReserveDao {
    /**
     * 添加入库单
     * @param goDownEntryPO
     * @return 是否成功
     */
    @Insert("insert into msle_godownentry values(#{godownentryId},#{godownentryExpressNo}," +
            "#{godownentryStorehouseId}," +
            "#{godownentryGodownentryId},#{godownenrtyDestination},#{godownenrtyEntryDate}," +
            "#{godownentryAreaNo},#{godownentryLineNo},#{godownentryShelfNo}," +
            "#{godownentryPositionNo},#{godownentryStatus})")
    boolean addGodownentry(MsleGoDownEntryPO goDownEntryPO);

    /**
     * 添加库存信息
     * @param goDownEntryPO
     * @return
     */
    @Insert("insert into msle_reserve values('${id}','${goDownEntryPO.godownentryStorehouseId}'," +
            "'${goDownEntryPO.godownentryExpressNo}','${goDownEntryPO.godownenrtyEntryDate}'," +
            "'${goDownEntryPO.godownenrtyDestination}'," +
            "'${goDownEntryPO.godownentryAreaNo}','${goDownEntryPO.godownentryLineNo}'," +
            "'${goDownEntryPO.godownentryShelfNo}'," +
            "'${goDownEntryPO.godownentryPositionNo}','待盘点','草稿')")
    boolean addReserve(@Param("goDownEntryPO") MsleGoDownEntryPO goDownEntryPO , @Param("id") String id);

    /**
     * 添加出库单
     * @param outBoundPO
     * @return
     */
    @Insert("insert into msle_outbound values(#{outboundId},#{outboundStorehouseId}," +
            "#{outboundOutboundId},#{outboundExressNo},#{outboundDestination}," +
            "#{outboundOutdate},#{outboundAreaNo},#{outboundLineNo}," +
            "#{outboundShelfNo},#{outboundPositionNo},#{outboundStatus})")
    boolean addOutBound(MsleOutBoundPO outBoundPO);

    /**
     * 删除库存信息
     * @param expressNo
     * @return
     */
    @Delete("delete from msle_reserve where reserve_expressNo='${expressNo}'")
    boolean deleteReserve(@Param("expressNo") String expressNo);

    /**
     * 获取指定时间段内的库存信息
     * @param beginTime
     * @param clourse
     * @return
     */
    @Select("select * from msle_reserve where  TO_SECONDS(reserve_entryDate) BETWEEN " +
            "TO_SECONDS('${begintime}') AND TO_SECONDS('${clourse}')" +
            " and reserve_storehouseId='${storehouseid}' ")
    List<MsleReservePO> getReserveByClosurePoint(@Param("begintime") String beginTime,
                                                 @Param("clourse") String clourse,
                                                 @Param("storehouseid") String storehousseid);

    /**
     * 修改库存检查状态
     * @param reserveId
     * @param checkStatus
     * @return
     */
    @Update("update msle_reserve set reserve_checkStatus='${checkStatus}'where reserve_id='${reserveId}'")
    boolean updateReserve(@Param("reserveId") String reserveId,@Param("checkStatus") String checkStatus);

    /**
     * 获取仓库内特定分区内的快递数量
     * @param storehouseid
     * @param reserveAreaNo
     * @return
     */
    @Select("select count(*) from msle_reserve where reserve_storehouseId='${storehouseid}'" +
            " and reserve_areaNo='${reserveAreaNo}' ")
    Integer getReserveNumByStorehouseIdAndAreaId(
            @Param("storehouseid") String storehouseid, @Param("reserveAreaNo") Integer reserveAreaNo);



    @Select("select * from msle_godownentry where godownentry_id='${godownentryId}'")
    MsleGoDownEntryPO getGoDownEntryById(@Param("godownentryId") String godownentryId);

    @Select("select * from msle_godownentry where godownentry_godownentryid='${godownentryGodownentryId}'")
    List<MsleGoDownEntryPO> getGoDownEntryByListId(@Param("godownentryGodownentryId") String godownentryGodownentryId);

    @Select("select * from msle_outbound where outbound_id='${outboundId}'")
    MsleOutBoundPO getOutBoundById(@Param("outboundId") String outboundId);

    @Select("select * from msle_outbound where outbound_outboundid='${outboundOutboundId}'")
    List<MsleOutBoundPO> getOutBoundByListId(@Param("outboundOutboundId") String outboundOutboundId);

//    @Select("select * from msle_godownentry wheregodownentryStatus='${status}'")
//    List<MsleGoDownEntryPO> getGoDownEntryByStatus(@Param("status") String status);


//    @Select("select * from msle_outbound where outbound_status='${status}'")
//    List<MsleOutBoundPO> getOutBoundByStatus(@Param("status") String status);
//
//    @Update("update msle_goDownEntry setgodownentryStatus='${status}'" +
//            "where godownentry_id='${id}'")
//    boolean updateGoDownEntryStatus(@Param("id") Integer id,@Param("status") String Status);
//
//    @Update("update msle_outBound set outBound_status='${status}'" +
//            "where outBound_id='${id}'")
//    boolean updateOutBoundStatus(@Param("id") Integer id,@Param("status") String Status);
}
