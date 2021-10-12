package bookmall.main;

import bookmall.dao.test.BookDaoTest;
import bookmall.dao.test.CartDaoTest;
import bookmall.dao.test.CategoryDaoTest;
import bookmall.dao.test.MemberDaoTest;
import bookmall.dao.test.OrderBookDaoTest;
import bookmall.dao.test.OrderDaoTest;

public class BookMall {

	public static void main(String[] args) {
		
		System.out.println("--- 회원리스트 ---");
		MemberDaoTest.insertTest();
		MemberDaoTest.findAllTest();
		System.out.println();
		
		System.out.println("--- 카테고리 ---");
		CategoryDaoTest.insertTest();
		CategoryDaoTest.findAllTest();
		System.out.println();
		
		System.out.println("--- 상품리스트 ---");
		BookDaoTest.insertTest();
		BookDaoTest.findAllTest();
		System.out.println();
		
		System.out.println("--- 카트리스트 ---");
		CartDaoTest.insertTest();
		CartDaoTest.findAllTest();
		System.out.println();
		
		System.out.println("--- 주문리스트 ---");
		OrderDaoTest.insertTest();
		OrderDaoTest.findAllTest();
		System.out.println();
		
		System.out.println("--- 주문도서리스트 ---");
		OrderBookDaoTest.insertTest();
		OrderBookDaoTest.findAllTest();
		
		
	}

}
