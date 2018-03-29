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

/**
 * 
 * @author hp
 *  放入购物车
 *   获取查询字符串 id    null:--->转到列表页 
 *                   id--->在表中不存在  --->转到列表页 
 *   id:ok
 *      根据id，取图书   shop?id=2
 *      从session中，获取购物车对象 :图书列表. 情况1：购物车没有: 先创建购物车  -->放入Session-->放入图书
 *                                   情况2：Session取购物车   放入图书
 *      //转到购物车展示页面                             
 */
public class PurServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获取图书id
		   String id= req.getParameter("id");
		   if(id==null||id.equals(""))
		   {
			   //转到列表页
			   resp.sendRedirect("list");
			   return;
		   }
		   Book book=BookDB.findById(id);//net.jxtvt java.io java.util
		                                //javax.servlet
		   if(book==null)
		   {
			   resp.sendRedirect("list");
			   return;
		   }
		//处理，放入购物车      session
		   List<Book> books=null;//java.util.List
		   HttpSession session=req.getSession();
		  Object obj= session.getAttribute("cart");
		  if(obj==null)
		  {
			  books=new ArrayList<Book>();
			  session.setAttribute("cart", books);
			  
		  }
		  else
		  {
			  books=(List<Book>)obj;
			 
		  }
		  books.add(book);
		
		//跳转到显示购物车页面
		  //在控制台中输出
		  books=(List<Book>) session.getAttribute("cart");
		  for(Book _book:books)
			  System.out.println(_book.getName()+_book.getId());
		  
		resp.sendRedirect("cart");//     <url-pattern>/cart</url-pattern>
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
