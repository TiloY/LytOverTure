package com.lyt.lyt.mapper.knet;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

import com.lyt.lyt.common.myMapper;

@myMapper
public interface SelectMapper {

	@Select(" select * from knet.vue ")
	List<Map<String,Object>> selectAll();
}
