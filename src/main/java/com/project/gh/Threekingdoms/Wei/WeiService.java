package com.project.gh.Threekingdoms.Wei;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

@Service
public class WeiService {
	@Autowired WeiDAO weiDao;
	@Autowired FileWeiDAO fileWeiDao;
	private static final Logger logger = LoggerFactory.getLogger(WeiService.class);
	
	//insert
	@Transactional
	public void insertWeiGeneral(WeiRequest weiRequset, String path) throws Exception {
		logger.info("SERVICE :: insertWeiGeneral");
		
		List<MultipartFile> multipartFileList = weiRequset.getMultipartfile();
		
		//WeiVO의 값에 weiRequset에서 받아온 값으로 세팅해준다.
		WeiVO weiVo = new WeiVO();
		logger.info("weiVo : " + weiVo);
		weiVo.setAdult_name(weiRequset.getAdult_name());
		weiVo.setName(weiRequset.getName());
		weiVo.setExplicate(weiRequset.getExplicate());
		
		// 다중 파일 업로드를 위해 for문으로 반복 시킨다.
		// 파일 업로드의 갯수만큼 갯수당 파일명을 입력해주는 반복문이 필요하다.
		for(MultipartFile multipartFile : multipartFileList) {
			//16진수 유효아이디가 만들어진다?
			UUID uuid = UUID.randomUUID();
			String filename = uuid.toString();
			logger.debug("String filename : " + filename);
			
			//-문자를 찾아 없에고 문자열을 반환한다. 
			filename = filename.replace("-", "");
			
			//2.파일 확장자
			//lastIndexOf()문자열에서 마지막 문자열을 반환한다.
			//getOriginalFilename() 올린 파일의 전체 이름
			int doIndex = multipartFile.getOriginalFilename().lastIndexOf(".");
			logger.info("int doIndex : " + doIndex);
			
			String fileExt = multipartFile.getOriginalFilename().substring(doIndex+1);
			logger.info("String fileExt : " + fileExt);
			
			//3.파일 컨텐트 타입
			String fileType = multipartFile.getContentType();
			logger.info("String fileType : " + fileType);		
			
			//4.파일 사이즈
			long fileSize = multipartFile.getSize();
			
			//5.파일 저장(매개변수 path를 이용)
			File file = new File(path+filename+"."+fileExt);
			
			try {
				multipartFile.transferTo(file);
			} catch (IllegalStateException e) {			
				e.printStackTrace();
			} catch (IOException e) {			
				e.printStackTrace();
			}
			
			
			FileWeiVO fileWeiVo = new FileWeiVO();
			logger.info("fileWeiVo : " + fileWeiVo);
			fileWeiVo.setFileWeiName(filename);
			fileWeiVo.setFileWeiExt(fileExt);
			fileWeiVo.setFileWeiType(fileType);
			fileWeiVo.setFileWeiSize(doIndex);
			
			weiVo.getFileWei().add(fileWeiVo);
		}
			weiDao.insertWeiGeneral(weiVo);
			
			
			for(FileWeiVO fileWeiVo : weiVo.getFileWei()) {
				fileWeiVo.setWei_id(weiVo.getWei_id());
				fileWeiDao.insertFileWei(fileWeiVo);
			}
	}
	
	//select
	public List<WeiVO> selectWeiGeneral() {
		logger.info("SERVICE :: selectWeiGeneral");
		return weiDao.selectWeiGeneral();
	}

}
