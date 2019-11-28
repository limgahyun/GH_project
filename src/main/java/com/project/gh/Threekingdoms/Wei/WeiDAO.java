package com.project.gh.Threekingdoms.Wei;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class WeiDAO {
	
	@Autowired private SqlSessionTemplate sqlSession;
	private static final Logger logger = LoggerFactory.getLogger(WeiDAO.class);
	final String NS = "com.project.gh.Threekingdoms.Wei.WeiMapper.";
	
	//insert
	public int insertWeiGeneral(WeiVO weiVo) throws Exception {
		logger.info("DAO :: insertWeiGeneral");
		int row = sqlSession.insert(NS+"insertWeiGeneral", weiVo);
		return row;
	}

}
