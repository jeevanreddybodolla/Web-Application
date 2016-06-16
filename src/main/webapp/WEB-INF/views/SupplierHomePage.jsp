<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>Amazon.com</title>
    <meta charset= "utf-8">
    <!-- Bootstrap -->
    <link  rel="stylesheet" type="text/css"  href="resources/css/bootstrap.css" >
 
  </head>
  
  <body>
 	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
    <script src="resources/js/jqBootstrapValidation.js"></script>	
  
  	<script>
  		$(function () { $("input,select,textarea").not("[type=submit]").jqBootstrapValidation(); } );
	</script>
  

		
		<h1><a href="#">Your Amazon.com!</a></h1>
		<div align="right" style="font-style: italic;color: #C00000; ">
		  <p>Welcome <c:out value="${userName}"/></p>
		</div>
		

		<div class="navbar" >
              <div class="navbar-inner" style="background: Snow">
                <div class="container">
                  <ul class="nav">
                   <li class="active">
                    <a href="productsPage.htm">Create Products</a></li>
                   
                  </ul>
                  <ul class="nav pull-right">
      				<li><a href="logout.htm" style="font-style: italic;color: green;" >Logout</a></li>
      			  </ul>
                </div>
              </div>
            </div>
         	
         	
      		<div class="hero-unit">   
    		<div class="content">
      		<div class="row">
        	<div class="login-form">
           <legend>Menu</legend>
           
           <h4><a href="productsPage.htm">Create Product</a></h4>
          			
           
           </div>
  				</div>
  			</div>
 		 </div>
  
	
</body>
</html>