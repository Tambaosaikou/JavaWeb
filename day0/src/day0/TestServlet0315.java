package day0;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet0315 extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	//ServletContext ctx=this.getServletContext();
	//ctx.setAttribute("data", "http://www.jxvtc.net");
	//OutputStream out=resp.getOutputStream();
	//out.write("itcast".getBytes());
	//resp.setCharacterEncoding("utf-8");
	//resp.setHeader("Content-Type", "text/html;charset=utf-8");
	//String data="ÖÐ¹ú";
	//PrintWriter out=resp.getWriter();
	//out.println(data);
	resp.setHeader("Refresh", "2,URL=http://www.itcast.cn");
}
}
