package com.yuantu.util;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

public  class PageUtil<T> {
    private int code=0;
    private String msg;
    private Long count;
    private List<T> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
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
}
