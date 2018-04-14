package com.self.Methon2.javabase;

import java.util.Scanner;

public class Circleten{

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("请输入圆半径：");
	double radius = input.nextDouble();
	CircleV2 circle = new CircleV2(radius);
	circle.showArea();
	circle.showPerimeter();
}



}