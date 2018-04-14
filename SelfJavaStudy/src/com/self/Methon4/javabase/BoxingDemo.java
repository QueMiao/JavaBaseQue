package com.self.Methon4.javabase;


import javax.swing.JOptionPane;

/**
 * 包装类
 * @author jyk
 * 
 */
public class BoxingDemo {
	public static boolean ischar(char ch){
		return ch >= '0' && ch <= '9';
	}
	
	public static void main(String[] args) {
		
		/** 补充：字符包装类
		 * Character	Integer
		 * Character.isLetter(ch);是不是一个字母
		 * Character.isLetterOrDigit(ch);  是不是纯数字或者字母
		 * Character.isJavaIdentifierStart(ch);	判断用来定义java变量的单词中，首字符是否为合法字符
		 * Character.isJavaIdentifierPart(ch); 判断用来定义java变量的单词中，除首字符外其他字符是否为合法字符想·
		 * Character.isUpperCase(ch);  判断是否大写字母
		 * */
		
		
		boolean isDigit = true;
		String value = JOptionPane.showInputDialog("请输入一个字符串我来判断是否是纯数字");
//		System.out.println("请输入一个字符串");
//		String value = new Scanner(System.in).next();
		for (int i = 0; i < value.length(); i++) {
//			if (!isDigit(value.charAt(i))) {
			if (!Character.isDigit(value.charAt(i))) {
				isDigit = false;
				break;
			}
		}
		
		
		if (!isDigit) {
			JOptionPane.showMessageDialog(null, "不是一个纯数字！");
//			System.out.println("不是一个纯数字");
		}else {
			JOptionPane.showMessageDialog(null, "这是一个纯数字！");
//			System.out.println("这是一个纯数字");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Integer num1 = Integer.valueOf(100);		
//		Integer num2 = 100;
//		//对象和对象之间的比较是比较的地址 所以不相等
//		//这个的原因是 -128 -- 127之间
//		//超出的话就会创建一个新的对象
//		System.out.println(num1 == num2);
//		//可以用的比较方法,两个对象之间的比较
//		System.out.println(num1.compareTo(num2));
		
		
		
		

//		String str = "123";
//		Integer.parseInt(str);
//		Double.parseDouble(str);
//		
		
		
		
		
		
		
//		double num1 = 3.14;
//		Double dNum1 = new Double(num1);	//普通装箱
//		Double dNum1_1 = Double.valueOf(num1);	//装箱的另一种方式
//		Double dNum1_2 = num1;		//自动装箱
//		
//		num1 = dNum1;	//自动拆箱
//		num1 = dNum1_1.doubleValue();
//		
//		
//		System.out.println(dNum1.toHexString(num1));
	}

}
