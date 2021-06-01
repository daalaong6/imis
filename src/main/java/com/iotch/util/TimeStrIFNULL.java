package com.iotch.util;

import java.util.Date;

public class TimeStrIFNULL {

    public static String isNull4Begin(String TimeBeginStr){
        TimeBeginStr=(TimeBeginStr!=null && TimeBeginStr!="")?TimeBeginStr:"2018-01-01 00:00:00";
        return TimeBeginStr;
    }

    public static String isNull4End(String TimeEndStr){
        TimeEndStr=(TimeEndStr!=null && TimeEndStr!="")?TimeEndStr:DateFomatUtil.formatDate("yyyy-MM-dd HH:mm:ss",new Date());
        return TimeEndStr;
    }
}
