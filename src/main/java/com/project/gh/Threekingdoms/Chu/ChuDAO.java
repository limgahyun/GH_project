package com.project.gh.Threekingdoms.Chu;

import java.util.List;
import java.util.Map;

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
	public List<ChuVO> selectChuGeneral(Map<String, Object> map) {
		logger.info("DAO::selectChuGeneral");
		return sqlSession.selectList(NS+"selectChuGeneral", map);
	}
	
	//select List Count
		public int countChuList(Map<String, Object> map) {
			logger.debug("DAO::countChuList");
			return sqlSession.selectOne(NS+"countChuList", map);
		}
	
	//insert
	public int insertChuGeneral(ChuVO chuVO) throws Exception {
		logger.info("DAO::insertWeiGeneral");
		int row = sqlSession.insert(NS+"insertChuGeneral", chuVO);
		return row;
	}
	

}
