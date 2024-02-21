package com.csis3275.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.csis3275.model_group2.Student_group2;

@Controller
public class HomeController {

	@GetMapping("/")
	public String Home() {
		return "homePage";
	}
	
	@GetMapping("/aaron")
	public String AaronController(Model model) {
		Student_group2 aaronObj = new Student_group2("Aaron", "Omale", "Results-driven Software Developer with over 2 years of hands-on experience, committed to transforming ideas into innovative solutions with meticulous attention to detail. Proficient in developing a diverse range of projects, including Dermaland, a React Native app designed to enhance users' daily skincare routines, and a Python script for efficient folder organization. Continuously expanding technical expertise through ongoing learning and exploration.");
		
		model.addAttribute("aaron", aaronObj);
		return "aaron_aom_43";
	}
	
	@GetMapping("/Dilraj")
	public String DilrajController(Model model) {
		Student_group2 dilrajObject = new Student_group2("Dilraj", "Manj", "A simple Computing Studies & Information Systems student at Douglas College."
				+ "Dilraj Manj has created, but not published a fitness app that helps users make accounts and track their daily calorie intakes."
				+ "He is alsways looking to learn new ways to improve. No matter the challenge presented Dilraj will always keep trying to find a solution.");
		model.addAttribute("dilrajObject", dilrajObject);
		return "dilraj_dma_19";
	}
	
	

}