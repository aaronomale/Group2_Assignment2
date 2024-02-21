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
	
	

	@GetMapping("/Dilraj")
	public String DilrajController(Model model) {
		Student_group2 dilrajObject = new Student_group2("Dilraj", "Manj", "A simple Computing Studies & Information Systems student at Douglas College."
				+ "Dilraj Manj has created, but not published a fitness app that helps users make accounts and track their daily calorie intakes."
				+ "He is alsways looking to learn new ways to improve. No matter the challenge presented Dilraj will always keep trying to find a solution.");
		model.addAttribute("dilrajObject", dilrajObject);
		return "dilraj_dma_19";
	}
	
	@GetMapping("/Jordan")
	public String JordanController(Model model) {
		Student_group2 jordanObject = new Student_group2("Jordan", "Sidney-Dunu", "As a Computing Studies and Information Systems Diploma student at Douglas College,"
				+ " I am immersed in the world of technology and software development. Alongside my studies, I am actively engaged in the real estate industry, where I contribute to technological advancements within the sector. With a passion for both software development and real estate,"
				+ " I am dedicated to leveraging technology to innovate and enhance processes within the dynamic realm of real estate.");
		model.addAttribute("jordan", jordanObject);
		return "jordan_jsi_90";
	}


}