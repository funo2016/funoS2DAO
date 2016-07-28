package com.sample.dao;

import java.util.List;

import com.sample.entity.Book;

public interface BookDao {

	public static final Class BEAN = Book.class;
	public static final String selectById_ARGS = "ID";

	public List selectAll();

	public String select();

	public Book selectById(Integer id);

	public int insert(Book book);

	public int update(Book book);

	public int delete(Book book);

}
