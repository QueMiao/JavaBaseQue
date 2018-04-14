package com.self.inherit.javabase;

/**
 * 对象数组的排序
 * @author jyk	 
 */
public class ObjectArraySortDemo {
	
	public static void sort(Hero[] heroArray){
		Hero tempHero = null;
		for (int i = 0; i < heroArray.length; i++) {
			for (int j = 0; j < heroArray.length-i-1; j++) {
				if (heroArray[j].compareToByName(heroArray[j+1]) < 0) {
					tempHero = heroArray[j];
					heroArray[j] = heroArray[j+1];
					heroArray[j+1] = tempHero;
				}
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		Warrior warrior1 = new Warrior();
		Warrior warrior2 = new Warrior();
		Warrior warrior3 = new Warrior();
		Warrior warrior4 = new Warrior();
		Warrior warrior5 = new Warrior();
		Archmage archmage1 =new Archmage();
		Archmage archmage2 =new Archmage();
		Archmage archmage3 =new Archmage();
		Archmage archmage4 =new Archmage();
		Archmage archmage5 =new Archmage();
		
		Hero[] herosArray = {
				warrior1,warrior2,warrior3,warrior4,warrior5,	
				archmage1,archmage2,archmage3,archmage4,archmage5
		};
		System.out.println("排序前：");
		System.out.println("级别\t昵称\t最高血量\t当前血量\t攻击力");
		for (Hero hero : herosArray) {   
			System.out.println(hero);
		}
		
		sort(herosArray);
		System.out.println("排序前：");
		System.out.println("级别\t昵称\t最高血量\t当前血量\t攻击力");
		
		for (Hero hero : herosArray) {
			System.out.println(hero);
		} 
		
	}
}
