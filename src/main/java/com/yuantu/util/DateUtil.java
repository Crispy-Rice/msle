package com.yuantu.util;

public class DateUtil {
    /**
     * 获取 yyyy-MM-dd HH24:mi:ss格式String的yyyy-MM-dd 部分String
     * @param date 待获取字符串
     * @return yyyy-MM-dd 部分String
     */
    public static String getBeginDay(String date){
        String beginDay=date.substring(0,10);
        return beginDay;
    }
}
