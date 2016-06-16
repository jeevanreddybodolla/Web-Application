<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>Create Supplier</title>
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
  

		
		<h2 style="color: SteelBlue ">Your Amazon!</h2>
		
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
    		<div class="content">
      		<div class="row">
        	<div class="login-form">
           	<legend>Create Product Admin</legend>
	  		<form id="prodAdminReg" class="form-horizontal" method="post" action="prodAdminRegister.htm">
		      
		     
		     <div class="control-group">	
           <label class="control-label">Supplier Name</label>	
            <div class="controls">	
                <div class="input-prepend">
                <span class="add-on"><i class="icon-user"></i></span>
                    <input type="text" class="input-xlarge" id="rules" name="supplierName" placeholder="Supplier Name" required/>
                    
                </div>
            </div>
        </div> 
		     <div class="control-group">
            <label class="control-label">Email</label>
            <div class="controls">
                <div class="input-prepend">
                <span class="add-on"><i class="icon-envelope"></i></span>
                    <input type="email" data-validation-email-message="Invalid email ID" class="input-xlarge" name="email" placeholder="Email">
                </div>
            </div>
        </div>
        
        <div class="control-group">	
           <label class="control-label">Location</label>	
            <div class="controls">	
                <div class="input-prepend">
                <span class="add-on"><i class="icon-home"></i></span>
                    <input type="text" class="input-xlarge" name="location" placeholder="Location" required>
                </div>
            </div>
        </div>
        
      
    	  <div class="control-group">	
           <label class="control-label">User Name</label>	
            <div class="controls">	
                <div class="input-prepend">
                <span class="add-on"><i class="icon-user"></i></span>
                   <input type="text" name="userName" class="input-xlarge" placeholder="User Name" minlength="4" data-validation-minlength-message="Must have 4 Characters" required>
                </div>
        	    </div>
        	</div>
      
      
       <div class="control-group">
            <label class="control-label">Password</label>
            <div class="controls">
                <div class="input-prepend">
                <span class="add-on"><i class="icon-lock"></i></span>
                    <input type="Password" id="passwd" class="input-xlarge"  minlength="5" data-validation-minlength-message="Must have 5 Characters" name="password" placeholder="Password" required>
                </div>
            </div>
        </div>
        <div class="control-group">
            <label class="control-label">Confirm Password</label>
            <div class="controls">
                <div class="input-prepend">
                <span class="add-on"><i class="icon-lock"></i></span>
                    <input type="Password" id="conpasswd" class="input-xlarge" data-validation-match-match="password" data-validation-match-message="Password Not Match" name="conpassword" placeholder="Confirm Password" required>
                </div>
            </div>
        </div>
        
       <div class="control-group">
               
           <button onclick="Back()" class="btn btn-default" style="margin-right: 100px;">Back</button>
           <button type="submit" class="btn btn-success" >Create Supplier</button>
         
    </div>
      </form>
   </div>
    		</div>
    		
  </div>
	
</body>
</html>