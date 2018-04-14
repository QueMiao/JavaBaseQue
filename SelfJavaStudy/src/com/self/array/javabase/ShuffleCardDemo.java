/**
 * 2018年3月9日
 * jyk
 * 下午6:56:11
 */
package com.self.array.javabase;
/**
 * @author jyk
 * 模拟洗牌过程Demo
 */
public class ShuffleCardDemo {

	public static void main(String[] args) {
		final int N = 52;
		int [] cards = new int[N];
		//牌的花色数组
		String [] cardClours = {"黑桃","红心","方块","梅花"};
		//牌面的数组
		String [] cardValues = {
				"A","2","3","4","5","6","7","8","9","10","J","Q","K"
		};
		for (int i = 0; i < cards.length; i++) {
			cards[i] = i; //牌面与循环变量的值一致，0-51之间
		}
		
		//思路：一副扑克牌 54张 除去 例外的大小王 一共52张
		//52张牌在程序里表达52个数字，0-51 一共52个数
		//所以第一步取出1到52之间的所有数字
		//把52个数分成4种花色,则每种花色有13张，分别为不同花色的 A、2、3、4....K
		//0-51的所有数字分别代表什么 例如：0代表第一种花色的A,44就是 44 / 13 取商为4 余为5（5+1） 因为从零开始  那44代表的就是第四种花色的6，即梅花6
		//所以商为花色数组里的第几位，余数为牌面里的第几位！ 那么这样一副还没洗牌的牌就生成了！
		
		System.out.println("洗牌前：");
		for (int i = 0;  i < cards.length; i++) {
//			System.out.print(cards[i]);
			System.out.printf("%s%s",cardClours[cards[i] / 13] , cardValues[cards[i] % 13]);
			if ((i + 1) % 13 == 0) {
				System.out.println();
			} else {
				System.out.print("\t");
			}
		}
		//洗牌：随机生成 一个0-51之间数字rIndex，cards[i]和cards[newIndex] 的元素进行交换
		//洗牌的思路 random创建随机数的时候java会自动判断有没有重复 如果重复则不加入数组中
		//通过循环记录下生成的所有数字 并且把所有牌面全部加入到所有牌的数组中
		//这样就实现了 洗牌的功能
		for (int i = 0; i < cards.length; i++) {
			int newIndex = (int)(Math.random()*N);	//0-51之间的随机数字
			int temp = cards[i];	//创建一个临时变量 记录生成的牌面
			cards[i] = cards[newIndex];		//这个牌的数字为0到51之间的哪个数
			cards[newIndex] = temp;
		}
		
		System.out.println("洗牌后：");
		for (int i = 0;  i < cards.length; i++) {
//			System.out.print(cards[i]);
			System.out.printf("%s%s",cardClours[cards[i] / 13],cardValues[cards[i] % 13] );
			if ((i + 1) % 13 == 0) {
				System.out.println();
			} else {
				System.out.print("\t");
			}
		}
	}
}

		
