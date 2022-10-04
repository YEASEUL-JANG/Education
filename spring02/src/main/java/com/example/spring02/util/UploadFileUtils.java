package com.example.spring02.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.UUID;

import javax.imageio.ImageIO;

import org.imgscalr.Scalr;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.FileCopyUtils;

public class UploadFileUtils {
	//로깅
	private static final Logger logger=
			LoggerFactory.getLogger(UploadFileUtils.class);
	public static String uploadFile(String uploadPath,String originalName, byte[] fileData) throws Exception{
		//uuid발금
		UUID uid = UUID.randomUUID();//랜덤 난수 발행
		String savedName= uid.toString()+"_"+originalName;
		//업로드할 디렉토리생성
		String savedPath=calcPath(uploadPath);
		File target=new File(uploadPath+savedPath, savedName);
		//임시디렉토리에 업로드된 파일을 지정된 디렉토리로 복사
		FileCopyUtils.copy(fileData, target);
		//파일의 확장자 검사
		//aaa.bbb.ccc.jpg 같이 들어온 경우 맨 끝의 . 뒤가 확장자
		String formatName=originalName.substring(originalName.lastIndexOf(".")+1);
		String uploadedFileName=null;
		//이미지 파일인 경우 : 썸네일(작은이미지)생성
		if(MediaUtils.getMediaType(formatName)!= null) {
			//썸네일 생성
			uploadedFileName=makeThumbnail(uploadPath, savedPath, savedName);
		}else {//이미지파일이 아닌경우
			uploadedFileName=makeIcon(uploadPath, savedPath, savedName);
			
		}
		return uploadedFileName;
	}
	//날짜처리 관련 메소드(2022년폴더/00월 폴더/00일폴더 생성)
	private static String calcPath(String uploadPath) {
		Calendar cal= Calendar.getInstance();
		String yearPath = File.pathSeparator + cal.get(Calendar.YEAR);
		String monthPath = yearPath +File.separator 
				+ new DecimalFormat("00").format(cal.get(Calendar.MONTH)+1);
		String datePath = monthPath +File.separator
				+new DecimalFormat("00").format(cal.get(Calendar.DATE));
		//디렉토리 생성 메소드 호출
		//makeDir(uploadPath,yearPath, monthPath, datePath);
		logger.info(datePath);
		return datePath;
	}
	//썸네일 이미지와 이름 생성
	private static String makeThumbnail(String uploadPath, String path, String fileName) 
			throws Exception{
		//원본이미지를 읽기 위한 버퍼활용
		BufferedImage sourceImg = ImageIO.read(new File(uploadPath+path,fileName));
		//100픽셀단위의 썸네일 생성
		BufferedImage destImg = Scalr.resize(sourceImg, Scalr.Method.AUTOMATIC,
				Scalr.Mode.FIT_TO_HEIGHT,100);
		//썸네일 이름생성
		String thumbnailName = uploadPath+path+File.separator+"s_"+fileName;
		File newFile = new File(thumbnailName);
		String formatName = fileName.substring(fileName.lastIndexOf(".")+1);
		//썸네일 생성
		ImageIO.write(destImg,formatName.toUpperCase(),newFile);
		//썸네일 이름을 리턴
		return thumbnailName.substring(uploadPath.length()).replace(File.separatorChar,'/');
	}
	//pom.xml에서 라이브러리 셋팅
	private static String makeIcon(String uploadPath, String path, String fileName) throws Exception{
		//File.separator는 이름 구분자인데, 예를들어 윈도우의 경우
		//upload\\test.txt, 리눅스는 upload/test.txt라고 쓰게되는데 
		//\\나/를 따로 신경안써도 "upload" +"File.separator+"text.txt" 라 쓰면 os따라 자동으로 처리한다.
		String iconName=uploadPath + path + File.separator+fileName;
		//아이콘 이름을 리턴, File.separatorChar: separator과 같은 기능의 이름 구분자
		//리턴값을 따로 정할 수 있다.
		return iconName.substring(uploadPath.length()).
				replace(File.separatorChar,'/');
	}
}
