/**
 * 2018年3月9日
 * jyk
 * 下午6:11:07
 */
package com.self.array.javabase;
import java.util.Scanner;
/**
 * @author jyk
 *
 */
public class SearchDemo {
	public static void main(String[] args) {
		//随机生成一个数组
		int nums[] = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = ((int)(Math.random() * 10000)) % 1001;	//取出0到1000的随机数
			System.out.print(nums[i] + "，");
		}
		System.out.println();
		
		//让用户输入要查找的数字
		//循环/查找  遍历数组，查找对应的元素，如果找到了，打印下表，没找到打印-1
		System.out.println("请输入要查找的元素：");
		int searchNum = new Scanner(System.in).nextInt();
		int searchIndex = -1;//一般要找的下标，初值为 -1
		//循环查找
		for (int i = 0; i < nums.length; i++) {
			if (searchNum == nums[i]) {
				//找到后记录下要查找的元素下标
				searchIndex = i;
				break;
			}
		}
		if (searchIndex == -1) {
			System.out.println("很遗憾，没找到这个元素！");
		}else {
			System.out.println("查找到到的元素下标为：" + searchIndex + "\n数字为：" + nums[searchIndex]);
		}
		
		

	}

}
