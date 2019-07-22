package com.yuantu.util;



public class UUID {
    public static String createID(){
        String uuid = java.util.UUID.randomUUID().toString();
        String id=uuid;
        id=id.replace("-", "");
        return id.substring(1,13);
    }
    public static String createFigureID(){
        String uuid = java.util.UUID.randomUUID().toString();
        String id=uuid;
        //id=id.substring(1,12);
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



