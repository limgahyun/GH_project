package com.project.gh.Threekingdoms.Wei;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class WeiFileDAO {

	private static final Logger logger = LoggerFactory.getLogger(WeiFileDAO.class);
	@Autowired private SqlSessionTemplate sqlSession;
	final String NS = "com.project.gh.Threekingdoms.Wei.WeiFileMapper.";
	
	public int insertWeiFile(WeiFile weiFile) {
		logger.debug("WeiFileDAO insertWeiFile : " + weiFile.toString());
		
		int row = sqlSession.insert(NS+"insertWeiFile", weiFile);
		return row;
	}
}
