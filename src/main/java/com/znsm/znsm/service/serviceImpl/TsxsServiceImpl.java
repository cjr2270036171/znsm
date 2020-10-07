package com.znsm.znsm.service.serviceImpl;

import com.znsm.znsm.entity.Tsxs;
import com.znsm.znsm.mapper.TsxsMapper;
import com.znsm.znsm.service.TsxsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TsxsServiceImpl implements TsxsService {
    @Autowired
    TsxsMapper tsxsMapper;
    @Override
    public ArrayList<Tsxs> tsxslogin() {
        ArrayList<Tsxs> al = tsxsMapper.tsxslogin();
        return al;
    }
}
