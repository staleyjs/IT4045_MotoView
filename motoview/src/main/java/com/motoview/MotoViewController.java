package com.motoview;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MotoViewController {
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	@RequestMapping("/")
	public String start() {
		return "index";
	}
 
}
