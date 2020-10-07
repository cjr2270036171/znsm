package com.znsm.znsm.controller;

import com.znsm.znsm.entity.Vfcs;
import com.znsm.znsm.mapper.VfcsMapper;
import com.znsm.znsm.service.VfcsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
public class VfcsController {

    @Autowired
    VfcsService vfcsService;

    @GetMapping("/addindex")
    public Map<String,Object> addindex(Vfcs vfcs){
        Map<String,Object> map = new HashMap<String,Object>();
        int i = vfcsService.addindex(vfcs);
        map.put("code",i);
        map.put("msg","插入成功");
        return map;
    }

    @GetMapping("/getAllindex")
    public Map<String,Object> getAllindex(){
        Map<String,Object> map = new HashMap<String,Object>();
        ArrayList<Vfcs> al = vfcsService.getAllindex();
        map.put("data",al);
        map.put("code",1);
        map.put("msg","查询成功");
        return map;
    }
}
