package cn.itcast.firstapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloWorldServlet extends GenericServlet {
<<<<<<< HEAD
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
=======

	@Override
	public void service(ServletRequest request, ServletResponse response)  throws ServletException, IOException {
PrintWriter out = response.getWriter();
out.println("Hello World!");

	}
	@Override
	public void init(ServletConfig config) throws ServletException{
>>>>>>> a695c9cea1234860975bd084b1cc4c5ac24c793b
		System.out.println("Servlet��ʼ��");
	}
	
	@Override
<<<<<<< HEAD
		public void destroy() {
		System.out.println("����Servlet");
		}
=======
	public void destroy() {
		System.out.println("����Servlet");
	}
>>>>>>> a695c9cea1234860975bd084b1cc4c5ac24c793b

}
