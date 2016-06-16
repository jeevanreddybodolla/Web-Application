<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>Add Product Category</title>
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
  

		
		<h2 style="color: SteelBlue;text-align: center;">Your Amazon!</h2>
		

			<div class="navbar">
             <div class="navbar-inner" style="background: Snow">
                <div class="container">
                  <ul class="nav">
                    <li class="active">
                  
                    <li><a href="createProductAdmin.htm">Create Product Admin</a></li>
                    <li><a href="addProductCatg.htm">Add Product Category</a></li>
                  </ul>
                  <ul class="nav pull-right">
      				<li><a href="logout.htm" style="font-style: italic;color: green;" >Logout</a></li>
      			  </ul>
                </div>
              </div>
            </div>
         	
         <div class="body">
         <div class="hero-unit">   
    			
    	  <legend>Create Category</legend>
	      <form class="form-horizontal" method="post" action="productCategory.htm">
	      
           <div class="control-group">	
           <label class="control-label">Product Category</label>	
            <div class="controls">	
                <div class="input-prepend">
                    <input type="text" class="input-xlarge" name="productCatg" placeholder="Product Category" required/>
            	    </div>
    	        </div>
        	</div>  	
        	
        	<div class="control-group">	
    		<div class="controls">	
    		 <button class="btn btn-primary" type="submit">ADD</button>
			</div>
				</div>    
  	</div>
       			</div>
            
</body>
</html>