package com.project.gh.Threekingdoms.Intro;

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
public class IntroContoller {
	private static final Logger logger = LoggerFactory.getLogger(ThreeKingdomsHomeController.class);

	@RequestMapping(value = "/threekingdomsIntro", method = RequestMethod.GET)
	public String threekingdoms(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		
		return "/threekingdoms/intro";
	}

}
