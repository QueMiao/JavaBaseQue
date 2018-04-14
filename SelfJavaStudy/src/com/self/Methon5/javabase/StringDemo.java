package com.self.Methon5.javabase;
import java.io.UnsupportedEncodingException;
/**
 * 
 * @author jyk
 *
 */
import java.lang.String;
import java.util.Scanner;

public class StringDemo {
	
	public static boolean isDecimal(String str0){
		boolean isDecimal = true;
		for (int i = 0; i <str0.length(); i++) {
			 if (!Character.isDigit(str0.charAt(i))) {
				if (str0.charAt(i) == '.') {
					if (i == 0 || i == str0.length()-1) {		//如果小数点在第一位或者最后一位，任然是非法的，返回false
						isDecimal = false;
						break;
					}
					
					
				}else {		//如果当前字符不是数字并且也不是小数点，那么证明是非法字符，直接返回false
					isDecimal = false;
					break;
				}
				 
				 
			}
		}
		//判断字符串中只能有一个小数点
		//1.存在小数点 2.从前搜索的下标和从后往前搜索的小标刚好相等
		if(!str0.contains(".") && str0.indexOf(".") == str0.lastIndexOf(".")){
			return false;
		}else {
			return true;
		}
		
		
		//1.判断字符串中的每个元素必须是数字或者小数点
		//2.如果有小数点，那么小数点不能在第一位和最后一位，并且只能有一个小数点
//		if (str0.indexOf('.') == 0 || str0.indexOf(".") == str0.length()-1) {
//			return 
//		}
}
	
	
	

	public static void main(String[] args) throws UnsupportedEncodingException {
		Scanner input = new Scanner(System.in);
		String password = "ab12345abc";
		//substring	[beginIndex,endIndex)	[1,3)
		System.out.println(password.substring(1,3));	//截取1和3之间
		System.out.println(password.substring(3));	//从3开始一直截取到最后
		
		int stop3 = input.nextInt();
		//indexOf方法   
		
		System.out.println(password.indexOf("ab")); //第一处包含ab字母的下标
		System.out.println(password.indexOf("ab",2));	//第二处包含ab字母的下标
		System.out.println(password.indexOf("aaa"));	//没找到返回值为-1
		int stop1 = input.nextInt();
		//问题：判断字符串中只能有一个小数点，小数点不能在第一位，也不能在最后一位
		//lastIndeOf方法
		System.out.println(password.lastIndexOf("ba",2));		//和上面的同理方向相反 没找到返回-1
		int stop2 = input.nextInt();
		
		//字符串的其他操作方法		加上IgnoreCace
		System.out.println("abcf".compareTo("abcd"));	//字符串比大小 小于零或大于0的比较，0位相等 
		System.out.println("abc".startsWith("ab"));		//字符串比开头是否一样 返回true false
		System.out.println("abcdefg".startsWith("fg"));	//字符串比结尾是否一样 返回true false
		System.out.println("abcdefg".contains("fg"));	//字符串是否包含 返回true false
		
		
		
		
		
		//trim方法：去掉字符串左右两侧的空格
		//建议在用户输入用户名后使用
		System.out.println("请输入用户名：");
		String uname = input.nextLine().trim();
		System.out.println(uname);
		
		
		
		String value1 = "Helllo World";
		value1 += "Good";		//相当于调用了 value1.concat()方法，会直接返回一个新的字符串对象空间
		String value2 = "Hellow WorldGood";		//将字符串池中的地址赋给value2
//		System.out.println(value1 == value2);
		
		/**演示常用的几种String对象的构建方式*/
		String str1 = "你好世界";
		String str2 = new String();  	//使用默认构造 String str2 = ""; 
//		String str3 = "";
		String str3 = new String(str1);
		
		char[] chArray = {'c','b','a'};
		String str4 = new String(chArray);
		chArray = str4.toCharArray();
		System.out.println(str4);
		
		//字节数组与字符串的转换	byte数据类型：取值返回 -128到127之间
		byte [] byteArray = {104,101,108,108,111};
		String str5 = new String(byteArray);
		System.out.println(str5);
		
		//字符串转码：
		String str6 = new String(str1.getBytes() , "UTF-8");
		System.out.println(str6);
		
		
//		System.out.println(str1 == str3);
//		String value = "中国人民解放军";
//		value += "老牛逼了";
//		value = value.concat("老牛逼了");
//		System.out.println(value);
	}

}
