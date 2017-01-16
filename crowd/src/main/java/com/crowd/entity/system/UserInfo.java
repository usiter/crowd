package com.crowd.entity.system;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

@TableName("t_userinfo")
public class UserInfo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
		@TableId
		private Long id;//主键
		private String userId;
		private String userName;
		private String sex;
		private String age;
		private String edution;
		private String authentication;
		
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
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
