package bookmall.dao.test;

import java.util.List;

import bookmall.dao.CartDao;
import bookmall.vo.CartVo;

public class CartDaoTest {
	public static void main(String[] args) {
		 insertTest();
		findAllTest();
	}

	public static void findAllTest() {
		List<CartVo> list = new CartDao().findAll();
		for(CartVo vo : list) {
			System.out.println(vo);
		}
	}

	public static void insertTest() {
		CartVo vo = null;
		CartDao dao = new CartDao();
		
		
		vo = new CartVo();
		vo.setBookNo(1);
		vo.setMemberNo(1);
		vo.setQuantity(1);
		dao.insert(vo);
	
		
		vo = new CartVo();
		vo.setBookNo(2);
		vo.setMemberNo(2);
		vo.setQuantity(1);
		dao.insert(vo);
		
	}

}
