package com.self.Methon2.javabase;


/**
 * 1.定义类：Circle
 * 2.抽取属性
 * 3.定义方法
 * 4.调用方法打印结果
 * @author jyk
 * 圆半径 圆面积 圆周常
 */
public class CircleV3 {
	//圆的半径
	private double radius;
	//圆的周常
	private double perimeter;
	//圆的面积
	public double area;
	/**
	public //公有的
	private //私有的
	default //默认的 同一个包
	protected //受保护的 同一个包或者有父子关系的
	*/
	
	public CircleV3() {}

	public CircleV3(double radius) {
		this.setRadius(radius);
	}

	public void show(){
		System.out.println("周长为：" + this.getPerimeter());
		System.out.println("周长为：" + this.getArea());
	}

	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double radius){
		//this的意思：自指针 就是代表 this.radius是代表外面的，radius是内部传进来的
		if (radius <= 0) {		//封装的好处：对传入的属性进行简单的验证
			radius = 1;
		}else {
			this.radius = radius;
		}
	}

	public double getPerimeter() {
		perimeter = 2 * Math.PI * radius;
		return perimeter;
	}

	public double getArea() {
		area = Math.PI * Math.pow(radius, 2);
		return area;
	}

	
	}

//	
//	private void inputradius(){
//Scanner input = new Scanner(System.in);
//System.out.println("请输入圆的半径：");
//radius = input.nextDouble();
//input.close();
//}
//
//public void showPerimeter(){
//if (radius <= 0) {
//	inputradius();//如果用户没有输入半径，那么让用户再输入一次
//} 
//perimeter = 2 * Math.PI * radius;
//System.out.println("圆的周长为："+perimeter);
//}
//
//public void showArea(){
//if (radius <= 0) {
//	inputradius();//如果用户没有输入半径，那么让用户再输入一次
//} 
//area = Math.PI * Math.pow(radius, 2);
//System.out.println("圆的面积为："+ area);
//}