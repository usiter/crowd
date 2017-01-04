<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>  
<!DOCTYPE>  
<html>  
  <head>  
    <title>测试</title>  
  </head>  
  <body>  
    ${userinfo.userId}<br/> 
    ${userinfo.userName}<br/> 
    ${userinfo.age} 
    
    <form action="/system/save" method="post">
    <input type="text" name="id" value="${userinfo.id}" />
    <input type="text" name="userId" value="${userinfo.userId}" />
    <input type="text" name="userName" value="${userinfo.userName}" />
    <input type="text" name="age" value="${userinfo.age}" />
    <input type="submit"  value="提交" />
    </form>
    
  </body>  
</html>  