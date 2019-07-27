package com.yuantu.util;

import com.yuantu.po.MsleLogPo;
import com.yuantu.service.logservice.LogServiceImpl;
import com.yuantu.serviceinterface.loginterface.ILogService;
import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName LogUtil
 * @Description TODO
 * @Author yukun
 * @Date 2019/7/24 15:40
 * @Version 1.0
 **/
@Component
public class LogUtil {

    @Autowired
    private  ILogService iLogService;


    // private final Logger logger = LoggerFactory.getLogger(LogUtil.class);
    public  int logBeforeController(JoinPoint joinPoint,String message) {
//        LogServiceImpl logService=new LogServiceImpl();
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        //这个RequestContextHolder是Springmvc提供来获得请求的东西
        HttpServletRequest request = ((ServletRequestAttributes)requestAttributes).getRequest();
        MsleLogPo msleLogPo=new MsleLogPo();
        //设置日期格式
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

//        System.out.println(df.format(new Date()).toString());

        msleLogPo.setLogDate(df.format(new Date()).toString());
        msleLogPo.setLogId(UUID.creatId());
        msleLogPo.setLogContent(message);
        msleLogPo.setLogPeople(joinPoint.getArgs().toString());
        msleLogPo.setLogPeople(request.getParameter("peopleId"));

//        System.out.println(msleLogPo);

        return (iLogService.insertLog(msleLogPo));

    }

}
