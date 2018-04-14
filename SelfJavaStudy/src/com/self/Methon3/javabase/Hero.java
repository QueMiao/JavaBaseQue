	package com.self.Methon3.javabase;

/**
 * 游戏中的英雄类
 * 
 * @author jyk
 *
 */
public class Hero {
	/**
	 * 玩家的名称创建后不能更改
	 * 级别在1-999之间
	 * 玩家每升级所需要的经验公式为
	 * ((等级-1) ^ 3 + 60) / 5 * ((等级-1) *2 + 60)
	 */
	private long id;		//玩家的ID
	private String name;	//玩家的名字
	private int level;		//玩家等级
	private long currentexp;		//当前经验值
	private long exp;				//当前级别升级所需要的经验值 	-- 固定值

	/**
	 * 问题：怎样访问其他类的pravite的变量或者方法
	 * 答：
	 * 1、在另一个类中，是无法访问的本类的私有属性或者方法的
	 * 2、在内部类是可以直接访问的
	 * 3、可以通过定义方法的形式，让外部类调用，已获得方法的返回值的方式调用
	 */
	
	class Weapon{
		public void fight (){
			System.out.println(id);		//内部类可以直接访问
		}
	}
	
	
	
	public Hero() {
		super();
	}
	
	public Hero(String name) {		//传入的名字赋值给名字，不给他重新改
//		this.name.equals(name);
		this.name = name;
	}

	public Hero(long id, String name, int level, long exp) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
		this.exp = exp;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		if(id <= 0) id =1;
			else 
				this.id = id;
	}

	public String getName() {
		return name;
	}

//	private void setName(String name) {			//不给他重新命名的机会
//		if(name == null)  name = "未知英雄";
//			else
//				this.name = name;
//	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		if(level <1 || level >999) this.level = 1;		//如果级别超出限制，则重1级开始
		else
		this.level = level;
	}
		
	
	public long getCurrentexp() {
		return currentexp;
	}

	public void setCurrentexp(long currentexp) {
		this.currentexp = currentexp;
	}

	
	
	public long getExp() {
//		 * 玩家每升级所需要的经验公式为
//		 * ((等级-1) ^ 3 + 60) / 5 * ((等级-1) *2 + 60)	
		exp = ((long)Math.pow(level-1, 3) + 60) / 5 * ((level-1)*2 + 60)  ;
		return exp;
	}

	//因为玩家每个级别升级所需的经验值是固定公式计算的，所以就不需要设置经验值，不需要手动调用
//	public void setExp(long exp) {
//		this.exp = exp;
//	}

}
