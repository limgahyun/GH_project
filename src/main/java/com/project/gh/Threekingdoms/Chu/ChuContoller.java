package com.project.gh.Threekingdoms.Chu;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.gh.Threekingdoms.Wei.WeiService;

@Controller
public class ChuContoller {
	@Autowired ChuService chuService;
	private static final Logger logger = LoggerFactory.getLogger(ChuContoller.class);

	
	/*
	 * 촉나라 홈 리스트
	 */
	@RequestMapping(value = "/kingdomChu", method = RequestMethod.GET)
	public String threekingdoms(Model model) {
		logger.debug("Controller::kingdom Chu Listpage");
		
		List<ChuVO> chuVo = chuService.selectChuGeneral();
		model.addAttribute("chuVo", chuVo);
		
		return "/threekingdoms/chu/kingdomChu";
	}
	
	
	/*
	 * 촉나라 장수추가 폼 insert Form
	 * */
	@RequestMapping(value = "/formChu", method = RequestMethod.GET)
	public String formChu(Locale locale, Model model) {
		logger.info("Controller::Chu General insert Form");	
		return "/threekingdoms/chu/formChu";
	}
	
	
	/*
	 * 촉나라 장수추가 insert
	 * */
	@RequestMapping(value = "/insertChuGeneral", method = RequestMethod.POST, produces="text/plain;charset=UTF-8")
	public String insertChuGeneral(ChuVO chuVo, Model model) throws Exception {
		logger.debug("Controller::insertChuGeneral");
		chuService.insertChuGeneral(chuVo);
		return "redirect:/kingdomChu";
	}

}
