package bookmall.dao.test;

import java.util.List;

import bookmall.dao.OrderBookDao;
import bookmall.vo.OrderBookVo;

public class OrderBookDaoTest {
	public static void main(String[] args) {
		insertTest();
		findAllTest();
	}

	public static void findAllTest() {
		List<OrderBookVo> list = new OrderBookDao().findAll();
		for(OrderBookVo vo : list) {
			System.out.println(vo);
		}
	}

	public static void insertTest() {
		OrderBookVo vo = null;
		OrderBookDao dao = new OrderBookDao();
		
		
		vo = new OrderBookVo();
		vo.setBookNo(1);
		vo.setOrdersNo(2);
		vo.setQuantity(1);
		dao.insert(vo);
		
		vo = new OrderBookVo();
		vo.setBookNo(2);
		vo.setOrdersNo(2);
		vo.setQuantity(1);
		dao.insert(vo);
		
	}

}

