package com.winter.app.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
	@RequestMapping("/")
	public String getIndex() throws Exception{
		return "index";
	}
}
