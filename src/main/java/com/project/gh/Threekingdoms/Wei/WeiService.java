package com.project.gh.Threekingdoms.Wei;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

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
