package com.znsm.znsm.mapper;

import com.znsm.znsm.entity.Vr;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VrMapper3 {
    //插入
    public int addvr3(Vr vr);
}
