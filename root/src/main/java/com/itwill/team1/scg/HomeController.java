package com.itwill.team1.scg;

import java.util.Locale;

import org.springframework.ui.Model;

public class HomeController {
	
	private String path;
	
	public String checkPath(Locale locale, Model model) {
		
		System.out.println(locale.toString());
		System.out.println(model.toString());
		
		path = "scg/home";
		
		return path;
	}
	
}
