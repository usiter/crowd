package com.peachliu.test.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.peachliu.test.dao.StudentsMapper;
import com.peachliu.test.domain.Students;
import com.peachliu.test.service.IStudentsService;

@Service("studentsService")
public class StudentsServiceImpl implements IStudentsService {
	@Resource
	private StudentsMapper studentsDao;
	
	@Override
	public Students getStudentsById(long id) {
		// TODO Auto-generated method stub
		return this.studentsDao.selectByPrimaryKey(id);
	}

}
