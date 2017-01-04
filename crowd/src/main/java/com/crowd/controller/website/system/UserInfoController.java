/*
 * Copyright (C), 2016-2017, xxxxxx
 * FileName: UserController.java
 * Author:   hongzhi
 * Date:     2017年1月4日 上午10:28:20
 * Description: //模块目的、功能描述      
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.crowd.controller.website.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.crowd.controller.website.common.BaseController;
import com.crowd.entity.system.UserInfo;
import com.crowd.service.system.IUserInfoService;

/**
 * 〈一句话功能简述〉<br> 
 * 〈功能详细描述〉
 *	用户信息
 * @author 
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Controller
@RequestMapping("/system")
public class UserInfoController extends BaseController {
	
	@Autowired
	IUserInfoService userInfoService;
	
	/**
 	 * 用户信息页
 	 */
 	private final String USER_INFO_WEB_PAGE = "system/userInfo";
	
	@RequestMapping("/userinfo")
	public ModelAndView userinfo(){
		ModelAndView view = new ModelAndView(USER_INFO_WEB_PAGE);
		List<UserInfo> userInfo = userInfoService.selectList(null);
		view.addObject("test", "test22222");
		view.addObject("userinfo", userInfo.get(0));
		return view;
	}

	/**
	 * 
	 * 功能描述: <br>
	 * 〈功能详细描述〉
	 *
	 * @return
	 * @see [相关类/方法](可选)
	 * @since [产品/模块版本](可选)
	 */
	@ResponseBody
	@RequestMapping("/save")
	public Object save(UserInfo userInfo){
		if(userInfo.getId() != null){
			return userInfoService.updateById(userInfo) ? renderSuccess("修改成功") : renderError("修改失败");
		}else{
			return userInfoService.insert(userInfo) ? renderSuccess("添加成功") : renderError("添加失败");
		}
		
	}
	
}
