/**
 * 2018年3月10日
 * jyk
 * 下午9:31:35
 */
package com.self.array.javabase;
/**
 * @author jyk
 *   选择排序 Demo
 */
public class ChoiceSortDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		final int N = 50000;
		int [] nums = new int [N];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random()*10000);
		}
		long startTime = System.currentTimeMillis();
		//选择排序：
		//每次循环，交换i的值和minIndex的值
//		int temp;
		for (int i = 0; i < nums.length; i++) {
			int min = nums[i];	//假设第i个值为最小值
			int minIndex = i;
			for (int j = i + 1; j < nums.length; j++) {
				if (min > nums[j]) {
					min = nums[j];
					minIndex = j;
					
				}
			}
			int temp = nums[i];
			nums[i] = nums[minIndex];
			nums[minIndex] = temp;
		}
		
		 
		
		
		long endTime = System.currentTimeMillis();
		System.out.println("耗时：" + (double)((endTime - startTime)) + "秒");
	}

}
