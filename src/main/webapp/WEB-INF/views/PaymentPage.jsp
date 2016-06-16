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
         
         
         	<div class="span10">	
      		<div class="hero-unit" style="width:980px;">   
    		<div class="content">
      		<div class="row">
      		<!-- a href="viewInvoice.pdf" >View Invoice</a>  -->
      		
      		<legend>Payment Options</legend>
			<form class="form-horizontal" method="post" action="paymentProceed.htm">
			
			<h4 style="color: BlueViolet  ">Total Order Amount: ${orderDetails.orderPrice}</h4>

        <div class="control-group">	
           <label class="control-label">CardHolder Name</label>	
            <div class="controls">	
                <div class="input-prepend">
                    <input type="text" class="input-xlarge" name="cardHolderName" placeholder="CardHolder Name" required/>
            	    </div>
    	        </div>
        	</div>
            
            
            <div class="control-group">	
           <label class="control-label">Card Number</label>	
            <div class="controls">	
                <div class="input-prepend">
                    <input type="number" max-length=10 class="input-xlarge" name="cardNumber" placeholder="CardNumber" required/>
            	    </div>
    	        </div>
        	</div>
        	
        	
        	
        	<div class="control-group">	
           <label class="control-label">Passcode</label>	
            <div class="controls">	
                <div class="input-prepend">
                    <input type="number" style="width: 75px"  max-length=4  name="passcode" placeholder="Passcode" required/>
            	    </div>
    	        </div>
        	</div>
    	<div class="control-group">	
    	<div style="text-align: center">
			    <button onclick="Back()" class="btn btn-default" style="float: left">Back</button>
    			<button class="btn btn-primary" type="submit">Make Payment</button>
    			</div>
    	
    	</div>
    	
    		</form>
  			</div>
			
					</div>
					</div>
					</div>
					</div>
					</div>		
		
</body>
</html>
         