package com.subho.springmvcBoot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.subho.springmvcBoot.model.Alien;


@Controller
public class HomeController {
	
	@Autowired
	AlienRepo repo;
	
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name","Aliens");
	}

	@RequestMapping("/")
	public String home() {
		//System.out.println("Home page requested.");
		return "index";
	}

//	@RequestMapping("add")
//	public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, Model m) {
//
//		
//		int num = i+j;
//		m.addAttribute("result",num);
//		
//		return "result";		
//	}
	
	@PostMapping("addAlien")
	public String addAlien(@ModelAttribute Alien a,Model m) {
		repo.save(a);
		return "result";		
	}
	
	@GetMapping("getAliens")
	public String getAliens(Model m) {

		m.addAttribute("result",repo.findAll());
		return "showAliens";
	}

	@GetMapping("getAlien")
	public String getAlien(@RequestParam int aid,Model m) {
		
		m.addAttribute("result",repo.getOne(aid));
		return "showAliens";
	}

}
