package com.example.spring01.model.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.spring01.model.dto.DeptVO;

//@Resource에서 name을 deptDao로 연결함
@Repository("deptDao")
public class DeptDAO {
	@Inject
	SqlSession sqlSession;
	
	public List<DeptVO> deptList(){
		return sqlSession.selectList("dept.deptList");
	}
}
