/**
 * crowd
 * com.crowd.controller.website
 * UserInfoController.java
 * 
 * 2016年7月24日-下午6:39:20
 *  
 *
 */package com.crowd.controller.website.user;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.crowd.service.IUserInfoService;

/**
 *用户控制器
 * UserInfoController
 * 
 * Lange
 * Lange
 * 2016年7月24日 下午6:39:20
 * 
 * @version 1.0.0
 *http://localhost:8080/user/queryuser?id=1
 */
 @Controller
 @RequestMapping("/user")
public class UserInfoController {
	 	/**
	 	 * 用户信息接口
	 	 */
	 	@Autowired
	 	IUserInfoService userInfoService;
	 	
	 	/**
	 	 * 用户信息页
	 	 */
	 	private final String USER_INFO_WEB_PAGE = "user/userInfo";
	 	
	 	@RequestMapping("/queryuser")
	 	public ModelAndView getUserInfoById(HttpServletRequest request){
	 		ModelAndView view = new ModelAndView(USER_INFO_WEB_PAGE);
	 		String id = request.getParameter("id");
	 		view.addObject("userinfo",userInfoService.getUserInfoById(Long.valueOf(id)));
	 		return view;
	 	}
}
