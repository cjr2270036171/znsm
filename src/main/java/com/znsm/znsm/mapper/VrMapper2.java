package com.znsm.znsm.mapper;

import com.znsm.znsm.entity.Vr;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VrMapper2 {
    //插入
    public int addvr2(Vr vr);
}
