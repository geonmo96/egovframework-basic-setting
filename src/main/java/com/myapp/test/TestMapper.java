package com.myapp.test;

import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

@MapperScan(basePackages="com.myapp.test.TestMapper")
@Repository
public interface TestMapper {
	
	public Map<String, Object> selectTest();
}
