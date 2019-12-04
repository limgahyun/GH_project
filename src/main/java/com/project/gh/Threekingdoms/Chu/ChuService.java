package com.project.gh.Threekingdoms.Chu;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ChuService {
	@Autowired ChuDAO chuDao;
	private static final Logger logger = LoggerFactory.getLogger(ChuService.class);
	
	
	//select
	public List<ChuVO> selectChuGeneral() {
		logger.info("SERVICE :: selectChuGeneral");
		return chuDao.selectChuGeneral();
	}
	
	//insert
	@Transactional
	public int insertChuGeneral(ChuVO chuVo) throws Exception {
		logger.info("SERVICE :: insertChuGeneral");
		return chuDao.insertChuGeneral(chuVo);
	}
	

}
