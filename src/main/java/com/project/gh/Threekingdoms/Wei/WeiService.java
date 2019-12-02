package com.project.gh.Threekingdoms.Wei;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeiService {
	@Autowired WeiDAO weiDao;
	private static final Logger logger = LoggerFactory.getLogger(WeiService.class);
	
	//insert
	public int insertWeiGeneral(WeiVO weiVo) throws Exception {
		logger.info("SERVICE :: insertWeiGeneral");
		return weiDao.insertWeiGeneral(weiVo);
	}
	
	//select
	public List<WeiVO> selectWeiGeneral() {
		return weiDao.selectWeiGeneral();
	}

}
