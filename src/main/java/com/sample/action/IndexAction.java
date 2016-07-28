package com.sample.action;

import org.apache.struts2.config.Result;
import org.seasar.framework.container.SingletonS2Container;

import com.opensymphony.xwork2.ActionSupport;
import com.sample.dao.BookDao;
import com.sample.entity.Book;

@Result(name = "index" ,value = "index.jsp")
public class IndexAction extends ActionSupport {
    public String execute() throws Exception {
        return "success";
    }

    public String id;
//
//	public String getid(){
//		BookDao bookDao = SingletonS2Container.getComponent(BookDao.class);
//
//		List books = bookDao.selectAll();
//
//		Book book = new Book();
//		for (int i=0 ;i<books.size();i++) {
//		    System.out.println("■タイトル:" +  book.getTitle()
//		                    + " ■価格:" + book.getPrice());
//		}
//		id = book.getTitle();
//		return "maseage";
//	}

	private Book[] bookItems;
	public Class<?> initialize() {
		BookDao bookDao = SingletonS2Container.getComponent(BookDao.class);

		String bookItem = bookDao.select();

		return null;
	}
}
