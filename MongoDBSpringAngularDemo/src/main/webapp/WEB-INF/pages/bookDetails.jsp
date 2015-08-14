<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html ng-app="bookInventory">
  <head>
    <meta charset="utf-8">
    <title>Database Table</title>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.26/angular.min.js"></script>
	<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.26/angular-route.min.js"></script>
    <script>
    angular.module('bookInventory', []).
    controller('bookController', function ($scope, $http) {
    	
    	$scope.toggle = function(book) {
            // alert(book.book_name+"\n"+book.book_author+"\n"+book.book_price);
              var a="http://localhost:8080/MongoDBSpringAngularDemo/rest/books/"+book.book_name;
      	        location.href = a;
      	    
      	};
              
    	
    		//get all tasks and display initially
    	$http.get("http://localhost:8080/MongoDBSpringAngularDemo/rest/books").success(function(response) {
            $scope.books = response;
    	 });
    	
    	//add a new task
    	$scope.submit = function(data){
    		var data = "http://localhost:8080/MongoDBSpringAngularDemo/rest/addbook/"+data.bookID+"/"+data.book_name+"/"+data.book_author+"/"+data.book_price;
    		$scope.test= data
    		$http.post(data).success(function (data, status, headers, config) {
                 });    
    	};
    		

    	
    });

    // Angularjs Directive for confirm dialog box
</script>
  </head>
  
  <body>
  <div ng-controller="bookController">
  
    <table>
      <tr>
        <th>Book Name</th>
		<th>Book Author</th>
		<th>Book Price</th>
      </tr>
	  <tr ng-repeat="book in books" >
		
		<td>{{book.book_author}}</td>
		<td>{{book.book_name}}</td>
		<td>{{book.book_name}}</td>
	      </tr>
	      </td>
    </table>
    </div>
  </body>
</html>



