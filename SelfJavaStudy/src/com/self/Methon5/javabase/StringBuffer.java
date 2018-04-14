package com.self.Methon5.javabase;
public class StringBuffer {


	public static void main(String[] args) {
		final int N = 100000;
		long startTime = System.currentTimeMillis();
		String str = "*";
		for (int i = 0; i < N; i++) {
			str +="*";
		}
		
		long endTime = System.currentTimeMillis();
		long time = endTime -startTime;
		System.out.println("+=用时"+time);
		
		
		startTime = System.currentTimeMillis();
		StringBuilder str1 = new StringBuilder("*");
		for (int i = 0; i < N; i++) {
			str1.append("*");
		}
		
		endTime = System.currentTimeMillis();
		long time2 = endTime -startTime;
		System.out.println("StringBuilde用时"+time2);
		
		
		
		startTime = System.currentTimeMillis();
		java.lang.StringBuffer str4 = new java.lang.StringBuffer(48);
		java.lang.StringBuffer str2 = new java.lang.StringBuffer("*");
		for (int i = 0; i < N; i++) {
			str2.append("*");
		}
		endTime = System.currentTimeMillis();
		long time3 = endTime -startTime;
		System.out.println("StringBuilde用时"+time3);
		
	}



}
