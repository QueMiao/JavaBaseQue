package com.self.Methon.javabase;



public class Objectbased {
	public String name;
	public String gender;
	public int age;
//	public Objectbased (int age , string name);
//			this.age = age;
//	//work方法
	public void work() {
		System.out.println(this.name+"真的很厉害");
		
	}
	
	
	
	public static void main(String[] args) {
		Objectbased kofli = new Objectbased();
		kofli.name="小李";
		kofli.gender = "女";
		kofli.age = 18;
		kofli.work();
	}

}


