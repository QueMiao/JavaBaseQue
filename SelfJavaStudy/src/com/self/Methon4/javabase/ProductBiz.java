package com.self.Methon4.javabase;

import javax.swing.JOptionPane;

/**
 * 商品管理类
 * @author jyk
 *
 */
public class ProductBiz {
	public static void main(String[] args) {
		/**用于存储商品的总库存*/
		int [] counts = new int [3];
		/**最终要支付的总金额*/
		double total = 0;
		//创建对象数组
		ProductDemo [] products = new ProductDemo[3];
		for (int i = 0; i < counts.length; i++) {
			if (products[i] == null)
			products[i] = new ProductDemo();		//对象数组中的元素使用前，一定要记得分配空间
//			ProductDemo product = new ProductDemo();
			String name = JOptionPane.showInputDialog("请输入商品名称：");
			products[i].setName(name);
			/**接收用户输入的商品单价，返回值是字符串类型*/
			String price = JOptionPane.showInputDialog("请输入商品单价:");
			/**需要将字符串类型转换成double类型 , 转换之前最好能够进行验证 ，避免异常*/
			products[i].setPrice(Double.parseDouble(price));
			String strCount = JOptionPane.showInputDialog("请输入购买的数量：");
			counts[i] = Integer.parseInt(strCount);
			total += products[i].getPrice() * counts[i];
			JOptionPane.showMessageDialog(null, products[i].getName() + "\t" + products[i].getPrice() * counts[i]);
			
		}
		JOptionPane.showMessageDialog(null, "商品总金额为：" + total);
	}
}
