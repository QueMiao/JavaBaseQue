/**
 * 2018年3月10日
 * jyk
 * 下午10:16:06
 */
package com.self.array.javabase;

import java.util.Arrays;

/**
 * @author jyk
 * Arrays.sort 排序
 */
public class ArraysSort {

	public static void main(String[] args) {
		final int N = 500;
		int nums[] = new int[N];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random()*10000);
		}
		long startTime = System.currentTimeMillis();
		
		
		Arrays.sort(nums);
//		//从小到大 (顺序)
//		for (int i = 0; i < nums.length; i++) {
//			int temp = nums[i];
//			System.out.println(temp);
//		}
		//从大到小(逆序)
		for (int i = 0; i < nums.length / 2; i++) {
			int temp = nums[i];
			nums[i] = nums[nums.length - i - 1];
			nums[nums.length - i - 1]= temp;
			System.out.println(temp);
		}
		
		
		
		
		long endTime = System.currentTimeMillis();
		System.out.println("耗时：" + (endTime - startTime) + "毫秒");
	}

}
