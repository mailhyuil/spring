package com.callor.ems.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
/*
 * 파일 업로드 하기
 * 파일 업로드는 MultipartFile 객체에 파일 정보를 수신하고
 * 서버의 로컬 폴더에 파일을 transfer 한다.
 * 
 * 이때 파일의 이름을 조작하지 못하도록 변환하여 파일을 저장한다.
 * 그리고 변환된 파일이름을 return하여 DB 등에 저장할 수 있도록 한다
 * 
 */
public interface FileUpService {
	
	public String fileup(MultipartFile file);
	public List<String> filesUp(MultipartHttpServletRequest mFile);
}
