package com.project.gh.Threekingdoms.Story;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class StoryContoller {
	private static final Logger logger = LoggerFactory.getLogger(StoryContoller.class);

	@RequestMapping(value = "/storyTellingIntro", method = RequestMethod.GET)
	public String stroyTelling(Locale locale, Model model) {
		logger.info("Controller::kingdoms Storytelling");
		
		return "threekingdoms/storyTelling/storyTellIntro";
	}

}
