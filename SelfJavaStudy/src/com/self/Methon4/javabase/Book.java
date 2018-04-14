package com.self.Methon4.javabase;

/**
 * 图书实体类
 * 
 * @author jyk
 *
 */



public class Book {
	//MVC
	//M = model	模型
	//V = View	视图
	//C = Controller	控制器
	
	
	private String name;
	private String isbn;
	private double price;
	private int count;	//当前图书对象的库存
	private boolean isborrow;	//是否可借
	public Book(){
	}
	
	public Book (String name){
		this.setName(name);
	}
	public Book(String name, String isbn, double price ,int count){
		setName(name);
		setIsbn(isbn);
		setPrice(price);
		setCount(count);
	}
	public boolean isBorrow(){
		return isborrow;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		if (count < 0) {
			count = 0;
		}else {
			this.count = count;
		}
		
	}

}
