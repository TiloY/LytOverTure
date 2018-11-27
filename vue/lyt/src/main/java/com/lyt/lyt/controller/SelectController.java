package com.lyt.lyt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.lyt.lyt.service.SelectService;

@Controller
public class SelectController {
	
	@Autowired
	private SelectService selectService;
	@Autowired
	private Gson gson;
	
	@GetMapping("/select")
	@ResponseBody
	public String select() {
		List<Map<String,Object>> list = selectService.selectAll();
		return gson.toJson(list);
	}
}
