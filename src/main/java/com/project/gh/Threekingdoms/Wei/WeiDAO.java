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
	
	//장수 목록
	public List<WeiVO> listWeiGeneral(Map<String, Object> map) {
		logger.info("DAO :: selectWeiGeneral");
		return sqlSession.selectList(NS+"listWeiGeneral", map);
	}
	
	//장수 목록 페이징
	public int countWeiList(Map<String, Object> map) {
		logger.debug("DAO :: countWeiList");
		return sqlSession.selectOne(NS+"countWeiList", map);
	}
	
	//개별 장수 보기
	public WeiVO weiCharacterIntro(WeiVO weiVo) {
		logger.debug("DAO :: weiCharacterIntro");
		return sqlSession.selectOne(NS+"weiCharacterIntro", weiVo);
	}
	
	//장수 등록
	public int insertWeiGeneral(WeiVO weiVO) throws Exception {
		logger.info("DAO :: insertWeiGeneral");
		int row = sqlSession.insert(NS+"insertWeiGeneral", weiVO);
		return row;
	}
	
	//장수 수정 폼 이동 
	public WeiVO modifyFormWeiGeneral(WeiVO weiVO){
		logger.info("DAO :: modifyFormWeiGeneral");
		return sqlSession.selectOne(NS+"modifyFormWeiGeneral", weiVO);
	}
	
	//장수 수정
	public int modifyWeiGeneral(WeiVO weiVO) { 
		logger.info("DAO :: modifyWeiGeneral");
		return sqlSession.update(NS+"modifyWeiGeneral", weiVO);
	}
	
	//장수 삭제
	public void deleteGeneral(WeiVO weiVO) {
		logger.info("DAO :: deleteGeneral");
		sqlSession.delete(NS + "deleteGeneral", weiVO);	
	}

}
