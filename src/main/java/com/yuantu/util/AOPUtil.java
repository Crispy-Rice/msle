package com.yuantu.util;


import com.yuantu.po.MsleLogPo;
import com.yuantu.service.logservice.LogServiceImpl;
import com.yuantu.serviceinterface.loginterface.ILogService;
import org.aspectj.lang.JoinPoint;
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

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.yuantu.constant.LogList.*;


/**
 *
 *@author tai
 *@Time
 * 对切入点进行操作，操作时间和操作人员记录
 * 切入点1 updateStaffSalary--薪资修改
 * 切入点2 addReceipt--添加收款单
 * 切入点3 deleteReceiptById--删除收款单
 * 切入点4 addAccount--添加账户
 * 切入点5 updateAccount--修改账户信息
 * 切入点6 deleteAccountById--删除账户
 * 切入点7 addPayment-添加付款单
 * 切入点8 deletePaymentById--删除付款单
 * 切入点9 updatePayment--修改付款单
 */
@Aspect
@Component
public class AOPUtil {
    @Autowired
    private  ILogService iLogService;


    private LogUtil logUtil=new LogUtil();

    private final Logger logger = LoggerFactory.getLogger(AOPUtil.class);

    //切入点描述，这个是uiController包的切入点
    @Pointcut("execution(* updateStaffSalary(com.yuantu.po.MsleStaffPo,String)))")
    public void updateStaffSalary(){}

    @Pointcut("execution(* addReceipt(com.yuantu.po.accountpo.MsleReceiptPo,String)))")
    public void addReceipt(){}

    @Pointcut("execution(* deleteReceiptById(String,String)))")
    public void deleteReceiptById(){}

    @Pointcut("execution(* addAccount(com.yuantu.po.accountpo.MsleAccountPo,String)))")
    public void addAccount(){}

    @Pointcut("execution(* updateAccount(String,Double,String)))")
    public void updateAccount(){}

    @Pointcut("execution(* deleteAccountById(String,String)))")
    public void deleteAccountById(){}

    @Pointcut("execution(* addPayment(com.yuantu.po.accountpo.MslePaymentPo,String)))")
    public void addPayment(){}

    @Pointcut("execution(* deletePaymentById(String,String)))")
    public void deletePaymentById(){}

    @Pointcut("execution(* updatePayment(com.yuantu.po.accountpo.MslePaymentPo,String)))")
    public void updatePayment(){}

    //@Pointcut("execution(* insertConstant(com.yuantu.po.MsleConstantPo)))")
    // public void allController(){}



    @Before(" updateStaffSalary()") //在切入点的方法run之前要干的
    public void logBeforeController(JoinPoint joinPoint) {

      logBeforeController(joinPoint,UPDATESALARY);

    }

    @Before(" addReceipt()") //在切入点的方法run之前要干的
    public void logBeforeAddReceipt(JoinPoint joinPoint) {
       logBeforeController(joinPoint,ADDRECEIPT);

    }

    @Before(" deleteReceiptById()") //在切入点的方法run之前要干的
    public void logBeforeDeleteReceiptById(JoinPoint joinPoint) {
       logBeforeController(joinPoint,DELETERECEIPT);

    }

    @Before(" addAccount()") //在切入点的方法run之前要干的
    public void logBeforeAddAccount(JoinPoint joinPoint) {
        logBeforeController(joinPoint,ADDACCOUNT);

    }

    @Before(" updateAccount()") //在切入点的方法run之前要干的
    public void logBeforeUpdateAccount(JoinPoint joinPoint) {
        logBeforeController(joinPoint,UPDATEACCOUNT);


    }

    @Before(" deleteAccountById()") //在切入点的方法run之前要干的
    public void logBeforeDeleteAccountById(JoinPoint joinPoint) {

   logBeforeController(joinPoint,DELETEACCOUNT);


    }

    @Before(" addPayment()") //在切入点的方法run之前要干的
    public void logBeforeAddPayment(JoinPoint joinPoint) {
        logBeforeController(joinPoint,ADDPAYMENT);

    }

    @Before(" deletePaymentById()") //在切入点的方法run之前要干的
    public void logBeforeDeletePaymentById(JoinPoint joinPoint) {
      logBeforeController(joinPoint,DELETEPAYMENT);
    }

    @Before(" updatePayment()") //在切入点的方法run之前要干的
    public void logBeforeUpdatePayment(JoinPoint joinPoint) {
        logBeforeController(joinPoint,UPDATEPAYMENT);
    }






    public  void logBeforeController(JoinPoint joinPoint,String message) {
        //LogServiceImpl logService=new LogServiceImpl();
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        //这个RequestContextHolder是Springmvc提供来获得请求的东西
        HttpServletRequest request = ((ServletRequestAttributes)requestAttributes).getRequest();
        MsleLogPo msleLogPo=new MsleLogPo();
        //设置日期格式
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(df.format(new Date()).toString());

        msleLogPo.setLogDate(df.format(new Date()).toString());
        msleLogPo.setLogId(UUID.creatId());
        msleLogPo.setLogContent(message);
        // msleLogPo.setLogPeople(joinPoint.getArgs().toString());
        msleLogPo.setLogPeople(request.getParameter("peopleId"));

        System.out.println(msleLogPo);



        System.out.println(iLogService.insertLog(msleLogPo));

    }


}





