/**
 * crowd
 * com.crowd.service
 * IUserInfoService.java
 * 
 * 2016年7月24日-下午6:32:27
 *  
 *
 */
package com.crowd.service;

import com.crowd.entity.UserInfo;

/**
 *
 * IUserInfoService
 * 用户信息业务接口
 * Lange
 * Lange
 * 2016年7月24日 下午6:32:27
 * 
 * @version 1.0.0
 *
 */
public interface IUserInfoService {
	public UserInfo getUserInfoById(long id);
}
