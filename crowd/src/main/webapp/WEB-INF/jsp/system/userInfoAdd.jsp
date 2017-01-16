<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/> 
<!DOCTYPE>  
<html>  
  <head>  
    <title>测试</title>
 <link rel="stylesheet" href="//apps.bdimg.com/libs/bootstrap/3.3.4/css/bootstrap.min.css">
<script src="http://cdn.static.runoob.com/libs/angular.js/1.4.6/angular.min.js"></script>
<script type="text/javascript" src="${ctx}/resources/js/angularjs/angular-resource.min.js"></script>  
  </head>  
 <body ng-app="myApp" ng-controller="userCtrl">
		<div class="panel panel-default">
			<div class="panel-heading">
        		<h3 class="panel-title text-center">
            		新增用户
        		</h3>
    		</div>
			<div class="panel-body">
				<form class="form-horizontal" role="form" name="userForm" novalidate>
					<div class="form-group">
						<label  class="col-sm-2 control-label">姓名</label>
						<div class="col-sm-10">
							<input type="text" name="username" placeholder="请输入姓名" class="form-control" ng-model="usersInfo.userName"  required>
							<span style="color:red" ng-show="userForm.username.$dirty">
							<span ng-show="userForm.username.$error.required">请输入姓名</span>
							</span>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">性别</label>
						<div class="col-sm-10">
							<div class="radio">
							   <label>
							      <input type="radio" name="sexRadios"  id="optionsRadios1" 
							         value="1" checked> 男
							   </label>
							</div>
							<div class="radio">
							   <label>
							      <input type="radio" name="sexRadios"  id="optionsRadios2" 
							         value="0">
							         女
							   </label>
							</div>
						</div>
					</div>
					
					<div class="form-group">
						<label  class="col-sm-2 control-label">学历</label>
						<div class="col-sm-10">
							<select ng-change="opChange()" value="x.edutionCode" class="form-control" ng-model="selectedEdution" ng-options="x.edutionName for x in edutionMap">
								
							</select>
							
						</div>
					</div>
					
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<div class="checkbox">
								<label>
          							<input type="checkbox" > 用户协议
        						</label>
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-default" ng-disabled="userForm.$invalid">提交</button>
						</div>
					</div>
				</form>
				
				<button class="btn btn-success" ng-click="saveUserInfo()">
					<span> save </span>
				</button>
				
			</div>
		</div>
	</body>
<script src="${ctx}/resources/js/myuser.js"></script>
</html>  