package com.sample.entity;

import java.sql.Timestamp;

public class Book {

	private Integer id;
	private String title;
	private Integer price;
	private Timestamp editday;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Timestamp getEditday() {
		return editday;
	}

	public void setEditday(Timestamp editday) {
		this.editday = editday;
	}

}
