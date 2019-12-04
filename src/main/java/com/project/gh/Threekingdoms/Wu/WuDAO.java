package com.project.gh.Threekingdoms.Wu;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class WuDAO {	
	@Autowired private SqlSessionTemplate sqlSession;
	private static final Logger logger = LoggerFactory.getLogger(WuDAO.class);
	final String NS = "com.project.gh.Threekingdoms.Wu.WuMapper.";
	
	//insert
	public int insertWuGeneral(WuVO wuVO) throws Exception {
		logger.info("DAO::insertWuGeneral");
		int row = sqlSession.insert(NS+"insertWuGeneral", wuVO);
		return row;
	}
	
	//select
	public List<WuVO> selectWuGeneral() {
		logger.info("DAO::selectWuGeneral");
		return sqlSession.selectList(NS+"selectWuGeneral");
	}

}
