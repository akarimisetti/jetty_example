package jetty_example;

import  org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;


public class jetty_start {
public static void main(String [] args)   throws Exception
{
	Server server = new Server(7070);
	ServletContextHandler handler = new ServletContextHandler(server, "/example");
	handler.addServlet(ExampleServlet.class, "/");
	if( server.isRunning()) server.stop(); 
	server.start();
	
	System.out.println("adf");
}
}
