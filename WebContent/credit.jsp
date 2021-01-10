<%@page import="ModelsPackage.CreditClass"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>CodePen - Flat Table</title>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.min.js" type="text/javascript"></script>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
<link rel="stylesheet" href="css/style.css">

</head>
<body>
<!-- partial:index.partial.html -->
<form method="post" action="CreditSerlvlet">
<table class="flat-table">
  <tbody>
<tr>
				<th>NumClient</th>
				<th>NumCreditT</th>
				<th>Montant credit</th>
				<th>duree</th>
				<th>Taux</th>
				<th>Annuite</th>
				<th>Date credit</th>
 </tr>
                                         <%
											if (session.getAttribute("allCredits") != null) {
												List<CreditClass> l = (List<CreditClass>)session.getAttribute("allCredits");
												for(CreditClass c : l){
											%>		
											<tr>
												<td ><%=c.getNumClient() %></td>
												<td ><%=c.getNumCredit() %></td>
												<td ><%=c.getMonCredit() %> </td>
												<td ><%=c.getAnnuiteCredit() %> </td>
												<td ><%=c.getDureeCredit() %></td>
												<td><%=c.getTauxCredit() %></td>
												<td ><%=c.getDatPre() %></td>
												
											</tr>
						
											<%
												}
											}
											
											%>
													
											         
                                        </tbody>
                                    </table>
             
 
    

<!-- partial -->
  <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
  </form>
</body>
</html>
    