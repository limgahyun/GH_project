package com.project.gh.Threekingdoms.Wei;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WeiService {
	@Autowired WeiDAO weiDao;
	private static final Logger logger = LoggerFactory.getLogger(WeiService.class);
	
	
	//장수 목록 및 페이징
	public Map<String, Object> listWeiGeneral(int currentPage, int pagePerRow) {
		logger.info("SERVICE :: listWeiGeneral");
		
		int beginRow = (currentPage-1)*pagePerRow;
			logger.info("currentPage :" + currentPage);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("beginRow", beginRow);
		map.put("pagePerRow", pagePerRow);
			logger.info("beginRow :" + beginRow);
			logger.info("pagePerRow :" + pagePerRow);

		
		List<WeiVO> weiVo = weiDao.listWeiGeneral(map);
		logger.debug("List<WeiVO> : " + weiVo);
		
		int total = weiDao.countWeiList(map); 
		int lastPage = 0;
		
		if(0 == total) {
			lastPage = 1;
		} else if (total%pagePerRow == 0) { 
			lastPage = total/pagePerRow; 
		} else {
			lastPage = total/pagePerRow + 1;
		}
		
		/* 페이지가 5개 단위씩 보이게 하는 계산식 */
		int temp = (currentPage - 1)/5;
		int beginPageNumForCurrentPage = temp * 5 + 1;
		
		Map<String, Object> returnMap = new HashMap<String, Object>();
		returnMap.put("weiVo", weiVo);
		returnMap.put("lastPage", lastPage);
		returnMap.put("beginPageNumForCurrentPage", beginPageNumForCurrentPage);
		
		return returnMap;
	}
	
	//개별 장수 보기
	public WeiVO weiCharacterIntro(WeiVO weiVo) {
		logger.debug("SERVICE :: weiCharacterIntro");
		return weiDao.weiCharacterIntro(weiVo);
	}
		
	//장수 등록
	@Transactional
	public int insertWeiGeneral(WeiVO weiVo) throws Exception {
		logger.info("SERVICE :: insertWeiGeneral");
		return weiDao.insertWeiGeneral(weiVo);
	}
	
	//장수 수정 폼 이동
	public WeiVO modifyFormWeiGeneral(WeiVO weiVo)  {	
		logger.info("SERVICE :: modifyFormWeiGeneral");
		return weiDao.modifyFormWeiGeneral(weiVo); 
	}
	
	//장수 수정
	public int modifyWeiGeneral(WeiVO weiVo)  {	
		logger.info("SERVICE :: modifyWeiGeneral");
		return weiDao.modifyWeiGeneral(weiVo);
	}
	
	//장수 삭제
	public void deleteGeneral(WeiVO weiVo) {
		logger.info("SERVICE :: deleteGeneral");
		weiDao.deleteGeneral(weiVo);
	}

}
