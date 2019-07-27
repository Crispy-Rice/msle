package com.yuantu.dao;

import com.yuantu.po.MsleLogPo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 *@author tai
 *@Time
 *日志表数据库操作
 */
@Mapper
public interface ILogDao {

    /**
     * 添加一条日志
     * @param msleLogPo set了所有属性的的日志实体类
     */
    @Insert("insert into msle_log " +
            "values" +
            "('${msleLogPo.logId}','${msleLogPo.logDate}'" +
            ",'${msleLogPo.logContent}'" +
            ",'${msleLogPo.logPeople}')")
    int insertLog(@Param("msleLogPo") MsleLogPo msleLogPo);

    /**
     * 根据时间查看日志
     * @param date 日志存储时间(yy/mm/dd)
     * @return 此时间的所有日志记录集合
     */
    @Select("select * from msle_log where log_date like '${log_date}'")
    List<MsleLogPo> getLog(@Param("log_date") String date);
}
