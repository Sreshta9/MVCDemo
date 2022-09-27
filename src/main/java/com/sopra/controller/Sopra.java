package com.sopra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Sopra {
	@RequestMapping("/home")
	public String home()
	{
		return "index";
	}
}
