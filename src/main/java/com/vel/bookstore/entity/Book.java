package com.vel.bookstore.entity;


public class Book {
	private Integer id;
	private String name;
	private String desc;
	private Integer YearOfPublication;
	private String bookType;
		
	public Book(Integer id, String name, String desc, Integer yearOfPublication, String bookType) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.YearOfPublication = yearOfPublication;
		this.bookType = bookType;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Integer getYearOfPublication() {
		return YearOfPublication;
	}
	public void setYearOfPublication(Integer yearOfPublication) {
		YearOfPublication = yearOfPublication;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	
	
	
}
