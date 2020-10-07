package com.znsm.znsm.controller;

import com.znsm.znsm.entity.Vr;
import com.znsm.znsm.mapper.VrMapper;
import com.znsm.znsm.mapper.VrMapper2;
import com.znsm.znsm.service.VrService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class VrController2 {

    @Autowired
    VrService2 vrService2;

    @GetMapping("/addvr2")
    public Map<String,Object> addvr2(Vr vr){
        Map<String,Object> map = new HashMap<String,Object>();
        int i = vrService2.addvr2(vr);
        map.put("code",i);
        map.put("msg","插入成功");
        return map;
    }
}
