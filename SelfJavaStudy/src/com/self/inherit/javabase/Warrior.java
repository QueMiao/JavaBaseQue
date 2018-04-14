package com.self.inherit.javabase;
/**
 * 战士类 - 继承了Hero类
 * @author 喵~
 * @version 1.0
 */
public class Warrior extends Hero{
	public static int ID = 1;	//战士类的静态属性，每实例化一个新的对象，ID++；
	private int pysicalAttack;
	

	/**
	 * 子类的构造：可以重写父类的方法
	 */
	
	
	public Warrior() {
//		super();	//子类构造中，默认就会调用父类构造
//		System.out.println("子类默认构造");
		setNickName("战士"+ID);
		setLevel(1);
		setMaxLife(100);
		setCurrLife(100);
		setPysicalAttack(30);
		ID++;
	}

	public Warrior(String nickName,int pysicalAttack) {
		setNickName(nickName);
		setPysicalAttack(pysicalAttack);
		
	}
	
	public void moveRole(Hero hero){
		hero.move();
	}
	/**
	 * 重写父类的移动方法
	 */
//	public void move(){
//		System.out.println(getNickName()+"移动基本靠腿");
//	}
	
	@Override	//注解，重写
	public void move() {
		System.out.println("战士的移动基本靠走");
	}
	/**
	 * 重写Object类的equals方法以便比较两个对象是否相等
	 */
	@Override
	public boolean equals(Object obj) {
		//如果传入的obj是Warrior类的实力
		if(!(obj instanceof Warrior)){
			return false;
		}
		Warrior newWarrior = (Warrior)obj;
		if (getNickName().equals(newWarrior.getNickName()) 
				&& getPysicalAttack() == newWarrior.getPysicalAttack()) {
			return true;
		}
		return false;
	}
	
//	@Override
//	public String toString() {
//		
//		return getNickName() + "\t"+getLevel()+"\t"+getPysicalAttack();
//	}
	
	
	/**
	 * 重写toString 方法封装答应角色信息的逻辑
	 */
	@Override
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(getLevel());
		stringBuffer.append("\t");
		stringBuffer.append(getNickName());
		stringBuffer.append("\t");
		stringBuffer.append(getMaxLife());
		stringBuffer.append("\t");
		stringBuffer.append(getCurrLife());
		stringBuffer.append("\t");
		stringBuffer.append(getPysicalAttack());
		return stringBuffer.toString();
	}

	public int getPysicalAttack() {
		return pysicalAttack;
	}

	public void setPysicalAttack(int pysicalAttack) {
		this.pysicalAttack = pysicalAttack;
	}
	
	
	
	
}
