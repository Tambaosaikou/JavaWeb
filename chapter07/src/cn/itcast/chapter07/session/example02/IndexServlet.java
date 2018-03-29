package cn.itcast.chapter07.session.example02;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/IndexServlet")
public class IndexServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		HttpSession session = request.getSession();
		User user=(User) session.getAttribute("user");
		if(user==null) {
			response.getWriter().print(
					"����û�е�½����<a href='/chapter07/login.html'>��¼</a>");
		}
		else
		{
			response.getWriter().print(
					"���ѵ�¼����ӭ�㣬"+user.getUsername()+"!");
			response.getWriter().print(
					"<a href='/chapter07/LogoutServlet'>�˳�</a>");
			Cookie cookie=new Cookie("JSESSIONID", session.getId());
			cookie.setMaxAge(60*30);
			cookie.setPath("/chapter07");
			response.addCookie(cookie);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
