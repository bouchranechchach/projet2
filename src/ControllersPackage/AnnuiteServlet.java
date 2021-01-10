package ControllersPackage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import WebServicePackage.ServiceClassStub;
import WebServicePackage.ServiceClassStub.CalculAnnuite;
import WebServicePackage.ServiceClassStub.CalculAnnuiteResponse;


public class AnnuiteServlet extends HttpServlet{
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
		int duree= Integer.parseInt(req.getParameter("duree"));
		
		
		
		
		
		req.setAttribute("capatt",capital );
		req.setAttribute("tauxatt",taux );
		req.setAttribute("dureeatt", duree);
		
		//session creation
		HttpSession sess= req.getSession();
		
		sess.setAttribute("capitalatt", capital);
		sess.setAttribute("tauxatt", taux);
		sess.setAttribute("dureeatt", duree);
		
		
		//consommation du webService
		
		ServiceClassStub clt = new ServiceClassStub();
		
		CalculAnnuite annuite = new CalculAnnuite();
		annuite.setCap(capital);
		annuite.setTi(taux);
		annuite.setDuree(duree);
		
		
		
		CalculAnnuiteResponse reponse = clt.calculAnnuite(annuite);
		double a = reponse.get_return();
		
		sess.setAttribute("Annuité", a);
	
		
		this.getServletContext().getRequestDispatcher("/annuite.jsp").forward(req, resp);
	}
	

}
