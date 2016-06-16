<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>Customer Home Page</title>
    <meta charset= "utf-8">
    <link  rel="stylesheet" type="text/css"  href="resources/css/bootstrap.css" >
    <link href="//datatables.net/download/build/nightly/jquery.dataTables.css" rel="stylesheet" type="text/css" />   
    <link  rel="stylesheet" type="text/css"  href="resources/css/css.css" > 
  </head>
  <style> 
  </style>
  
  <body>
 	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
    <script src="resources/js/jqBootstrapValidation.js"></script>	
    <script src="//datatables.net/download/build/nightly/jquery.dataTables.js"></script>
  
  	<script>
  		$(function () { $("input,select,textarea").not("[type=submit]").jqBootstrapValidation(); } );

  		$(document).ready( function () {
  		  var table = $('#prodTable').DataTable();
  		} );
  		
  		function submit(){
  			var checkCount = $("input[name='cartProducts']:checked").length;
  			if(checkCount == 0)
  			{
  			   alert("Select one product to go cart");
  			   return ;
  			}
  			
  			if(checkCount>0){
  				document.forms[0].action = 'addToCart.htm'
  				document.forms[0].submit();
  			}
  				
  		}

	</script>
  

		<div class="container">
		<h2 style="color: SteelBlue ">Your Amazon.com!</h2>
		<div align="right" style="font-style: italic;color: #C00000; ">
		  <p>Welcome <c:out value="${userName}"/></p>
		</div>
		
		<div class="navbar">
              <div class="navbar-inner">
                <div class="container">
                  <ul class="nav">
                    <li class="active">
                    <li><a href="usersProfile.vm">Your Profile</a></li>
                   </ul>
                  <ul class="nav pull-right">
      				<li><a href="logout.htm" style="font-style: italic;color: green;" >Logout</a></li>
      			  </ul>
                </div>
              </div>
            </div>
         	
     <div class="row">
         <div class="span2">
             	<ul class="nav nav-list">
   </ul>
         </div> 
         
         
         
      		<div class="hero-unit">   
    		<div class="content">
      		<div class="row">
			<form class="form-horizontal" name="addCart" method="post" action="javascript:submit()">
			<table id="prodTable" class="display" width="100%">
				<thead>
					<tr>
						<th>Select</th>
						<th>Product ID</th>
						<th>Product Name</th>
						<th>$Price</th>
					</tr>
				</thead>
					<tbody>
					<c:forEach var="item" items="${prodList}">
					<tr>
						<td><input type="checkbox" name="cartProducts" value="${item.productId}"></td>
						<td>${item.productId}</td>
						<td>${item.productName}</td>
						<td>${item.productPrice}</td>
            	   				</td>
            	   	</tr>
					</c:forEach>
					</tbody>
				</table>
				<div class="control-group">	
    		<div class="controls">			
        	<button class="btn btn-primary" type="submit">ADD To Cart>></button>
			</div>
				</div> 
				</form>
				</div>
				</div>		
				</div>
			</div>
		</div>
	
  	
</body>
</html>