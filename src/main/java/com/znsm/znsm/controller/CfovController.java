package com.znsm.znsm.controller;

import com.znsm.znsm.entity.Cfov;
import com.znsm.znsm.mapper.CfovMapper;
import com.znsm.znsm.service.CfovService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CfovController {

    @Autowired
    CfovService cfovService;

    @GetMapping("/CfovController")
    public Map<String,Object> CfovController(Cfov cfov){
        Map<String,Object> map = new HashMap<String,Object>();
        int i = cfovService.addcfov(cfov);
        map.put("code",i);
        map.put("msg","插入成功");
        return map;
    }
}
