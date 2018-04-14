package com.self.array.javabase;

/**
 * 求数组中的最大值和最小值
 * @author jyk
 *
 */
public class MaxMinDemo {

	public static void main(String[] args) {
		//随机生成一个数组，求里面最大值和最小值
		int nums[] = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = ((int)(Math.random() * 10000)) % 1001;	//取出0到1000的随机数
			System.out.print(nums[i] + "，");
		}
		System.out.println();
		
		//求最大值和最小值
		//1.假设第一个元素是最大值/最小值
		//2.拿最大值/最小值在数组中逐个比较，如果某个元素比最大值还大，you can you up!	
		int max = Integer.MIN_VALUE;//或者用于比对的可以用 nums[0];
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {				
				max = nums[i];				
			}
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		System.out.println("最大值为" + max + "\n最小值为" + min);
	}

}
