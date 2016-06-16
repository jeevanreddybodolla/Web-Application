<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>Create Products</title>
    <meta charset= "utf-8">
    <!-- Bootstrap -->
    <link  rel="stylesheet" type="text/css"  href="resources/css/bootstrap.css" >
 <link  rel="stylesheet" type="text/css"  href="resources/css/css.css" >
  </head>
  
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
	</script>
	
  		<h2 style="color: SteelBlue ">Your Amazon.com!</h2>
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
         	
         <div class="body">
         <div class="hero-unit">   
    			
    			<legend>Create Products</legend>
	      <form class="form-horizontal" method="post" action="createProducts.htm">
	      
                 <div class="control-group">	
           <label class="control-label">Product Name</label>	
            <div class="controls">	
                <div class="input-prepend">
                    <input type="text" class="input-xlarge" name="productName" placeholder="ProductName" required/>
            	    </div>
    	        </div>
        	</div>
        	
        	<div class="control-group">	
        		<label class="control-label">Product Category</label>
            	<div class="controls">	
            	<select name="productCategory">
            	<option>Select Category>></option>
            	<c:forEach var="item" items="${categoryList}" >
            		<option value="${item.categoryName}">${item.categoryName}</option>
            	</c:forEach>
				</select>
            </div>
            </div>
            
            
            <div class="control-group">	
           <label class="control-label">Price</label>	
            <div class="controls">	
                <div class="input-prepend">
                    <input type="number"  data-validation-number-message="Must be NumericalValue" class="input-xlarge" name="productPrice" placeholder="Price" required/>
            	    </div>
    	        </div>
        	</div>
        	
        	<div class="control-group">	
           <label class="control-label">Quantity</label>	
            <div class="controls">	
                <div class="input-prepend">
                    <input type="number" data-validation-number-message="Must be NumericalValue" class="input-xlarge" name="productQuantity" placeholder="Quantity" required/>
            	    </div>
    	        </div>
        	</div>
        	
        	<div class="control-group">	
           <label class="control-label">Product Description</label>	
            <div class="controls">	
                <div class="input-prepend">
                    <input type="text" class="input-xlarge" name="productDescrip" placeholder="Description" required/>
            	    </div>
    	        </div>
        	</div>
    	
    	<div class="control-group">	
    	
    	<button onclick="Back()" class="btn btn-default" style="margin-right: 100px;">Back</button>
    	<button class="btn btn-primary" type="submit">Create>></button>
    	    	</div>
  	</div>
     </div>       
            
</body>
</html>