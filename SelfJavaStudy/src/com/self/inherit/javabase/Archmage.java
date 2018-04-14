package com.self.inherit.javabase;
/**
 * 法师类
 * @author jyk
 *
 */
public class Archmage extends Hero {
	public static int ID = 1;	//战士类的静态属性，每实例化一个新的对象，ID++；
	private int magicAttack;


	public Archmage() {
		setNickName("法师"+ID);
		setLevel(1);
		setMaxLife(100);
		setCurrLife(100);
		setMagicAttack(18);
		ID++;
	}
	
	public Archmage(String nickName) {
		this();	//调用本类的默认构造
		setNickName(nickName);
	}
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
		stringBuffer.append(getMagicAttack());
		return stringBuffer.toString();
	}
	

	public void biubiubiu(){
		System.out.println("大法师"+getNickName()+"大火球");
	}
	
	
	public int getMagicAttack() {
		return magicAttack;
	}

	public void setMagicAttack(int magicAttack) {
		this.magicAttack = magicAttack;
	}
	
	
	
	
	
	
	
}
