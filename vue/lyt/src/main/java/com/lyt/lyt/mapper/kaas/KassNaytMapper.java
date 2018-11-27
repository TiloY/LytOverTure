package com.lyt.lyt.mapper.kaas;


import com.lyt.lyt.common.myMapper;
import org.apache.ibatis.annotations.Select;

import java.util.Date;

@myMapper
public interface KassNaytMapper {
    @Select("select sysdate from dual")
    Date getSysTime();
}
