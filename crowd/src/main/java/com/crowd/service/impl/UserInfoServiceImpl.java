/**
 * crowd
 * com.crowd.service.impl
 * UserInfoServiceImpl.java
 * 
 * 2016年7月24日-下午6:33:43
 *  
 *
 */
package com.crowd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crowd.dao.IUserInfoDao;
import com.crowd.entity.UserInfo;
import com.crowd.service.IUserInfoService;

/**
 *
 * UserInfoServiceImpl
 * 
 * Lange
 * Lange
 * 2016年7月24日 下午6:33:43
 * 
 * @version 1.0.0
 *
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements IUserInfoService {
	
	@Autowired
	IUserInfoDao userInfoDao;

	/* (non-Javadoc)
	 * @see com.crowd.service.IUserInfoService#getUserInfoById(long)
	 */
	@Override
	public UserInfo getUserInfoById(long id) {
		
		return userInfoDao.selectByPrimaryKey(id);
	}

}
