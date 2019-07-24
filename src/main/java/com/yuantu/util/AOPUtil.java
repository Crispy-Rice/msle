package com.yuantu.util;


import javax.servlet.http.HttpServletRequest;

import com.yuantu.po.MsleLogPo;
import com.yuantu.serviceinterface.loginterface.ILogService;
import groovy.util.logging.Slf4j;
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
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
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
 * 对切入点进行操作，操作时间和操作人员记录
 * 切入点1 updateStaffSalary--薪资修改
 * 切入点2
 * 切入点3
 * 切入点4
 * 切入点5
 */
@Aspect
@Component
public class AOPUtil {
    @Autowired
    private  ILogService iLogService;

    private final Logger logger = LoggerFactory.getLogger(AOPUtil.class);

    //切入点描述，这个是uiController包的切入点
    @Pointcut("execution(* updateStaffSalary(com.yuantu.po.MsleStaffPo,String)))")
    public void updateStaffSalary(){}

    //@Pointcut("execution(* insertConstant(com.yuantu.po.MsleConstantPo)))")
    // public void allController(){}


    @Before(" updateStaffSalary()") //在切入点的方法run之前要干的
    public void logBeforeController(JoinPoint joinPoint) {
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        //这个RequestContextHolder是Springmvc提供来获得请求的东西
        HttpServletRequest request = ((ServletRequestAttributes)requestAttributes).getRequest();
        MsleLogPo msleLogPo=new MsleLogPo();
        //设置日期格式
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        msleLogPo.setLogDate(df.format(new Date()).toString());
        msleLogPo.setLogId(UUID.creatId());
        msleLogPo.setLogContent("修改薪资");
        msleLogPo.setLogPeople(joinPoint.getArgs().toString());
        msleLogPo.setLogPeople(request.getParameter("peopleId"));
        iLogService.insertLog(msleLogPo);

    } }

//    @Around("allController()")
//    public Object Check(ProceedingJoinPoint joinPoint) throws Throwable {
//        System.out.println(".03333");
//        PageUtil pageUtil = new PageUtil(null);
//        List<BindingResult> bindingResults = null;
//        for (Object arg : joinPoint.getArgs()) {//遍历被通知方法(controller方法)的参数列表
//            if (arg instanceof BindingResult) {//参数校验结果会存放在BindingResult中
//                bindingResults.add((BindingResult) arg);
//            }
//        }
//        if (bindingResults != null) {
//            for (BindingResult bindingResult : bindingResults) {
//                if (bindingResult.hasErrors()) {
//                    pageUtil.getMsg().add(bindingResult.getFieldError().getDefaultMessage());
//                }
//            }
//        }
//        if (pageUtil.getMsg().isEmpty()) {
//            return joinPoint.proceed();//执行目标方法
//        }else {
//            return pageUtil;
//        }





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

