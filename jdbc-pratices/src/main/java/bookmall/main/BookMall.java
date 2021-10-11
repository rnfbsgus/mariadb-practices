package bookmall.main;

import bookmall.dao.test.BookDaoTest;
import bookmall.dao.test.CartDaoTest;
import bookmall.dao.test.CategoryDaoTest;
import bookmall.dao.test.MemberDaoTest;
import bookmall.dao.test.OrderBookDaoTest;
import bookmall.dao.test.OrderDaoTest;

public class BookMall {

	public static void main(String[] args) {
		
		MemberDaoTest.insertTest();
		MemberDaoTest.findAllTest();
		System.out.println();
		CategoryDaoTest.insertTest();
		CategoryDaoTest.findAllTest();
		System.out.println();
		
		BookDaoTest.insertTest();
		BookDaoTest.findAllTest();
		System.out.println();

		CartDaoTest.insertTest();
		CartDaoTest.findAllTest();
		System.out.println();

		OrderDaoTest.insertTest();
		OrderDaoTest.findAllTest();
		System.out.println();

		OrderBookDaoTest.insertTest();
		OrderBookDaoTest.findAllTest();
		
		
	}

}
