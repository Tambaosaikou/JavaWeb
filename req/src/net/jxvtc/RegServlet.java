package net.jxvtc;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

<<<<<<< HEAD
/**
 * Servlet implementation class Demo1Servlet
 */
@WebServlet("/reg")
public class RegServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String username=request.getParameter("username");
		String pwd=request.getParameter("pwd");
		String[] hobbys = request.getParameterValues("hobby");
		System.out.println(username+":"+pwd);
		
		System.out.println(Arrays.asList(hobbys));
	}

	
=======
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

@WebServlet("/reg")
public class RegServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String[] hobbys = request.getParameterValues("hobby");
		System.out.println(username+":"+password);
		System.out.println(Arrays.asList(hobbys));
	}
>>>>>>> a695c9cea1234860975bd084b1cc4c5ac24c793b
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
