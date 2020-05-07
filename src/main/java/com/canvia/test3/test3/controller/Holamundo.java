package com.canvia.test3.test3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class Holamundo {
	@RequestMapping(method = RequestMethod.GET)
	public String home() {
		return "Hi Frankie";
	}
}
