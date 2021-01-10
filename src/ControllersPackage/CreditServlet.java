package ControllersPackage;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import DatabasePackage.*;
import ModelsPackage.CreditClass;

public class CreditServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
		  HttpSession session = request.getSession();
		int	idc = (int) session.getAttribute("NumClient")	;	
		  
		  List<CreditClass> l = ListClient.getlist(idc);
		     int i=0;
		 
		  for(CreditClass c:l) {
	
			  session.setAttribute("credit"+i,c );
	
			  i++;
		  }
		  
		  session.setAttribute("numberof", i);
		  session.setAttribute("listcredit",l);
	
		  response.sendRedirect("credit.jsp");
       
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}