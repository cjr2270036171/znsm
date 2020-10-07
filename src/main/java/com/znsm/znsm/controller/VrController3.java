package com.znsm.znsm.controller;

import com.znsm.znsm.entity.Vr;
import com.znsm.znsm.mapper.VrMapper;
import com.znsm.znsm.mapper.VrMapper3;
import com.znsm.znsm.service.VrService3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class VrController3 {

    @Autowired
    VrService3 vrService3;

    @GetMapping("/addvr3")
    public Map<String,Object> addvr3(Vr vr){
        Map<String,Object> map = new HashMap<String,Object>();
        int i = vrService3.addvr3(vr);
        map.put("code",i);
        map.put("msg","插入成功");
        return map;
    }
}
