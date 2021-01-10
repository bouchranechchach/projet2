package ControllersPackage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import WebServicePackage.ServiceClassStub;
import WebServicePackage.ServiceClassStub.CalculDuree;
import WebServicePackage.ServiceClassStub.CalculDureeResponse;


public class DureeServlet extends HttpServlet{
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
		double capital = Double.parseDouble(req.getParameter("cap"));
		double taux= Double.parseDouble(req.getParameter("taux"));
		int annuite= Integer.parseInt(req.getParameter("annuite"));
		
		

		
		req.setAttribute("capatt",capital );
		req.setAttribute("tauxatt",taux );
		req.setAttribute("annuiteatt",annuite);
		
		//session creation
		HttpSession sess= req.getSession();
		
		sess.setAttribute("capitalatt", capital);
		sess.setAttribute("tauxatt", taux);
		sess.setAttribute("annuiteatt", annuite);
		
		
		//consommation du webService
		
		ServiceClassStub clt = new ServiceClassStub();
		
		CalculDuree duree = new CalculDuree();
		duree.setCap(capital);
		duree.setTi(taux);
		duree.setAnn(annuite);
		
		
		CalculDureeResponse reponse = clt.calculDuree(duree);
		double d = reponse.get_return();
		
		sess.setAttribute("Durée", d);
		
		this.getServletContext().getRequestDispatcher("/duree.jsp").forward(req, resp);
	}
	

}
