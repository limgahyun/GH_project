package com.project.gh.Threekingdoms.Wei;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.gh.Threekingdoms.Home.ThreeKingdomsHomeController;

@Controller
public class WeiContoller {
	private static final Logger logger = LoggerFactory.getLogger(ThreeKingdomsHomeController.class);

	/*
	 * Kingdom Wei home
	 * */
	@RequestMapping(value = "/kingdomWei", method = RequestMethod.GET)
	public String threekingdoms(Locale locale, Model model) {
		logger.info("kingdom Wei page");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "/threekingdoms/wei/kingdomWei";
	}
	
	/*
	 * Kingdom Wei insert Form
	 * */
	@RequestMapping(value = "/formWei", method = RequestMethod.GET)
	public String formWei(Locale locale, Model model) {
		logger.info("Wei General insert Form");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "/threekingdoms/wei/formWei";
	}

}
