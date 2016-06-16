<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>Shopping Cart</title>
    <meta charset= "utf-8">
    <link  rel="stylesheet" type="text/css"  href="resources/css/bootstrap.css" >
    <link  rel="stylesheet" type="text/css"  href="resources/css/css.css" >  
  </head>
  <style> 
  </style>
  
  <body>
 	 <script>
  function Back() {
    window.history.back();
}
 	</script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
    <script src="resources/js/jqBootstrapValidation.js"></script>	
	
  	<script>
  		$(function () { $("input,select,textarea").not("[type=submit]").jqBootstrapValidation(); } );

  		$(document).ready( function () {
  		  var table = $('#prodTable').DataTable();
  		} );

  			
	</script>
  

		
		<h2 style="color: SteelBlue ">Your Amazon.com!</h2>
		<div align="right" style="font-style: italic;color: #C00000; ">
		  <p>Welcome <c:out value="${userName}"/></p>
		</div>
		
		<div class="navbar">
              <div class="navbar-inner">
                <div class="container">
                  <ul class="nav">
                    <li class="active">
                    </ul>
                  <ul class="nav pull-right">
      				<li><a href="logout.htm" style="font-style: italic;color: green;" >Logout</a></li>
      			  </ul>
                </div>
              </div>
            </div>
         	
         	<div class="body">
     <div class="row">
         <div class="span2">
             	<ul class="nav nav-list">
    </ul>
         </div> 
         
         	
      		<div class="hero-unit">   
    		<div class="content">
      		<div class="row">
			<form class="form-horizontal" method="post" action="orderProceed.htm">
			
			<table id="prodTable" class="display" width="100%" border="1">
				<thead>
					<tr>
						
						<th>Product ID</th>
						<th>Product Name</th>
						<th>Price</th>
						
					</tr>
				</thead>
					<tbody style="text-align: center;">
			 	<c:forEach var="item" items="${cartlist}">
					<tr>
						<td><a href="" name="orderProd" value="${item.productId}"></a>${item.productId}</td>
						<td>${item.productName}</td>
						<td>${item.productPrice}</td>
						<%
					//	float totalPrice= item.productPrice;
					//		session.setAttribute("totalPrice", totalPrice);
					//		System.out.println("This is total price" + totalPrice);
						%>
					</tr>
					</c:forEach>
					</tbody>
				</table><br/>
			    <div style="text-align: center">
			    <button onclick="Back()" class="btn btn-default" style="float: left">Back</button>
    			<button class="btn btn-primary" type="submit">Proceed To Order>></button>
    			</div>
    			</form>
    			</div> 
				</div>
				</div>		
			</div>
		</div>
  	
</body>
</html>
         
         
         
         
         
</body>
</html>