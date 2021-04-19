package com.myapp.test;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	private TestService testService;

	@GetMapping("/test")
	public String test(Model model) {
		System.out.println("controller");
		Map<String,Object> result = testService.selectTest();
		System.out.println(result.get("test"));
		model.addAttribute("test",result.get("test"));
		return "/test";
	}
}
