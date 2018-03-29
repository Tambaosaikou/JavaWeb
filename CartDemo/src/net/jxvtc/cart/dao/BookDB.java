package net.jxvtc.cart.dao;

import java.util.HashMap;
import java.util.Map;

import net.jxvtc.cart.pojo.Book;

public class BookDB {
	private static Map<String, Book> books;

	static {
		books = new HashMap<String, Book>();
		books.put("1", new Book("1", "Python数据分析"));
		books.put("2", new Book("2", "Python深度学习"));
		books.put("3", new Book("3", "Python Web开发"));
		books.put("4", new Book("4", "XCYSB"));
		books.put("5", new Book("5", "他改变了中国"));
	}

	public static Map<String, Book> findAll() {
		return books;
	}

	public static Book findById(String id)  {
		return books.get(id);
	}
}
