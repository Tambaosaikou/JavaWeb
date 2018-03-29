package net.jxvtc.cart.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.jxvtc.cart.dao.BookDB;
import net.jxvtc.cart.pojo.Book;

public class PhrchaseServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		if(id == null||id.equals(""))
		{
			resp.sendRedirect("list");
			return;
		}
		Book book = BookDB.findById(id);
		if(book == null)
		{
			resp.sendRedirect("list");
			return;
		}
		
		
		List<Book> books = null;
		HttpSession session = req.getSession();
		Object obj = session.getAttribute("cart");
		if(obj == null)
		{
			books = new ArrayList<Book>();
			session.setAttribute("cart", books);
		}
		else
		{
			books = (List<Book>)obj;
			books.add(book);
		}
		
		
		resp.sendRedirect("cart");
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}

}
