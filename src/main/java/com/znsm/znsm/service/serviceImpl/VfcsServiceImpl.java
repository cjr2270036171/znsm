package com.znsm.znsm.service.serviceImpl;

import com.znsm.znsm.entity.Vfcs;
import com.znsm.znsm.mapper.VfcsMapper;
import com.znsm.znsm.service.VfcsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class VfcsServiceImpl implements VfcsService {

    @Autowired
    VfcsMapper vfcsMapper;

    @Override
    public int addindex(Vfcs vfcs) {
        int i = vfcsMapper.addindex(vfcs);
        return i;
    }

    @Override
    public ArrayList<Vfcs> getAllindex() {
        ArrayList<Vfcs> al = vfcsMapper.getAllindex();
        return al;
    }
}
