/**
 * crowd
 * com.crowd.dao
 * IUserInfo.java
 * 
 * 2016年7月24日-上午3:38:39
 *  
 *
 */
package com.crowd.dao;

import com.crowd.entity.UserInfo;

/**
 *
 * IUserInfo
 * 用户信息接口
 * Lange
 * Lange
 * 2016年7月24日 上午3:38:39
 * 
 * @version 1.0.0
 *
 */
public interface IUserInfoDao {
	/**
	 * 
	 * selectByPrimaryKey(根据用户ID查询用户信息)
	 * (这里描述这个方法适用条件 – 可选)
	 * @param id
	 * @return
	 *UserInfo
	 * @exception
	 * @since  1.0.0
	 */
	public UserInfo selectByPrimaryKey(Long id);

}
