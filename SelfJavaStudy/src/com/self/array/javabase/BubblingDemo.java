/**
 * 2018年3月9日
 * jyk
 * 下午9:58:10
 */
package com.self.array.javabase;

/**
 * @author jyk
 *经典冒泡排序
 */
public class BubblingDemo {

	public static void main(String[] args) {
		//1.一共会比较数组元素个数减1轮
		//2.每一轮，比较的次数比上一轮减少1
		//3.如果前面一个数组大于/小于后面一个数字，那么就交换位置
		final int N = 50000;
		int[] nums = new int[N];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random()*10000);
		}
		
		long starttime = System.currentTimeMillis();
//		int[] nums = {29,33,16,88,22,15,27};
		int temp;	//临时变量
		for (int i = 0; i < nums.length - 1; i++) {		//每次减少一轮外循环 所以 nums.length -1
			for (int j = 0; j < nums.length - i - 1; j++) {		
		//每次内循环内的比较：每一轮减少一个数，则下轮比较的个数少一个所以 nums.length - i - 1
				
			if (nums[j] > nums[j + 1]) {		//如果前一个数和后一个数对比前一个数比后一个数大于的话，则升序。 如果前一个数比后一个数小的话，则降序。
				temp =nums[j];				//给临时变量赋值为对比的数
				nums[j] = nums[j + 1];		//给这两个数交换位置
				nums[j + 1] = temp;			// 给临时变量赋值
				
			}
				
			}
		}
		long endtime = System.currentTimeMillis();
		System.out.println("耗时" + (endtime - starttime) / 1000 + "秒");
		
		
//		for (int i = 0; i < nums.length; i++) {
//			System.out.print(nums[i]);
//			if ((i + 1) % 15 == 0) {
//				System.out.println();
//			}else {
//				System.out.print(",");
//			}
//			
//		}
//			System.out.println();
		
	}

}
