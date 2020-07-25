package com.example.hbase.controller;


import com.example.hbase.hbase.HBaseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/hbase")
public class TestController {
    @Autowired
    private HBaseUtils hBaseUtils;

    @RequestMapping("/test")
    public Map<String,Object> test(){
        String data="";
        try{
            data=hBaseUtils.scanAllRecord("test");
            //data=hBaseUtils.scanAllRecord("cf");
            System.out.println("content:"+data);
        }catch (Exception e){
            e.printStackTrace();
        }
        Map<String,Object>map=new HashMap<>();
        map.put("data",data);
        return map;
    }
}
