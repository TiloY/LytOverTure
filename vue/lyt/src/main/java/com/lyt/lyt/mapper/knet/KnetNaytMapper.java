package com.lyt.lyt.mapper.knet;


import com.lyt.lyt.common.myMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@myMapper
public interface KnetNaytMapper {

    @Select("select count(1) from knet_nayt")
    int getSysTime();
}