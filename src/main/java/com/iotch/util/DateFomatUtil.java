package com.iotch.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFomatUtil {

    public static Timestamp  parseTimestamp(String pattern,String orignStr){
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        try {
            Date date = sdf.parse(orignStr);
            Timestamp timestamp = new Timestamp(date.getTime());
            return timestamp;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Date parseDate(String pattern,String orignStr){
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        try {
            Date date = sdf.parse(orignStr);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String formatDate(String pattern,Date date){
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String dateStr = sdf.format(date);
        return dateStr;
    }

    public static String formatTimestamp(String pattern,Timestamp timestamp){
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String timestampStr = sdf.format(timestamp);
        return timestampStr;
    }

}
