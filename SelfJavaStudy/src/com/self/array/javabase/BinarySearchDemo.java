package com.self.array.javabase;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 二分查找法
 * @author jyk
 *
 */
public class BinarySearchDemo {

	public static void main(String[] args){
		//前提数组已经有序
		//基本原理：
		//首先将要查找的元素(key)与数组中间的元素比较
		//1.如果key小于中间元素，只需要在数组的前一半元素中继续查找
		//2.如果key的中间元素相等，匹配成功，查找结束
		//3.如果key大于中间元素，只需要在数组的后一半元素中继续查找
		
		Scanner input = new Scanner(System.in);
		int[] array = {14,24,34,44,54,66,77,88,99,100,111,222,333};
		System.out.print("请输入要查找的数字：");
		int searchNum = input.nextInt();
		boolean isFind = false;
		int low = 0;	//下届下标
		int high = array.length - 1;
		//不知道要查找多少次
		while (high >= low) {
			//计算中点下标
			int mid = (high + low) /2;
			if (searchNum < array[mid]) {
				high = mid -1;
			}else if (searchNum > array[mid]) {
				low = mid + 1;
			}else if (searchNum == array[mid]) {
				System.out.println("数字在下标" + mid +"位");
				break;
			}
//			int index =;
			
			System.out.println(Arrays.binarySearch(array,searchNum));
//		
				

			}
		
		}
			
	
		
	}
	
	
	

