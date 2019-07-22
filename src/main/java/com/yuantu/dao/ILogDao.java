package com.yuantu.dao;

import com.yuantu.po.Msle_LogPo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ILogDao {
    //添加一条日志记录
    @Insert("insert into msle_log " +
            "values" +
            "('${msle_logPo.logId}','${msle_logPo.logDate}'" +
            ",'${msle_logPo.logContent}'" +
            ",'${msle_logPo.logPeople}')")
    void insertLog(@Param("msle_logPo") Msle_LogPo msle_logPo);
}

