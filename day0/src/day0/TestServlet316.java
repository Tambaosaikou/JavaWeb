package day0;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import org.apache.jasper.tagplugins.jstl.Util;

public class TestServlet316 extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//PrintWriter out=resp.getWriter();
	//ServletContext ctx=this.getServletContext();
	//String data=(String) ctx.getAttribute("data");
	
	//out.print(data);
	resp.setHeader("Refresh", "3");
	resp.getWriter().println(new java.util.Date());
}


}
