package com.self.Methon4.javabase;

public class BookTest {
		public static void main(String[] args) {
			Book book = new Book("图书名字","123-321",66.66,5);
			//实例化图书业务对象
			BookBiz bookBiz = new BookBiz();
			
			bookBiz.sellBook(book);
			System.out.println(book.getCount()+book.getName());
			
		}

}
