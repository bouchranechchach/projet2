package ControllersPackage;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import WebServicePackage.ServiceClassStub;

import WebServicePackage.ServiceClassStub.CalculCapital;
import WebServicePackage.ServiceClassStub.CalculCapitalResponse;


public class CapitalServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/home.jsp").forward(req, resp);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		double annuite = Double.parseDouble(req.getParameter("annuite"));
		double taux= Double.parseDouble(req.getParameter("taux"));
		int duree= Integer.parseInt(req.getParameter("duree"));
		
		

		
		req.setAttribute("annuiteatt",annuite );
		req.setAttribute("tauxatt",taux );
		req.setAttribute("dureeatt", duree);
		
		//session creation
		HttpSession sess= req.getSession();
		
		sess.setAttribute("annuiteatt", annuite);
		sess.setAttribute("tauxatt", taux);
		sess.setAttribute("dureeatt", duree);
		
		
		//consommation du webService
		
		ServiceClassStub clt = new ServiceClassStub();
		
		CalculCapital capital = new CalculCapital();
		capital.setAnn(annuite);
		capital.setTi(taux);
		capital.setDuree(duree);
		
		
		
		CalculCapitalResponse reponse = clt.calculCapital(capital);
		double c = reponse.get_return();
		
		sess.setAttribute("Capital", c);
		
		this.getServletContext().getRequestDispatcher("/capital.jsp").forward(req, resp);
	}
	

}
