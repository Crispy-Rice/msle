package com.yuantu.util;

import groovy.util.logging.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.net.BindException;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Administrator
 * 全局异常处理(此处只处理了MethodArgumentNotValidException)
 */
@RestControllerAdvice
@Slf4j
public class HandleException {

    @ExceptionHandler(BindException.class)
    public void validExceptionHandler(BindException e){
        System.out.println("BindException错误");
    }

    /**
     * 当校验发现参数异常，捕捉异常
     * 获得 MethodArgumentNotValidException异常中BindingResult，提取BindingResult中的fieldErrors(
     * list,因为需要提取所有defaultmessage,若使用getFieldError则只会取出一个),将每个list中fieldError每个取出，
     * 再将其中的defaultmessage放入pageutil返回
     * @param MethodArgumentNotValidException
     * @return PageUtil
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public PageUtil validExceptionHandler(MethodArgumentNotValidException e){
        BindingResult result = e.getBindingResult();
        List<FieldError> fieldErrors = result.getFieldErrors();
        PageUtil pageUtil=new PageUtil(null);
        List<String> list=new ArrayList<String>();
        for(FieldError message:fieldErrors){
            list.add(message.getDefaultMessage());
        }
        pageUtil.setMsg(list);
        System.out.println("“有错误参数”");
        return pageUtil;
    }

}


