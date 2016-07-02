package com.peachliu.test.dao;

import com.peachliu.test.domain.Students;

public interface StudentsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Students record);

    int insertSelective(Students record);

    Students selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Students record);

    int updateByPrimaryKey(Students record);
}