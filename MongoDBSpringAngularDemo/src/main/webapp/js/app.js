angular.module('bookInventory', []).
controller('bookController', function ($scope, $http) {
	
	
		//get all tasks and display initially
	$http.get("http://localhost:8080/MongoDBSpringAngularDemo/rest/books").success(function(response) {
        $scope.books = response;
	 });
	
	//add a new task
	$scope.submit = function(data){
		var data = "http://localhost:8080/MongoDBSpringAngularDemo/rest/addbook/"+data.bookID+"/"+data.book_name+"/"+data.book_author+"/"+data.book_price;
		$scope.test= data;
		$http.post(data).success(function (data, status, headers, config) {$scope.tasks = data;	
		 $scope.bookID="";
		 $scope.book_name="";
		 $scope.book_author="";
		 $scope.book_price="";
		 $scope.toggle='!toggle';
             });    
	};
		

	
});

// Angularjs Directive for confirm dialog box
