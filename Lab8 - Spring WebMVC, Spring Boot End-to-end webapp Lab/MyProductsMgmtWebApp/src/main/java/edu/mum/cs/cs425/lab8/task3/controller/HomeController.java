package edu.mum.cs.cs425.lab8.task3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping(value = {"", "/"})
	public String showHomePage() {
		return "redirect:/product";
	}
}
