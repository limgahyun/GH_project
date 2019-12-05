package com.project.gh.Threekingdoms.Wei.Character;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class ChracterController {
	private static final Logger logger = LoggerFactory.getLogger(ChracterController.class);

	@RequestMapping(value = "/characterIntro", method = RequestMethod.GET)
	public String characterIntro(Locale locale, Model model) {
		logger.info("Controller::kingdoms Wei Character");
		
		return "threekingdoms/wei/characterIntro";
	}

}
