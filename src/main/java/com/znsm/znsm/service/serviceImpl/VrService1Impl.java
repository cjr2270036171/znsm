package com.znsm.znsm.service.serviceImpl;

import com.znsm.znsm.entity.Vr;
import com.znsm.znsm.mapper.VrMapper1;
import com.znsm.znsm.service.VrService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VrService1Impl implements VrService1 {

    @Autowired
    VrMapper1 vrMapper1;
    @Override
    public int addvr1(Vr vr) {
        int i = vrMapper1.addvr1(vr);
        return i;
    }
}
