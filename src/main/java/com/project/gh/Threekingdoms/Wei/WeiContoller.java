package com.project.gh.Threekingdoms.Wei;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.gh.Threekingdoms.Home.ThreeKingdomsHomeController;

@Controller
public class WeiContoller {
	private static final Logger logger = LoggerFactory.getLogger(ThreeKingdomsHomeController.class);
	@Autowired WeiService weiService;
	
	
	/*
	 * 위나라 홈 리스트 
	 * */
	@RequestMapping(value = "/kingdomWei", method = RequestMethod.GET)
	public String selectWeiGeneral(Model model) throws Exception {
		logger.debug("Controller::kingdom Wei Listpage");
		List<WeiVO> weiVo = weiService.selectWeiGeneral();
		model.addAttribute("weiVo", weiVo);

		return "threekingdoms/wei/kingdomWei";
	}
	
	/*
	 * 위나라 장수추가 폼 insert Form
	 * */
	@RequestMapping(value = "/formWei", method = RequestMethod.GET)
	public String formWei(Locale locale, Model model) {
		logger.info("Controller::Wei General insert Form");
		
		return "/threekingdoms/wei/formWei";
	}
	
	/*
	 * 위나라 장수추가하기 insert
	 * */
	@RequestMapping(value = "/insertWeiGeneral", method = RequestMethod.POST, produces="text/plain;charset=UTF-8")
	public String insertWeiGeneral(WeiVO weiVo, Model model) throws Exception {
		logger.debug("Controller::insertWeiGeneral");
		weiService.insertWeiGeneral(weiVo);
		return "redirect:/kingdomWei";
	}
	

	

}
