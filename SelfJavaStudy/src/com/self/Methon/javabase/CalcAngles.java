package com.self.Methon.javabase;
/**
 * 
 * @author jyk
 *
 */

public class CalcAngles {

	public static void main(String[] args) {
		//1.设置三个顶点的坐标
		int x1 = 90 , y1 = 180;
		int x2 = 205 , y2 = 85;
		int x3 = 310 , y3 = 240;
		//2.根据公式计算出三条边边的长
		double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		double c = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		//3、根据公式计算三个角的弧度
		double radianA =  Math.cos((a * a - b * b - c * c) /(-2 * b * c));
		double radianB =  Math.cos((b * b - a * a - c * c) /(-2 * a * c));
		double radianC =  Math.cos((c * c - b * b - a * a) /(-2 * b * a));
		//4.江湖度转换为度
		double degreeA = Math.toDegrees(radianA);
		double degreeB = Math.toDegrees(radianB);
		double degreeC = Math.toDegrees(radianC);

		System.out.printf("%.2f,%.2f,%.2f", degreeA,degreeB,degreeC);
		

	
	}
	

}
