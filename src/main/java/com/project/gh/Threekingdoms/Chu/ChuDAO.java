package com.project.gh.Threekingdoms.Chu;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ChuDAO {	
	@Autowired private SqlSessionTemplate sqlSession;
	private static final Logger logger = LoggerFactory.getLogger(ChuDAO.class);
	final String NS = "com.project.gh.Threekingdoms.Chu.ChuMapper.";
	
	
	//select
	public List<ChuVO> selectChuGeneral() {
		logger.info("DAO::selectChuGeneral");
		return sqlSession.selectList(NS+"selectChuGeneral");
	}
	
	//insert
	public int insertChuGeneral(ChuVO chuVO) throws Exception {
		logger.info("DAO::insertWeiGeneral");
		int row = sqlSession.insert(NS+"insertChuGeneral", chuVO);
		return row;
	}
	

}
