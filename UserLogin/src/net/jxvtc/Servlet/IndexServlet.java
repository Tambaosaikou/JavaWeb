package net.jxvtc.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.jxvtc.Servlet.User;

public class IndexServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("user");
		if(user == null) {
			resp.getWriter().print("����û�е�¼����<a href='/UserLogin/login.html'>��¼</a>");
		}
		else {
			resp.getWriter().print("���ѵ�¼����ӭ�㣬"+user.getUsername()+"!");
			resp.getWriter().print("<a href='/UserLogin/LogoutServlet'>�˳�</a>");
			Cookie cookie = new Cookie("JSESSIONID", session.getId());
			cookie.setMaxAge(60*30);
			cookie.setPath("/UserLogin");
			resp.addCookie(cookie);
		}
	}
	
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	doGet(req,resp);
}

}
