package com.project.gh.Threekingdoms.Wu;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WuService {
	@Autowired WuDAO weiDao;
	private static final Logger logger = LoggerFactory.getLogger(WuService.class);
	
	//select
	public List<WuVO> selectWuGeneral() {
		logger.info("SERVICE :: selectWuGeneral");
		return weiDao.selectWuGeneral();
	}
	
	//insert
	@Transactional
	public int insertWuGeneral(WuVO weiVo) throws Exception {
		logger.info("SERVICE :: insertWuGeneral");
		return weiDao.insertWuGeneral(weiVo);
	}
	

}
