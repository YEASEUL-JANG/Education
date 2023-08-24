package guestbook.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import guestbook.dto.GuestBookDTO;
import sqlmap.MybatisManager;

public class GuestBookDAO {
	//방명록 목록 리턴
	public List<GuestBookDTO> getList(String searchkey, String search){
		SqlSession session = MybatisManager.getInstance().openSession();
		//selectList("네임스페이스.아이디") - 네임스페이스는 생략이 가능하다.
		List<GuestBookDTO> list = null;
		if(searchkey.equals("name_content")) {//이름+내용
			list=session.selectList("gbListAll","%"+search+"%");
		}else {
			Map<String,String> map=new HashMap<>();
			map.put("searchkey", searchkey);
			map.put("search", "%"+search+"%");
			list = session.selectList("gbList",map);
		}
		
		
		//줄바꿈, 특수문자처리는 for문으로 처리
		for(GuestBookDTO dto : list) {
			String content=dto.getContent();
			String name=dto.getName();
			content=content.replace("<", "&lt");
			content=content.replace(">", "&gt");
			content=content.replace("\n", "<br>");
			content=content.replace("  ", "&nbsp;&nbsp;");
			//키워드 색칠하기
			if(searchkey.equals("content")) {//이름으로 검색시는 제외
				content=content.replace(search, "<span style='color:blue'>"+search+"</span>");
			}else if(searchkey.equals("name")) {
				name=name.replace(search, "<span style='color:blue'>"+search+"</span>");
			}else{
				name=name.replace(search, "<span style='color:blue'>"+search+"</span>");
				content=content.replace(search, "<span style='color:blue'>"+search+"</span>");
			}
			dto.setContent(content);
			dto.setName(name);
		}
		session.close();
		return list;
	}
	//방명록 insert
	public void gbInsert(GuestBookDTO dto) {
		SqlSession session = MybatisManager.getInstance().openSession();
		session.insert("gbInsert",dto);
		session.commit();
		session.close();
	}
	public boolean passwdCheck(int idx, String passwd) {
		boolean result=false;
		SqlSession session = MybatisManager.getInstance().openSession();
		GuestBookDTO dto = new GuestBookDTO();
		dto.setIdx(idx);
		dto.setPasswd(passwd);
		//들어오는게 숫자타입
		//selectList(레코드가 여러개 리턴), selectOne(레코드가 한개)
		int count= session.selectOne("passwdCheck",dto);
		session.close();
		if(count==1) {
			result=true;
		}else {result=false;}
		return result;
	}
	//게시물 상세정보 뷰
	public GuestBookDTO gbDatail(int idx) {
		GuestBookDTO dto = new GuestBookDTO();
		SqlSession session = MybatisManager.getInstance().openSession();
		dto=session.selectOne("gbDetail",idx);
		session.close();
		return dto;
	}
	//게시물 업데이트
	public void gbUpdate(GuestBookDTO dto) {
		SqlSession session = MybatisManager.getInstance().openSession();
		session.update("gbUpdate",dto);
		session.commit();
		session.close();
	}
	public void gbDelete(int idx) {
		SqlSession session = MybatisManager.getInstance().openSession();
		session.delete("gbDelete",idx);
		session.commit();
		session.close();
		
	}
}
