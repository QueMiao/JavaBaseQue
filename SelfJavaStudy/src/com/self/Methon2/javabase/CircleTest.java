package com.self.Methon2.javabase;

import java.util.Scanner;

public class CircleTest {
	
	public static void main(String[] args) {
		
//		CircleV2 circle = new CircleV2();//如果括号里不填不传参，则执行类里的输入半径的语句，如果传参了，则直接计算
//		circle.showArea();
//		circle.showPerimeter();
//		
		
		Scanner input = new Scanner(System.in);
		System.out.println("请输入圆的半径：");
		double radius = input.nextDouble();
		CircleV3 circle = new CircleV3(radius); 
		circle.show();

	}
} 
