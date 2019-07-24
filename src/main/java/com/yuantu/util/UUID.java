package com.yuantu.util;


/**
 *
 *@author tai
 *@Time
 *获取UUID生成的主键
 *
 */
@SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
public class UUID {
    public static String creatId(){
        String uuid = java.util.UUID.randomUUID().toString();
        String id=uuid;
        id=id.replace("-", "");
        id=id.substring(1,13);
        return id;
    }
    public static String createFigureid(){
        String uuid = java.util.UUID.randomUUID().toString();
        String id=uuid;
        id= id.replace("-", "");
        String str = id;
        str=str.trim();
        String str2="";
        if(str != null && !"".equals(str)){
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)>=48 && str.charAt(i)<=57){
                    str2+=str.charAt(i);
                }
            }

        }
        str2=str2.substring(1,13);
        return  str2;

    }

}
