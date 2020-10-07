package com.znsm.znsm.controller;

import com.znsm.znsm.entity.Vr;
import com.znsm.znsm.mapper.VrMapper;
import com.znsm.znsm.mapper.VrMapper1;
import com.znsm.znsm.service.VrService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class VrController1 {

    @Autowired
    VrService1 vrService1;

    @GetMapping("/addvr1")
    public Map<String,Object> addvr1(Vr vr){
        Map<String,Object> map = new HashMap<String,Object>();
        int i = vrService1.addvr1(vr);
        map.put("code",i);
        map.put("msg","插入成功");
        return map;
    }
}
