<!DOCTYPE html>
<html>
  <head>
    <title>Shopping Cart</title>
    <meta charset= "utf-8">
    <link  rel="stylesheet" type="text/css"  href="resources/css/bootstrap.css" >  
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
  

		<div class="container">
		<h2 style="color: SteelBlue ">Your Amazon.com!</h2>
		<div align="right" style="font-style: italic;color: #C00000; ">
		  <p>Welcome ${userName}/></p>
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
         	
     <div class="row">
         <div class="span2">
             	<ul class="nav nav-list">
    </ul>
         </div> 
         
         
      		<div class="hero-unit">   
    		<div class="content">
      		<div class="row">
      		<a href="viewInvoice.pdf" >View Invoice</a>
      		
      		
      		<legend>Order Placed Sucessfully</legend>
      		
      		</div>
      		</div>
      		</div>
      		</div>
      		</div>
      		
</body>
</html>