package com.self.Methon2.javabase;
/**
 * 名称
 * 等级
 * 职业
 * 技能
 * @author jyk
 *
 */
public class Role {
	/** 名称属性*/
	public String name;
	/** 等级属性*/
	public int level;
	/** 职业属性*/
	public String job;
	/** 释放技能*/
	public Role(){}
	/** 
	 * 不写构造方法时其实是有默认的一种构造方法的 
	 * 默认构造方法 public Role(){}
	 * 构造方法/构造器
	 * 1.没有返回值
	 * 2.方法名和类名一致
	 */
	public Role(String name1, int level1, String job1){
		name=name1;
		level= level1;
		job = job1;
	}
	public void show(){
		System.out.println(name+"\t"+level+"\t"+job);
	}
	
	public void doSkill(){
		if (name.equals("劳拉")) {
			System.out.println("劳拉的经典技能：双枪老太婆");
		}else if(name.equals("孙悟空")){
			 System.out.println("孙悟空的技能：吃俺老孙一棒！");
		}else {
			System.out.println(name+"发出了一个技能");
		}
		
	}
	
	
	}


