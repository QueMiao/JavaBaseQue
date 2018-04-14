package com.self.Methon4.javabase;

/**
 * 商品实体类
 * @author jyk
 */
public class ProductDemo {

	private String name;
	private double price;
	/** 商品的描述 */
	private String notice;
	/** 商品的服务 */
	private String[] services;

	public ProductDemo(){
		
	}
	
	public ProductDemo(String name,String notice){
		
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public String[] getServices() {
		return services;
	}

	public void setServices(String[] services) {
		this.services = services;
	}

}
