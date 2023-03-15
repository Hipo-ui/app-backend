package com.exercise.app.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/dev")
	public String index() {
		return "index";
	}
}
