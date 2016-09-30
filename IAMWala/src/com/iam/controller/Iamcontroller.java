package com.iam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Iamcontroller {




 
	@RequestMapping("/home")
	public ModelAndView homeIAM() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		return new ModelAndView("home", "message", message);
	}
	
	@RequestMapping("/about")
	public ModelAndView aboutIAM() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		return new ModelAndView("About", "message", message);
	}
	
	@RequestMapping("/project")
	public ModelAndView projectIAM() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		return new ModelAndView("Projects", "message", message);
	}
	@RequestMapping("/sitemap")
	public ModelAndView sitemapIAM() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		return new ModelAndView("Sitemap", "message", message);
	}
	
	@RequestMapping("/contact")
	public ModelAndView contactIAM() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		return new ModelAndView("Contacts", "message", message);
	}
	/*<li><a href="whatMutualFund.html"><H3>What is Mutual Funds</H3></a></li>
	<li><a href="typeOfMutalFund.html"><H3>Types of Mutual Funds</H3></a></li>
	<li><a href="comparison.html"><H3>Comparison between SIP,PF,NSE</H3></a></li>*/
	@RequestMapping("/whatMutualFund")
	public ModelAndView whatMutualFund() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		return new ModelAndView("WhatMutualFund", "message", message);
	}
	
	@RequestMapping("/typeOfMutualFund")
	public ModelAndView typeOfMutalFund() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		return new ModelAndView("TypeOfMutualFund", "message", message);
	}
	
	@RequestMapping("/comparison")
	public ModelAndView comparison() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		return new ModelAndView("Comparison", "message", message);
	}
	
	@RequestMapping("/taxReckenor")
	public ModelAndView taxReckenor() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		return new ModelAndView("TaxReckenor", "message", message);
	}
	
	@RequestMapping("/download")
	public ModelAndView download() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		return new ModelAndView("Download", "message", message);
	}
	
	@RequestMapping("/calculator")
	public ModelAndView calculator() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		return new ModelAndView("Calculator", "message", message);
	}
	
}
