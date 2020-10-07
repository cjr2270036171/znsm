package com.znsm.znsm.mapper;

import com.znsm.znsm.entity.Ztjm;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface IndexMapper {

    public Ztjm index(Ztjm ztjm);

    public ArrayList<Ztjm> cs();
}
