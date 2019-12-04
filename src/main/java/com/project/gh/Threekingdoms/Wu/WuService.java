package com.project.gh.Threekingdoms.Wu;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WuService {
	@Autowired WuDAO wuDao;
	private static final Logger logger = LoggerFactory.getLogger(WuService.class);
	
	//select
	public Map<String, Object> selectWuGeneral(int currentPage, int pagePerRow) {
		logger.info("SERVICE :: selectWuGeneral");

		int beginRow = (currentPage-1)*pagePerRow;
		logger.info("currentPage :" + currentPage);
	
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("beginRow", beginRow);
		map.put("pagePerRow", pagePerRow);
			logger.info("beginRow :" + beginRow);
			logger.info("pagePerRow :" + pagePerRow);
	
		
		List<WuVO> wuVo = wuDao.selectWuGeneral(map);
		logger.debug("List<WuVO> : " + wuVo);
		
		int total = wuDao.countWuList(map); 
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
		returnMap.put("wuVo", wuVo);
		returnMap.put("lastPage", lastPage);
		returnMap.put("beginPageNumForCurrentPage", beginPageNumForCurrentPage);
		
		return returnMap;
	}
	
	//insert
	@Transactional
	public int insertWuGeneral(WuVO wuVo) throws Exception {
		logger.info("SERVICE :: insertWuGeneral");
		return wuDao.insertWuGeneral(wuVo);
	}
	

}
