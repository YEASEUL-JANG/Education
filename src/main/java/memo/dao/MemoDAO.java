package memo.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import memo.dto.MemoDTO;
import sqlmap.MybatisManager;

public class MemoDAO {
	//마이바티스에선 ArrayList가 아닌 List를 쓰도록 고정시켜놓음.
	public List<MemoDTO> listMemo(String searchkey, String search){
		SqlSession session = MybatisManager.getInstance().openSession();//마이바티스 실행객체
		List<MemoDTO> list = null;
		try {
			if(searchkey.equals("writer_memo")) {//이름+메모
				list=session.selectList("memo.listAll",search);//selectList("네임스페이스.아이디")
			}else {//메모 또는 이름으로만 검색
				Map<String,String> map=new HashMap<>();
				map.put("searchkey", searchkey);
				map.put("search", search);
				list=session.selectList("memo.list",map);//mybatis는 파라미터 한개만 전달가능하기 때문에 map으로 묶음
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session != null) session.close();
		}
		
		return list;
	}

	public void insertMemo(MemoDTO dto) {
		SqlSession session = MybatisManager.getInstance().openSession();
		session.insert("memo.insert",dto);
		//mybatis는 파라미터 1개밖에 전달이 안됨
		session.commit();//수동커밋을 해줘야함(자동커밋을 막아놈)
		session.close();//mybatis종료
	}
}
