package com.yuantu.util;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.对service层传入controller层的返回值进行包装处理
 * 2.对校验发现错误的信息进行包装处理
 * @author kun
 */
public  class PageUtil<T> {
    private int code=0;
    private List<String> msg=new ArrayList<String>();
    private Long count;
    private List<T> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<String> getMsg() {
        return msg;
    }

    public void setMsg(List<String> msg) {
        this.msg = msg;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public PageUtil(List<T> data) {
        this.data = data;
    }

//    public PageUtil(List<String> msg) {
//        this.msg = msg;
//    }
}

