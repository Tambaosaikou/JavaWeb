package net.jxvtc.cart.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.jxvtc.cart.pojo.Book;

public class CartServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		if (session == null) {
			out.println("购物车为空");
		} 
		else {
			Object obj = session.getAttribute("cart");
			if (obj == null) {
				out.println("购物车为空");
			} 
			else {
				List<Book> books = (List<Book>) obj;
				for (Book book : books) {
					out.printf("%s  <br/>", book.getName());
				}
			}
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
