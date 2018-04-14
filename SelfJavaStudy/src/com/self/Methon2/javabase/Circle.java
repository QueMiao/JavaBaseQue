package com.self.Methon2.javabase;

import java.util.Scanner;
/**
 * 1.定义类：Circle
 * 2.抽取属性
 * 3.定义方法
 * 4.调用方法打印结果
 * @author jyk
 * 圆半径 圆面积 圆周常
 */
public class Circle {
	//圆的半径
	public double radius;
	//圆的周常
	public double perimeter;
	//圆的面积
	public double area;

	public void inputradius(){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入圆的半径：");
		radius = input.nextDouble();
		input.close();
	}
	
	public void showPerimeter(){
		if (radius <= 0) {
			inputradius();//如果用户没有输入半径，那么让用户再输入一次
		} 
		perimeter = 2 * Math.PI * radius;
		System.out.println("圆的周长为："+perimeter);
		}
	
	public void showArea(){
		if (radius <= 0) {
			inputradius();//如果用户没有输入半径，那么让用户再输入一次
		} 
		area = Math.PI * Math.pow(radius, 2);
		System.out.println("圆的面积为："+ area);
	}
}
