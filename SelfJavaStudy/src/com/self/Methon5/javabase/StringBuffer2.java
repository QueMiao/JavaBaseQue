package com.self.Methon5.javabase;

public class StringBuffer2 {

	public static void main(String[] args) {
		java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("你好,中国!");
		java.lang.StringBuffer stringBuffer1 = new java.lang.StringBuffer("你好,中国!");
		java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer("你好,中国!");
		java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer("你好,中国!");
		java.lang.StringBuffer stringBuffer4 = new java.lang.StringBuffer("你好,中国!");
		stringBuffer.append('a');
		
		StringBuilder stringBuilder = new StringBuilder("我，特么真帅");
		System.out.println(stringBuilder.replace(1, 4, "是真的"));
		
		
		stringBuffer.reverse();		//翻转字符串
		System.out.println(stringBuffer);
		
		stringBuffer1.insert(2,"3L" );		//插入字符串
		System.out.println(stringBuffer1);
		
		stringBuffer2.deleteCharAt(3);		//字符串删除字符
		System.out.println(stringBuffer2);
		
		stringBuffer3.delete(2, 4);		//删除[2,4)下标之间的元素
		System.out.println(stringBuffer3);
		
		stringBuffer4.replace(2, 4, "北京");		//替换[2,4)下标之间的元素
		System.out.println(stringBuffer4);
		
		stringBuffer.setCharAt(3, '神');		//把下标3的直接设置为后面的字符
		System.out.println(stringBuffer);
		
		System.out.println("缓存大小：" + stringBuffer.capacity());	//显示缓存大小
		
		stringBuffer.setLength(0);		//相当于清空字符串，设置长度为0
		
		 
		stringBuffer.trimToSize();
	}

}
