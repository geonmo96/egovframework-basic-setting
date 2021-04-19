package com.myapp.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	
	@Autowired
	private TestMapper testMapper;
	
	public Map<String, Object> selectTest(){
		System.out.println("service");
		Map<String, Object> result = new HashMap<>();
		result.put("test", testMapper.selectTest());
		System.out.println(result.get("test"));
		return result;
	}
}
