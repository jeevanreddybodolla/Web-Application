<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Amazon:Login Page</title>
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
		<h2 style="color: SteelBlue;text-align: center; ">Amazon!</h2>
		

		<div class="navbar">
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
         <div class="hero-unit" >   
    	<div class="content">
      	<div class="row">
        <div class="login-form">
           <legend>Login</legend>
          <form action="userlogin.htm" method="post" class="form-horizantal">
            <fieldset>
              	<div class="control-group">
              	<div class="controls">
                <div class="input-prepend">
                <span class="add-on"><i class="icon-user"></i></span>
                <input type="text" name="username" placeholder="UserName" minlength="4" data-validation-minlength-message="Must have 4 Characters" required>
              </div>
              </div>
              </div>
          
              <div class="control-group">
              <div class="controls">
              <div class="input-prepend">
                <span class="add-on"><i class="icon-lock"></i></span>
                <input type="password" name="password" minlength="5" data-validation-minlength-message="Must have 5 Characters" placeholder="Password"  required>
              </div>
              </div>
              </div>     
              <button class="btn btn-primary" type="submit">Sign in</button>
            </fieldset>
            <a href="userRegister.htm" style="margin-top:10px;">New User? Register Here</a>
            
          </form>
        </div>
      </div>
    </div>
  </div>
  </div>
            
            
</body>
</html>