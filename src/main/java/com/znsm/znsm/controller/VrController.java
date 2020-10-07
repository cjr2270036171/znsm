package com.znsm.znsm.controller;

import com.znsm.znsm.entity.Vfcs;
import com.znsm.znsm.entity.Vr;
import com.znsm.znsm.mapper.VrMapper;
import com.znsm.znsm.service.VrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class VrController {

    @Autowired
    VrService vrService;

    @GetMapping("/addvr")
    public Map<String,Object> addvr(Vr vr){
        Map<String,Object> map = new HashMap<String,Object>();
        int i = vrService.addvr(vr);
        map.put("code",i);
        map.put("msg","插入成功");
        return map;
    }
}
