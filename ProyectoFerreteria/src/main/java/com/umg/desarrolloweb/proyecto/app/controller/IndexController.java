package com.umg.desarrolloweb.proyecto.app.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping({"/index"})
	public String Index() {
		return"index";
	}

}
