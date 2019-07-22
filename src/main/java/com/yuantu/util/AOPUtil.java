package com.yuantu.util;


import javax.servlet.http.HttpServletRequest;

import com.yuantu.po.MsleLogPo;
import com.yuantu.serviceinterface.loginterface.ILogService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 *@author tai
 *@Time
 *对切入点进行日志存储和操作人员记录
 *
 */
@Aspect
@Component
public class AOPUtil {
    @Autowired
    private  ILogService iLogService;

    private final Logger logger = LoggerFactory.getLogger(WebLogAspect.class);

    @Pointcut("execution(* updateStaffSalary(com.yuantu.po.MsleStaffPo,String)))")//切入点描述，这个是uiController包的切入点
    public void staffControllerLog(){}

    @Pointcut("execution(* com.yuantu.controller..*.*(..))  ")
    public void allControllerMethod(){}


    @Before(" staffControllerLog()") //在切入点的方法run之前要干的
    public void logBeforeController(JoinPoint joinPoint) {
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        //这个RequestContextHolder是Springmvc提供来获得请求的东西
        HttpServletRequest request = ((ServletRequestAttributes)requestAttributes).getRequest();
        MsleLogPo msleLogPo=new MsleLogPo();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        msleLogPo.setLogDate(df.format(new Date()).toString());
        msleLogPo.setLogId(UUID.createId());
        msleLogPo.setLogContent("修改薪资");
        msleLogPo.setLogPeople(joinPoint.getArgs().toString());
        msleLogPo.setLogPeople(request.getParameter("peopleId"));
        iLogService.insertLog(msleLogPo);

    }

    @Around("allControllerMethod()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        PageUtil pageUtil = new PageUtil(null);
        List<BindingResult> bindingResults = null;
        for (Object arg : joinPoint.getArgs()) {//遍历被通知方法(controller方法)的参数列表
            if (arg instanceof BindingResult) {//参数校验结果会存放在BindingResult中
                bindingResults.add((BindingResult) arg);
            }
        }
        if (bindingResults != null) {
            for (BindingResult bindingResult : bindingResults) {
                if (bindingResult.hasErrors()) {
                    pageUtil.getMsg().add(bindingResult.getFieldError().getDefaultMessage());
                }
            }
        }
        if (pageUtil.getMsg().isEmpty()) {
            return joinPoint.proceed();//执行目标方法
        }else {
            return pageUtil;
        }


//        if(bindingResult != null){
//            if(bindingResult.hasErrors()){//检查是否存在校验错误
//                pageUtil.getMsg().add(bindingResult.getFieldError().getDefaultMessage());
//                //PageUtil pageUtil=new PageUtil(bindingResult.getFieldError().getDefaultMessage());
//                return pageUtil;
//            }else {
//                return joinPoint.proceed();//执行目标方法
//            }
//        }else {
//            return joinPoint.proceed();//执行目标方法
//        }

    }


}

