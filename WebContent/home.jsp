<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html>
<head>
  <meta charset="UTF-8">
  <title>Welcome to AppCrédit!</title>
 <link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css'>
<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css'>
<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,200,300,700'>
<link rel="stylesheet" href="css/stylehome.css">




</head>

<body>
<!-- partial:index.partial.html -->
<div class="container"> 
<section id="fancyTabWidget" class="tabs t-tabs">
        <ul class="nav nav-tabs fancyTabs" role="tablist">
        
                    <li class="tab fancyTab active">
                    <div class="arrow-down"><div class="arrow-down-inner"></div></div>	
                        <a id="tab0" href="#tabBody0" role="tab" aria-controls="tabBody0" aria-selected="true" data-toggle="tab" tabindex="0">
                       
						<i class="fa fa-calendar" aria-hidden="true"></i>
						
                         <span class="hidden-xs">ANNUITE</span></a>
                    	<div class="whiteBlock"></div>
                    </li>
                    
                    <li class="tab fancyTab">
                    <div class="arrow-down"><div class="arrow-down-inner"></div></div>
                        <a id="tab1" href="#tabBody1" role="tab" aria-controls="tabBody1" aria-selected="true" data-toggle="tab" tabindex="0">
                        
                        <i class="fa fa-clock-o" aria-hidden="true"></i>
                        <span class="hidden-xs">DUREE</span></a>
                        <div class="whiteBlock"></div>
                    </li>
                    
                    <li class="tab fancyTab">
                    <div class="arrow-down"><div class="arrow-down-inner"></div></div>
                        <a id="tab2" href="#tabBody2" role="tab" aria-controls="tabBody2" aria-selected="true" data-toggle="tab" tabindex="0">
                        <i class="fa fa-percent" aria-hidden="true"></i>
                        <span class="hidden-xs">CAPITAL</span></a>
                        <div class="whiteBlock"></div>
                    </li>
                    
                    <li class="tab fancyTab">
                    <div class="arrow-down"><div class="arrow-down-inner"></div></div>
                        <a id="tab3" href="#tabBody3" role="tab" aria-controls="tabBody3" aria-selected="true" data-toggle="tab" tabindex="0">
                       <i class="fa fa-money" aria-hidden="true"></i>
                       <span class="hidden-xs">CREDIT</span></a>
                        <div class="whiteBlock"></div>
                    </li> 
                         
                   
                   
        </ul>
        <div id="myTabContent" class="tab-content fancyTabContent" aria-live="polite">
                    <div class="tab-pane  fade active in" id="tabBody0" role="tabpanel" aria-labelledby="tab0" aria-hidden="false" tabindex="0">
                        <div>
                        	<div class="row">
                            	
                                <div class="col-md-12">
                        			<%@ include file="annuite.jsp" %>
                                </div>
                                
                            </div>
                        </div>
                    </div>
                    <div class="tab-pane  fade" id="tabBody1" role="tabpanel" aria-labelledby="tab1" aria-hidden="true" tabindex="0">
                        <div class="row">
                            	
                                <div class="col-md-12">
									<%@ include file="duree.jsp" %>                                   
                                </div>
                        </div>
                    </div>
                    <div class="tab-pane  fade" id="tabBody2" role="tabpanel" aria-labelledby="tab2" aria-hidden="true" tabindex="0">
                        <div class="row">
                                <div class="col-md-12">
									<%@ include file="capital.jsp" %>                                  
                                </div>
                            </div>
                    </div>
                    <div class="tab-pane  fade" id="tabBody3" role="tabpanel" aria-labelledby="tab3" aria-hidden="true" tabindex="0">
                    <div class="row">
                        <div class="col-md-12">
                        <%@ include file="credit.jsp" %>
                                </div>
                            </div>
                    </div>
                    
                  
                    
                    
                
        </div>

    </section>
</div>
<!-- partial -->
  <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script><script  src="scripthome.js"></script>

</body>
</html>
    