package com.znsm.znsm.mapper;

import com.znsm.znsm.entity.Tsxs;
import com.znsm.znsm.entity.Vfcs;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface TsxsMapper {
    //查询
    public ArrayList<Tsxs> tsxslogin();
}
