package com.ibm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/f")
	public String first() {
		return "first";
	}
	
	@RequestMapping("/s")
	public String second() {
		return "second";
	}
}
