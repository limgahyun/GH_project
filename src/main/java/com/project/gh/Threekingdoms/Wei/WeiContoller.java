package com.project.gh.Threekingdoms.Wei;

import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WeiContoller {
	@Autowired WeiService weiService;
	private static final Logger logger = LoggerFactory.getLogger(WeiContoller.class);
	
	
	/*
	 * 위나라 홈 리스트 
	 * */
	@RequestMapping(value = "/kingdomWei", method = RequestMethod.GET)
	public String listWeiGeneral(Model model
									, HttpSession session
									, @RequestParam(value="currentPage", defaultValue="1") int currentPage
									, @RequestParam(value="pagePerRow", defaultValue="9", required=true) int pagePerRow ) throws Exception {
		logger.debug("Controller::kingdom Wei Listpage");
		
		Map<String, Object> map = weiService.listWeiGeneral(currentPage, pagePerRow);
		model.addAttribute("weiVo", map.get("weiVo"));
		model.addAttribute("lastPage", map.get("lastPage"));
		model.addAttribute("beginPageNumForCurrentPage", map.get("beginPageNumForCurrentPage"));
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("pagePerRow", pagePerRow);
			 
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
	 * 위나라 장수추가 insert
	 * */
	@RequestMapping(value = "/insertWeiGeneral", method = RequestMethod.POST, produces="text/plain;charset=UTF-8")
	public String insertWeiGeneral(WeiVO weiVo, Model model) throws Exception {
		logger.debug("Controller::insertWeiGeneral");
		weiService.insertWeiGeneral(weiVo);
		return "redirect:/kingdomWei";
	}
	

	

}
