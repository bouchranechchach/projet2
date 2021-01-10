package ControllersPackage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import DatabasePackage.ClassMethod;
import ModelsPackage.ClientClass;

/**
 * Servlet implementation class RegisterServlet
 */

public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
			        response.sendRedirect("loginform.jsp"); 
			
   }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		String nom= request.getParameter("nom");
		String prenom= request.getParameter("prenom");
		String adresse= request.getParameter("adresse");
		String ville= request.getParameter("ville");
		String tel= request.getParameter("tel");
		String email= request.getParameter("email");
		String password= request.getParameter("password");
	
		ClientClass client = new ClientClass();
		 
		  client.setNomClient(nom);
		  client.setPreCli(prenom);
		  client.setAdrCli(adresse);
		  client.setVilClient(ville);
		  client.setTelCli(tel);
		  client.setMailClient(email);
		  client.setPassCli(password);
		  
		 try {
	        
			  int res =ClassMethod.inserer(client) ;
			  
			 if(res==0) {
				  HttpSession session = request.getSession( true );
				  session.setAttribute( "error","Client exist!" );
				  response.sendRedirect("loginform.jsp"); 
			  }
			  
			  else {
				 
				  HttpSession session = request.getSession( true );
				  session.setAttribute( "valid","enregistré" );
				  System.out.println("enregistré");
				  response.sendRedirect("home.jsp");}
			  
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	            
	        }	    }}
