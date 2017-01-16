/**
 * crowd
 * com.crowd.domain
 * UserVo.java
 * 
 * 2016年7月21日-上午12:14:46
 *  
 *
 */
package com.crowd.domain.system;

/**
 *
 * UserVo
 * 
 * Lange
 * Lange
 * 2016年7月21日 上午12:14:46
 * 
 * @version 1.0.0
 *
 */
public class UserInfoVo {
	private String userId;
	private String name;
	private String sex;
	private String age;
	private String edution;
	private String authentication;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getEdution() {
		return edution;
	}
	public void setEdution(String edution) {
		this.edution = edution;
	}
	public String getAuthentication() {
		return authentication;
	}
	public void setAuthentication(String authentication) {
		this.authentication = authentication;
	}
	
	
	

}
