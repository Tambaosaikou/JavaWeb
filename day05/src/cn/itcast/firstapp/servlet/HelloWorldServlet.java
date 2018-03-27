package cn.itcast.firstapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloWorldServlet extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response)  throws ServletException, IOException {
PrintWriter out = response.getWriter();
out.println("Hello World!");

	}
	@Override
	public void init(ServletConfig config) throws ServletException{
		System.out.println("Servlet³õÊ¼»¯");
	}
	
	@Override
	public void destroy() {
		System.out.println("Ïú»ÙServlet");
	}

}
