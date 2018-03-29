package cn.itcast.chapter06.session.example02;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;


@WebServlet("/CheckServlet")
public class CheckServlet extends HttpServlet {
	private static int WIDTH=60;
	private static int HEIGHT=20;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	HttpSession session=request.getSession();
	response.setContentType("image/jpeg");
	ServletOutputStream sos=response.getOutputStream();
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setDateHeader("Expires", 0);
	BufferedImage image=
			new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
	Graphics g=image.getGraphics();
	g.setColor(Color.blue);
	g.fillRect(0, 0, 300, 300);
	g.setColor(Color.red);
	g.fillRect(0, 0, 300, 300);
	g.drawOval(50, 50, 100, 100);
	g.dispose();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
