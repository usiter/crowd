<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>  
<!DOCTYPE>  
<html>  
  <head>  
    <title>测试</title>
 <link rel="stylesheet" href="//apps.bdimg.com/libs/bootstrap/3.3.4/css/bootstrap.min.css">
<script src="http://cdn.static.runoob.com/libs/angular.js/1.4.6/angular.min.js"></script>
<script type="text/javascript" src="../js/angularjs/angular-resource.min.js"></script>  
  </head>  
 <body ng-app="myApp" ng-controller="userCtrl">

<div class="container">

<h3 class="text-center">用户信息</h3>

		<table class="table table-striped">
		  <thead>
		    <tr>
		      <th>编辑</th>
		      <th>姓名</th>
		      <th>性别</th>
		      <th>学历</th>
		      <th>操作</th>
		    </tr>
		  </thead>
		  <tbody>
		    <tr ng-repeat="user in users">
		      <td>
		        <button class="btn" ng-click="editUser(user.id)">
		          <a href="modify.html">编辑</a>
		        </button>
		      </td>
		      <td>{{ user.username }}</td>
		      <td>{{ user.sex }}</td>
		      <td>{{ user.edution }}</td>
		      <td>
		        <button class="btn" ng-click="editUser(user.id)">
		          <a href="#">删除</a>
		        </button>
		        <button class="btn" ng-click="editUser(user.id)">
		          <a href="details.html">详情</a>
		        </button>
		      </td>
		    </tr>
		  </tbody>
		  <tfoot></tfoot>
		</table>

<hr>
<button class="btn btn-success" ng-click="editUser('new')">
<a href="add.html">创建新用户</a>
</button>
<hr>

</div>

<script src="../js/myuser.js"></script>

</body> 
</html>  