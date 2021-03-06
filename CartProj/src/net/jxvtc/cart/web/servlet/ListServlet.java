package net.jxvtc.cart.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.jxvtc.cart.dao.BookDB;
import net.jxvtc.cart.pojo.Book;

public class ListServlet  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获取所有的图书
		Map<String, Book> books = BookDB.findAll();
		//   书名    <a href="购买链接">放入购物车</a>  <br/>
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out=resp.getWriter();
		Book book=null;
		for(String key:books.keySet())
		{
			book=books.get(key);
	    out.printf("%s  <a href='shop?id=%s'>放入购物车</a><br/>",
	    		book.getName(),book.getId());
		}
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}
	

}
