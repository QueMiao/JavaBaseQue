package com.self.Methon.javabase;

import java.util.Scanner;

public class Equals {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入姓名");
		String name = input.next();
		for (int i = 0; i < 5; i++) {
			System.out.println("输入"+ (i+1)+"位学生的成绩：");
			int score = input.nextInt();
		}
			System.out.println("是否要继续");
			String choose = input.next();
			while (!choose.equals("y")){
				if (choose.equals("n")  || !choose.equals(choose)) {
					break;
				}else {
					System.out.println("键代码错误，重新输入：");
					choose = input.next();
				}
		}
		System.out.println("退出系统");
	}
}
