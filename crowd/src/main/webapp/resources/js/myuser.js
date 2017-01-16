var app = angular.module("myApp", ['ngResource']);



app.controller('userCtrl', ['$scope','$resource', function($scope,$resource) {

$scope.users = [
{id:1, username:'Hege', sex:"男", edution: '本科' },
{id:2, username:'Kim',  sex:"女", edution: '本科' },
{id:3, username:'Sal',  sex:"女", edution: '硕士' },
{id:4, username:'Jack', sex:"男", edution: '本科' },
{id:5, username:'John', sex:"男", edution: '本科' },
{id:6, username:'Peter',sex:"男", edution: '本科' }
];


$scope.edutionMap = [
                {edutionName : "高中", edutionCode : 0},
                {edutionName : "大专", edutionCode : 1},
                {edutionName : "本科", edutionCode : 2},
                {edutionName : "硕士", edutionCode : 3},
                {edutionName : "博士", edutionCode : 4}
            ];



$scope.username = '';

$scope.edit = true;

$scope.opChange = function(){//选择下拉框时查看控制台输出
	console.log($scope.selectedEdution.edutionCode);
}
for(var i in $scope.edutionMap){
    if($scope.edutionMap[i].edutionCode==2){//将edutionCode是2的设为选中项.
    	$scope.selectedEdution=$scope.edutionMap[i];
        break;
    }
}


$scope.usersInfo = 
                { 'userName':'',
                'sex':'1',
                'age':'12',
                'edution':'2',
                'authentication':'1'}
                
	$scope.saveUserInfo = function(){
		// 创建一个resource对象
		var UserInfo = $resource('/system/save');
		
		// 调用save方法
		//(其实和我们$http.post(url,data).success(function(){})是一样一样的，只是它封装一下而已)
		 var data={
                 userName:$scope.usersInfo.userName,sex:$scope.usersInfo.sex,edution:$scope.selectedEdution.edutionCode,authentication:$scope.usersInfo.authentication
             };
		
		UserInfo.save(data, function(response){
            console.log(response);
        });

		
	}




} ]);


