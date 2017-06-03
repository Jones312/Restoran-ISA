package Restorani.servleti;


import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;

import org.apache.openejb.server.httpd.HttpRequest;
import org.apache.openejb.server.httpd.HttpResponse;


import com.fasterxml.jackson.databind.ObjectMapper;

import Restorani.Model.Employee;
import Restorani.dao.EmployeesDAO;

public class EmployeesLoginServlet {
	
	@EJB
	private EmployeesDAO employeeDao;
	private String failurePage;
	private String successPage;
	private ServletContext ctx;
	  
	  public void init(ServletConfig cfg) throws ServletException {
	    failurePage = cfg.getInitParameter("failure-page");
	    if (failurePage == null)
	      throw new ServletException(
	          "LoginServlet: missing init parameter 'failure-page'");
	    successPage = cfg.getInitParameter("success-page");
	    if (successPage == null)
	      throw new ServletException(
	          "LoginServlet: missing init parameter 'success-page'");
	    ctx = cfg.getServletContext();
	  }
	
	public void service(HttpRequest request, HttpResponse response){
		response.setContentType("application/json");
		ObjectMapper om = new ObjectMapper();
		
		HttpSession session = request.getSession();
		Employee loggedInEmployee = (Employee) session.getAttribute("employee");
		String email = loggedInEmployee.getEmail();
		String password = loggedInEmployee.getPassword();
		 if (email == null || password == null){
		      try {
				throw new ServletException(
				      "[LoginServlet] Illegal invocation: no username and/or password");
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 Employee e = employeeDao.login(email, password); 
		 if (e == null) {
		    System.out.println("Nema tog zaposlenog!");
		    return;
		 }
		 session = request.getSession(true);
		 session.setAttribute("employee", e);
		    
		 try {
			ctx.getRequestDispatcher(successPage).forward(request, response);
		} catch (ServletException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
