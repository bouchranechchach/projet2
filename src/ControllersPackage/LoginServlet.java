package ControllersPackage;
import ModelsPackage.ClientClass; 
import DatabasePackage.LoginDB; 

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
				String name= request.getParameter("username");
				String pass= request.getParameter("pass");
		
				ClientClass client =LoginDB.validate(name,pass);
				
				if( client != null){ 
						 HttpSession session = request.getSession( true );
						 
							session.setAttribute( "pass",pass );
							session.setAttribute("username", client.getNomClient());
					        response.sendRedirect("home.jsp");  
					          
					    }  
				  
				     else{  
				    	 
				    	 HttpSession session = request.getSession( true );
				    	 
						  session.setAttribute( "errorlog","Mot de passe incorrecte !");
					        response.sendRedirect("loginform.jsp"); 
					  
				     } 
				
	
	}


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
