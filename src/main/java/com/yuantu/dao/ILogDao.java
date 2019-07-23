package com.yuantu.dao;

import com.yuantu.po.MsleLogPo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ILogDao {
    //添加一条日志记录
    @Insert("insert into msle_log " +
            "values" +
            "('${MsleLogPo.logId}','${MsleLogPo.logDate}'" +
            ",'${MsleLogPo.logContent}'" +
            ",'${MsleLogPo.logPeople}')")
    void insertLog(@Param("MsleLogPo") MsleLogPo MsleLogPo);
}

