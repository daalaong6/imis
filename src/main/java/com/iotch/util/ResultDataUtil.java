package com.iotch.util;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;

import java.util.HashMap;
import java.util.Map;

public class ResultDataUtil {

    public static String toJsonString(Boolean success,int draw,long recordsTotal,long recordsFiltered,PageInfo pageInfo){
        Map<String,Object> resultDate =  new HashMap<String, Object>();
        resultDate.put("success",success);
        resultDate.put("draw",draw);
        resultDate.put("recordsTotal",recordsTotal);
        resultDate.put("recordsFiltered",recordsFiltered);
        resultDate.put("pageInfo",pageInfo);
        String jsonString = JSON.toJSONString(resultDate);
        return jsonString;
    }

}
