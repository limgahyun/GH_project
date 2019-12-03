package com.project.gh.Threekingdoms.Wei;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FileWeiDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(FileWeiDAO.class);
	
	@Autowired private SqlSessionTemplate sqlSession;
	final String NS = "com.project.gh.Threekingdoms.Wei.FileWeiMapper.";
	
	public int insertFileWei(FileWeiVO fileWeiVo) {
		logger.debug("FileWeiDAO :: insertFileWei : " + fileWeiVo.toString());
		
		int row = sqlSession.insert(NS+"insertFileWei", fileWeiVo);
		return row;
	}

}
