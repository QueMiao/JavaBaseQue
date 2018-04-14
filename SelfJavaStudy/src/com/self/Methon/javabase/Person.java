package com.self.Methon.javabase;

/**
 * 
 * @author jyk
 *
 */
public class Person {
	public int age;
	public String name;
	public Person(int age , String name){
				this.age = age;
				this.name = name;
	}
	
	public static void main(String[] args){
		Person[] person = {new Person(15, "用户1"),new Person(20, "用户2"),new Person(18, "用户3")};
		for (int i = 0; i < person.length; i++) {
			System.out.println("第"+(i+1)+"位用户   名字："+person[i].name+"  年龄："+person[i].age);
		}
		

		
	}
	
	
	

		
		
	}
	



