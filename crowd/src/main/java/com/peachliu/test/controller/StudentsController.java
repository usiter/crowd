package com.peachliu.test.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.peachliu.test.domain.Students;
import com.peachliu.test.service.IStudentsService;

/**
 * 
 * @author comer
 *测试访问路径
 *http://localhost:8080/crowd/students/showStudents?id=100001
 */
@Controller  
@RequestMapping("/students") 
public class StudentsController {
	 	@Resource  
	    private IStudentsService studentsService;  
	      
	    @RequestMapping("/showStudents")  
	    public String toIndex(HttpServletRequest request,Model model){  
	        int userId = Integer.parseInt(request.getParameter("id"));  
	        Students students = this.studentsService.getStudentsById(userId);  
	        model.addAttribute("students", students);  
	        //return "index/test"; 前端浏览器URL /项目名称/WEB-INF/jsp/index/test.jsp
	        return "test"; //test是jsp名字
	    }  

}
