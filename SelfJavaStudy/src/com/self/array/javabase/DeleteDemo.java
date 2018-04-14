package com.self.array.javabase;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 删除数组元素的方法
 * 1.找到要查找的元素下标
 * 2.从要删除的下标开始，后面一个元素赋值给前面一个元素 也就是覆盖
 * 3.数组的总长度 -1
 * 4.完成删除
 * @author jyk
 *
 */
public class DeleteDemo {

	public static void main(String[] args) {
		//随机生成一个数组
		int nums[] = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = ((int)(Math.random() * 10000)) % 1001;	//取出0到1000的随机数		
		}		
		Arrays.sort(nums);		//给数组排序，方便于下面的查找
		for (int i = 0; i < nums.length; i++) {	
			System.out.print(nums[i] + ",");	//打印出数组
		}
		System.out.println();
		/**
		 * 开始查找，使用二分查找法
		 * 
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("请输入要删除的数字：");
		int searchNum = input.nextInt();
		boolean isFind = false;
		int low = 0;	//下届下标
		int high = nums.length - 1;
		int count = nums.length; 
//		int mid = -2;	//中间下标
		int deleteIndex = -1;	//要删除数字的下标

		//开始查找
		while (high >= low) {
		int mid = (high + low) / 2;
		if (searchNum < nums[mid]) {
			high = mid -1;	
		}else if (searchNum > nums[mid]) {
			low = mid + 1;	
		}else {
			System.out.println("数组下标为"+ mid);
			isFind = true;
			deleteIndex = mid;
			break;
		}
		
		}
		
	

			if (isFind = false || deleteIndex == -1) {
				System.out.println("没找到要删除的数字");
				System.exit(0);
			}
			
//			 * 1.找到要查找的元素下标
//			 * 2.从要删除的下标开始，后面一个元素赋值给前面一个元素 也就是覆盖
//			 * 3.数组的总长度 -1
//			 * 4.完成删除
			
			count--;
			for (int i = 0; i < count; i++) {
				nums[deleteIndex] = nums[i + 1];
			}
			
			Arrays.sort(nums);
			
			
			for (int i = 0; i < count; i++) {
				System.out.print(nums[i]+",");
			}
			 
			
			
			
		}
		
		
		
		

	}


