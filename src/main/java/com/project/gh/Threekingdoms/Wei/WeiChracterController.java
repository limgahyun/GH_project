package com.project.gh.Threekingdoms.Wei;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WeiChracterController {
	@Autowired WeiService weiService;
	private static final Logger logger = LoggerFactory.getLogger(WeiChracterController.class);

	/*
	 * 위나라 개별 장수 소개
	 * */
	@RequestMapping(value = "/weiCharacterIntro", method = RequestMethod.GET)
	public String weiCharacterIntro(Model model, WeiVO weiVo) {
		logger.info("Controller::kingdoms Wei Character");
		
		weiVo = weiService.weiCharacterIntro(weiVo);
		logger.info("weiVo ::::::" + weiVo);
		model.addAttribute("weiVo", weiVo);
		
		return "threekingdoms/wei/characterIntro";
	}


}
