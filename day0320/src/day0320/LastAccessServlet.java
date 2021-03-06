package day0320;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LastAccessServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html;charset=utf-8");
	String lastAccessTime = null;
	Cookie[] cookies = req.getCookies();
	for(int i = 0;cookies !=null && i<cookies.length; i++) {
		if("lastAccess".equals(cookies[i].getName())) {
			lastAccessTime = cookies[i].getValue();
			break;
		}
	}
	if(lastAccessTime == null) {
		resp.getWriter().print("您是首次访问本站！");
	}
	else {
		resp.getWriter().print("您上次的访问时间是： "+ lastAccessTime);
	}
	String currentTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
	Cookie cookie = new Cookie("lastAccess",currentTime);
	resp.addCookie(cookie);
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
}