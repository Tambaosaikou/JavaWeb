package cn.itcast.servlet;

import java.io.IOException;
import java.io.PrintWriter;

<<<<<<< HEAD
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
=======
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
>>>>>>> a695c9cea1234860975bd084b1cc4c5ac24c793b
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet01
 */
<<<<<<< HEAD
=======
@WebServlet("/TestServlet01")
>>>>>>> a695c9cea1234860975bd084b1cc4c5ac24c793b
public class TestServlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD
		// TODO Auto-generated method stub
		ServletConfig config=this.getServletConfig();
		String value=config.getInitParameter("encoding");
		PrintWriter out=response.getWriter();
		out.println("encoding="+value);
		
		
=======
		this.doPost(request, response);
>>>>>>> a695c9cea1234860975bd084b1cc4c5ac24c793b
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD
		// TODO Auto-generated method stub
		this.doGet(request, response);
		
	
=======
PrintWriter out = response.getWriter();
out.print("this servlet is created by eclipse.");
>>>>>>> a695c9cea1234860975bd084b1cc4c5ac24c793b
	}

}
