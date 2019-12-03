package com.project.gh.Threekingdoms.Wei;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

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
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "/threekingdoms/wei/formWei";
	}
	
	/*
	 * 위나라 장수추가하기 insert
	 * */
	@RequestMapping(value = "/insertWeiGeneral", method = RequestMethod.POST)
	public String insertWeiGeneral(HttpSession session, WeiRequest weiRequest, Model model) throws Exception {
		logger.debug("Controller::insertWeiGeneral");
		
		List<MultipartFile> list = weiRequest.getMultipartfile();
		logger.debug("list : " + list);
		
		for(MultipartFile file : list) {
			String fileType = file.getContentType();
			
			if(!fileType.equals("image/jpeg") && !fileType.equals("image/jpg") && !fileType.equals("image/png") 
					&&!fileType.equals("image/bmp") && fileType.equals("image/webp")) {
				
				logger.debug("fileType : " + fileType);
				logger.info("이미지 파일이 아닙니다.");
				model.addAttribute("adult_name", weiRequest.getAdult_name());
				model.addAttribute("name", weiRequest.getName());
				model.addAttribute("explicate", weiRequest.getExplicate());
				
				return "/threekingdoms/wei/formWei";
			}
		}
		
		//String path = SystemPath.SYSTEM_PATH;
		String path = session.getServletContext().getRealPath("/resources/threekingdoms/uploadFile/");
		logger.debug("path : " + path);
		weiService.insertWeiGeneral(weiRequest, path);
		return "redirect:/kingdomWei";
	}
	

	
	

}
