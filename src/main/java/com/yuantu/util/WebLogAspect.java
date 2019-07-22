package com.yuantu.util;


import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import com.yuantu.po.Msle_LogPo;
import com.yuantu.serviceinterface.loginterface.ILogService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import java.util.Date;
import java.text.SimpleDateFormat;

@Aspect
@Component
public class WebLogAspect {
    @Autowired
    private  ILogService iLogService;

    private final Logger logger = LoggerFactory.getLogger(WebLogAspect.class);

    @Pointcut("execution(* updateStaffSalary(com.yuantu.po.Msle_StaffPo,String)))")//切入点描述，这个是uiController包的切入点
    public void staffControllerLog(){}


    @Before(" staffControllerLog()") //在切入点的方法run之前要干的
    public void logBeforeController(JoinPoint joinPoint) {
        Msle_LogPo msle_logPo=new Msle_LogPo();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        msle_logPo.setLogDate(df.format(new Date()).toString());
        msle_logPo.setLogId(UUID.createID());
        msle_logPo.setLogContent("修改薪资");
        msle_logPo.setLogPeople(joinPoint.getArgs().toString());
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        //这个RequestContextHolder是Springmvc提供来获得请求的东西
        HttpServletRequest request = ((ServletRequestAttributes)requestAttributes).getRequest();

        //下面这个getSignature().getDeclaringTypeName()是获取包+类名的   然后后面的joinPoint.getSignature.getName()获取了方法名
        //logger.info("################CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName()
        //       + "." + joinPoint.getSignature().getName());
        System.out.println("11111");
        System.out.println(joinPoint.getArgs());
        System.out.println("22222");
        System.out.println(joinPoint.getSignature().getDeclaringTypeName());
        System.out.println("3333");
        System.out.println(joinPoint.getSignature().getName());
        System.out.println("4444");
        System.out.println(joinPoint.getTarget());
       // System.out.println(request.getQueryString(peopleId));
        System.out.println(request.getParameter("peopleId"));


        iLogService.insertLog(msle_logPo);
    }


}
