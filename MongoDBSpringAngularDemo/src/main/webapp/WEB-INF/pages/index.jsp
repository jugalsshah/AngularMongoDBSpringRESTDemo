<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html ng-app="bookInventory">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AngularJS Task Manager</title>
<script src="http://code.angularjs.org/1.2.13/angular.js"></script>
<script>
angular.module('bookInventory', []).
controller('bookController', function ($scope, $http, $window, $location) {
	
	//add a new task
	$scope.submit = function(data){
		var data = "http://localhost:8080/MongoDBSpringAngularDemo/rest/addbook/"+data.bookID+"/"+data.book_name+"/"+data.book_author+"/"+data.book_price;
		$scope.test= data;
		$http.post(data).success(function (data, status, headers, config) {
			alert("book successfully added");
			$window.location.reload();
			
             });    
	};
		

	
});

// Angularjs Directive for confirm dialog box

</script>

</head>

<body ng-controller="bookController">
	
	<a href="http://localhost:8080/MongoDBSpringAngularDemo/rest/books" >
    <button>Show all books</button>
</a>
<form role="form" ng-submit="submit(form)">
	
		Enter Book Details: <br>
		<label>Enter Book Id</label>
  <input placeholder="Enter Book Id" ng-model = "form.bookID" required /> <br>
    <label>Enter Book Name</label>
  <input placeholder="Enter Book Name" ng-model = "form.book_name" required /> <br>
    <label>Enter Book Author</label>
  <input placeholder="Enter Book Author" ng-model = "form.book_author" required /> <br>
    <label>Enter Book Price</label>
  <input placeholder="Enter Book Price" ng-model = "form.book_price" required /> <br>
  <input type="submit" value="add book" />
  
 
  
  	</form>

</body>
</html>
