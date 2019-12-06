package com.project.gh.Threekingdoms.Wei;

import java.util.List;
import java.util.Map;

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
	
	//select
	public List<WeiVO> listWeiGeneral(Map<String, Object> map) {
		logger.info("DAO::selectWeiGeneral");
		return sqlSession.selectList(NS+"listWeiGeneral", map);
	}
	
	//select List Count
	public int countWeiList(Map<String, Object> map) {
		logger.debug("DAO::countWeiList");
		return sqlSession.selectOne(NS+"countWeiList", map);
	}
	
	//select one View
	public WeiVO weiCharacterIntro(WeiVO weiVo) {
		logger.debug("DAO::weiCharacterIntro");
		return sqlSession.selectOne(NS+"weiCharacterIntro", weiVo);
	}
	
	//insert
	public int insertWeiGeneral(WeiVO weiVO) throws Exception {
		logger.info("DAO::insertWeiGeneral");
		int row = sqlSession.insert(NS+"insertWeiGeneral", weiVO);
		return row;
	}
	

}
