package com.itwill.team1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	private String path;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
	
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "common";
	}
	
	@RequestMapping(value = "/lbj/", method = RequestMethod.GET)
	public String lbj_home(Locale locale, Model model) {
		logger.info("Welcome lbj_home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
				
		com.itwill.team1.lbj.HomeController lbj = new com.itwill.team1.lbj.HomeController();
		
		path = lbj.checkPath(locale, model);
		
		return path;
	}
	
	@RequestMapping(value = "/lda/", method = RequestMethod.GET)
	public String lda_home(Locale locale, Model model) {
		logger.info("Welcome lda_home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		com.itwill.team1.lda.HomeController lda = new com.itwill.team1.lda.HomeController();
		
		path = lda.checkPath(locale, model);
		
		return path;
	}
	
	@RequestMapping(value = "/lyj/", method = RequestMethod.GET)
	public String lyj_home(Locale locale, Model model) {
		logger.info("Welcome lyj_home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		com.itwill.team1.lyj.HomeController lyj = new com.itwill.team1.lyj.HomeController();
		
		path = lyj.checkPath(locale, model);
		
		return path;
	}
	
	@RequestMapping(value = "/scg/", method = RequestMethod.GET)
	public String scg_home(Locale locale, Model model) {
		logger.info("Welcome scg_home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		com.itwill.team1.scg.HomeController scg = new com.itwill.team1.scg.HomeController();
		
		path = scg.checkPath(locale, model);
		
		return path;
	}
	
	@RequestMapping(value = "/sho/", method = RequestMethod.GET)
	public String sho_home(Locale locale, Model model) {
		logger.info("Welcome sho_home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		com.itwill.team1.sho.HomeController sho = new com.itwill.team1.sho.HomeController();
		
		path = sho.checkPath(locale, model);
		
		return path;
	}
	
	@RequestMapping(value = "/syc/", method = RequestMethod.GET)
	public String syc_home(Locale locale, Model model) {
		logger.info("Welcome syc_home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		com.itwill.team1.syc.HomeController syc = new com.itwill.team1.syc.HomeController();
		
		path = syc.checkPath(locale, model);
		
		return path;
	}
	
}
