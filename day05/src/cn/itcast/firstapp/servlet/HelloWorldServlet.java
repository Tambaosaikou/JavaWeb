package cn.itcast.firstapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloWorldServlet extends GenericServlet {
//ÿ����һ��Servlet���͵���һ��
	@Override
	public void service(ServletRequest request,
			ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		System.out.println("Hello World!");
		out.println("Hello World!");
	}
	//��ʼ��Servlet��ִֻ��һ��
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet��ʼ��");
	}
	
	@Override
		public void destroy() {
		System.out.println("����Servlet");
		}

}
