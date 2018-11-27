package com.lyt.lyt.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyt.lyt.mapper.knet.SelectMapper;

@Service
public class SelectService {
	
	@Autowired
	private SelectMapper slectMapper;
	
	public List<Map<String,Object>> selectAll(){
		
		return slectMapper.selectAll();
	}
}
