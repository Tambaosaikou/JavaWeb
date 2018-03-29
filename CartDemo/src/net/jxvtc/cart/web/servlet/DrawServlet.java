package net.jxvtc.cart.web.servlet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DrawServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("image/png");
	OutputStream os = resp.getOutputStream();
	BufferedImage image = new BufferedImage(300,300,BufferedImage.TYPE_INT_RGB);
	Graphics g = image.getGraphics();
	g.setColor(Color.blue);
	g.fillRect(0, 0, 300, 300);
	g.setColor(Color.green);
	g.fillRect(301, 0, 500, 500);
	g.setColor(Color.red);
	g.drawOval(50, 50, 100, 100);

	g.setColor(Color.white);
	g.drawString("XCYSB", 100, 100);
	g.dispose();
	ByteArrayOutputStream bos = new ByteArrayOutputStream();
	ImageIO.write(image, "PNG", bos);
	
	byte[] datas = bos.toByteArray();
	resp.setContentLength(datas.length);
	os.write(datas);
	
	bos.close();
}
}
