package com.znsm.znsm.mapper;

import com.znsm.znsm.entity.Vfcs;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface VfcsMapper {
    //插入
    public int addindex(Vfcs vfcs);
    //查询
    public ArrayList<Vfcs> getAllindex();
}
