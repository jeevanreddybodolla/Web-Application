<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Register Here</title>
    <meta charset= "utf-8">
    <!-- Bootstrap -->
    <link  rel="stylesheet" type="text/css"  href="resources/css/bootstrap.css" >
    <link  rel="stylesheet" type="text/css"  href="resources/css/css.css" >
   	
  </head>
<body>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
    <script src="resources/js/jqBootstrapValidation.js"></script>	
  
  	<script>
  		$(function () { $("input,select,textarea").not("[type=submit]").jqBootstrapValidation(); } );
	</script>
    
    
     	
	    <!-- <div class="container"> -->
		<h2 style="color: SteelBlue;text-align: center; ">Your Amazon.com!</h2>
		

		<div class="navbar" >
              <div class="navbar-inner" style="background: Snow">
                <div class="container">
                  <ul class="nav">
                    <li><a href="homepage.htm">Home</a></li>
                    <li><a href="userRegister.htm">Register</a></li>
                    <li><a href="login.htm">Login</a></li>
                     
                  </ul>
                </div>
              </div>
            </div>
    <div class="body">
    
    	<div class="hero-unit">
    	  <legend>Sign Up</legend>
	      <form id="signup" class="form-horizontal" method="post" action="userRegistration.htm">

    	   <div class="control-group">	
           <label class="control-label">First Name</label>	
            <div class="controls">	
                <div class="input-prepend">
                <span class="add-on"><i class="icon-user"></i></span>
                    <input type="text" class="input-xlarge" id="rules" name="fname" placeholder="First Name" required/>
                    
                </div>
            </div>
        </div>
        <div class="control-group ">
            <label class="control-label">Last Name</label>
            <div class="controls">
                <div class="input-prepend">
                <span class="add-on"><i class="icon-user"></i></span>
                    <input type="text" class="input-xlarge" id="rules" name="lname" placeholder="Last Name" required>
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
            <label class="control-label">Mobile</label>
            <div class="controls">
                <div class="input-prepend">
                <span class="add-on"><i class="icon-signal"></i></span>
                    <input type="text" class="input-xlarge"  maxlength="10" id="mobile" name="mobile" placeholder="Mobile" required>
                </div>
            </div>
        </div>

      <div class="control-group">
            <label class="control-label">Gender</label>
      </label>
      <div class="controls">
        <label class="radio">
          <input type="radio" name="sex" id="sex" value="male" checked>
          Male
        </label>
        <label class="radio">
          <input type="radio" name="sex" id="sex" value="female">
          Female
        </label>
		</div>
      
      <div class="control-group">	
           <label class="control-label">Address</label>	
            <div class="controls">	
                <div class="input-prepend">
                <span class="add-on"><i class="icon-home"></i></span>
                    <input type="text" class="input-xlarge" id="address" name="address" placeholder="Address" required>
                </div>
            </div>
        </div>
      
      <div class="control-group">	
           <label class="control-label">City</label>	
            <div class="controls">	
                <div class="input-prepend">
                <span class="add-on"><i class="icon-home"></i></span>
                    <input type="text" class="input-xlarge" id="city" name="city" placeholder="City" required>
                </div>
            </div>
        </div>
        
        <div class="control-group">	
           <label class="control-label">State</label>	
            <div class="controls">	
                <div class="input-prepend">
                <span class="add-on"><i class="icon-home"></i></span>
                    <input type="text" class="input-xlarge" id="State" name="state" placeholder="State" required>
                </div>
            </div>
        </div>

      
      
      <div class="control-group">	
           <label class="control-label">UserName</label>	
            <div class="controls">	
                <div class="input-prepend">
                <span class="add-on"><i class="icon-user"></i></span>
                   <input type="text" name="userName" class="input-xlarge" placeholder="UserName" minlength="4" data-validation-minlength-message="Must have 4 Characters" required>
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
                    <input type="Password" id="conpasswd" class="input-xlarge" data-validation-match-match="password" data-validation-match-message="Password Not Match" name="conpassword" placeholder="Re-enter Password" required>
                </div>
            </div>
        </div>
        <div class="control-group">
        <label class="control-label"></label>
          <div class="controls">
           <button type="submit" class="btn btn-success" >Create My Account</button>
          </div>
    </div>
      </form>
   </div>
    		</div>
    		
    		</div>
    		
    		
</body>
</html>