package cn.itcast.chapter05.cookie.example;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LastAccessServlet")
public class LastAccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html;charset=utf-8");
	String lastAccessTime=null;
	Cookie[] cookies=request.getCookies();
	for(int i=0;cookies!=null&&i<cookies.length;i++) {
		if("lastAccess".equals(cookies[i].getName())) {
			lastAccessTime=cookies[i].getValue();
			break;
		}
	}
	if(lastAccessTime==null)
	{
		response.getWriter().print("首次登陆！");
	}
	else
	{
		response.getWriter().print("上次访问时间为："+lastAccessTime);
	}
	String currentTime=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss")
			.format(new Date());
	Cookie cookie=new Cookie("lastAccess",currentTime);
	response.addCookie(cookie);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
