package jetty_example;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.http.HttpStatus;

public class ExampleServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		resp.setHeader("Access-Control-Allow-Origin", "");
	//	resp.setHeader('Access-Control-Allow-Methods', 'PUT, GET, POST, DELETE, OPTIONS');
	//	resp.setHeader('Access-Control-Allow-Headers', "Origin, X-Requested-With, Content-Type, Accept, Authorization");
		//Auth Each API Request created by user.
		//next();
		
		
		//Auth Each API Request created by user.
		resp.setStatus(HttpStatus.OK_200);
		//resp.setContentType("application/json");
		System.out.println("post ta1 response = " + req.getHeaderNames() +  "  PARAMETER VALUE: " +  req.getParameter("x"));
		resp.getWriter().println("{\"id\":457,\"content\":\"Hello, World!\"}");
	//	ParseResource p = new ParseResource();
		
	}
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setStatus(HttpStatus.OK_200);
		resp.setContentType("application/json");
		System.out.println("getting ta1 response = " + req.getRequestURL() +  "  PARAMETER VALUE: " +  req.getParameter("x"));
		resp.getWriter().println("{\"id\":457,\"content\":\"Hello, World!\"}");
	//	ParseResource p = new ParseResource();
		
	}
}
