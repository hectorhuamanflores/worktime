package com.bcp.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TrabajoController {

	@RequestMapping("/trabajo")
	public String irNota(@RequestParam(value = "nombre", required = false, defaultValue = "MitoCode") String nombre,
			Model model) {
		model.addAttribute("nombre", nombre);
		return "trabajo";
	}
	
}
