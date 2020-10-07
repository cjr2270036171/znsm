package com.znsm.znsm.service.serviceImpl;

import com.znsm.znsm.entity.Vr;
import com.znsm.znsm.mapper.VrMapper3;
import com.znsm.znsm.service.VrService3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VrService3Impl implements VrService3 {

    @Autowired
    VrMapper3 vrMapper3;

    @Override
    public int addvr3(Vr vr) {
        int i = vrMapper3.addvr3(vr);
        return i;
    }
}
