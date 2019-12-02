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
	@Autowired WeiFileDAO weiFileDao;
	private static final Logger logger = LoggerFactory.getLogger(WeiService.class);
	
	//insert
	public int insertWeiGeneral(WeiVO weiVo) throws Exception {
		logger.info("SERVICE :: insertWeiGeneral");
		return weiDao.insertWeiGeneral(weiVo);
	}
	
	//insert file
		public void insertWeiGeneral(WeiRequest weiRequest, String path) throws Exception {
			logger.info("SERVICE :: insertWeiGeneral : " + weiRequest.toString());
			List<MultipartFile> multipartFileList = weiRequest.getMultipartFile();
			
			WeiVO weiVo = new WeiVO();
			weiVo.setWei_id(weiRequest.getWei_id());
			weiVo.setAdult_name(weiRequest.getAdult_name());
			weiVo.setName(weiRequest.getName());
			weiVo.setExplicate(weiRequest.getExplicate());
			
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
				
				WeiFile weiFile = new WeiFile();			
				weiFile.setWeiFileName(filename);
				weiFile.setWeiFileType(fileType);
				weiFile.setWeiFileExt(fileExt);
				weiFile.setWeiFileSize(doIndex);
				
			}
			
			logger.debug("weiVO : " + weiVo);
			weiDao.insertWeiGeneral(weiVo);
			
			int wei_id = weiVo.getWei_id();
			logger.debug("Wei_id :" + wei_id);
			for(WeiFile weiFile : weiVo.getWeiFile()) {				
				weiFile.setWei_id(wei_id);
				weiFileDao.insertWeiFile(weiFile);
			}
		}
	
	//select
	public List<WeiVO> selectWeiGeneral() {
		return weiDao.selectWeiGeneral();
	}

}
