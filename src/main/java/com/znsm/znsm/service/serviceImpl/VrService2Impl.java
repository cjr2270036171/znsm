package com.znsm.znsm.service.serviceImpl;

import com.znsm.znsm.entity.Vr;
import com.znsm.znsm.mapper.VrMapper1;
import com.znsm.znsm.mapper.VrMapper2;
import com.znsm.znsm.service.VrService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VrService2Impl implements VrService2 {

    @Autowired
    VrMapper2 vrMapper2;
    @Override
    public int addvr2(Vr vr) {
        int i = vrMapper2.addvr2(vr);
        return i;
    }
}
