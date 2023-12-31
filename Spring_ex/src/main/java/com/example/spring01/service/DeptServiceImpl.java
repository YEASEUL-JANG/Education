package com.example.spring01.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.spring01.model.dao.DeptDAO;
import com.example.spring01.model.dto.DeptVO;

@Service
public class DeptServiceImpl implements DeptService {
	
	//@Inject대신 @Resource 사용가능
	//차이점은 Inject는 연결방식이 type방식이고 resource는 name방식
	@Resource(name="deptDao")
	private DeptDAO deptDao;
	
	@Override
	public List<DeptVO> deptList() {
		return deptDao.deptList();
	}

}
