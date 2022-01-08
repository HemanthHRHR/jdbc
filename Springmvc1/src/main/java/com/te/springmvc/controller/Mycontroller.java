package com.te.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.te.springmvc.model.Register;
import com.te.springmvc.service.MvcService;

//dyanamiccally adding attribute
@Controller
public class Mycontroller {

@GetMapping("/test")
public String test(Model model) {
	String s ="ba ba ranadera";
	model.addAttribute("name",s);
	return "test";
}

@GetMapping("/test1")
public String test1(ModelMap map) {
	String s =" na bandhe randera";
	map.addAttribute("name1", s);
	return "test";
}

@GetMapping("/test2")
public ModelAndView test2(ModelAndView modview) {
	String s ="John cena";
	modview.addObject("name2", s);
	modview.setViewName("test");
	return modview;
}
@GetMapping("/register")
public String reg() {
	return "register";
}


@Autowired
MvcService service;


@PostMapping("/register")
public String register(Register req,ModelMap map) {
	map.addAttribute("details", req);
	service.save(req);
	return "success";
	
}
}
