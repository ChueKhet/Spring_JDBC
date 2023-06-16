package com.ojt.crud.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeControlller {
	@GetMapping("/")
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("message","Hello Spring MVC");
		return mv;
	}

}
