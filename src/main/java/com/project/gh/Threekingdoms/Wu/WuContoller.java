package com.project.gh.Threekingdoms.Wu;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WuContoller {
	@Autowired WuService wuService;
	private static final Logger logger = LoggerFactory.getLogger(WuContoller.class);

	/*
	 * 오나라 홈 리스트 
	 * */
	@RequestMapping(value = "/kingdomWu", method = RequestMethod.GET)
	public String threekingdoms(Model model) {
		logger.debug("Controller::kingdom Wu Listpage");
		
		List<WuVO> wuVo = wuService.selectWuGeneral();
		model.addAttribute("wuVo", wuVo);
		
		return "/threekingdoms/wu/kingdomWu";
	}

	
	/*
	 * 오 장수추가 폼 insert Form
	 * */
	@RequestMapping(value = "/formWu", method = RequestMethod.GET)
	public String formWu(Locale locale, Model model) {
		logger.info("Controller::Wu General insert Form");
		
		return "/threekingdoms/wu/formWu";
	}
	
	
	/*
	 * 오나라 장수추가 insert
	 * */
	@RequestMapping(value = "/insertWuGeneral", method = RequestMethod.POST, produces="text/plain;charset=UTF-8")
	public String insertWuGeneral(WuVO wuVo, Model model) throws Exception {
		logger.debug("Controller::insertWeiGeneral");
		wuService.insertWuGeneral(wuVo);
		return "redirect:/kingdomWei";
	}
}
