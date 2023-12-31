package com.example.spring02.model.member.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.spring02.model.member.dto.MemberDTO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	@Inject
	SqlSession sqlSession;

	@Override
	public boolean loginCheck(MemberDTO dto) {
		String name=sqlSession.selectOne("member.login_check",dto);
		//조건식? true일때의 값 : false일때의 값
		return (name==null)?false:true;
	}

	@Override
	public MemberDTO viewMember(String userid) {
		return sqlSession.selectOne("member.viewMember",userid);
	}

	@Override
	public List<MemberDTO> list() {
		return sqlSession.selectList("member.memberlist");
	} 

}
