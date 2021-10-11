package bookmall.dao.test;

import java.util.List;

import bookmall.dao.BookDao;
import bookmall.vo.BookVo;

public class BookDaoTest {

	public static void main(String[] args) {
		insertTest();
		findAllTest();

	}
	
	public static void findAllTest() {
		List<BookVo> list = new BookDao().findAll();
		for (BookVo vo : list) {
			System.out.println(vo);
		}
	}
	
	
	public static void insertTest() {
		BookVo vo = null;
		vo = new BookVo();
		
		vo.setTitle("작별하지 않는다");
		vo.setPrice(12600);
		vo.setCategoryNo(1);
		new BookDao().insert(vo);
		
		vo = new BookVo();
		vo.setTitle("인생은 실전이다");
		vo.setPrice(16650);
		vo.setCategoryNo(2);
		new BookDao().insert(vo);
		
		vo = new BookVo();
		vo.setTitle("럭키");
		vo.setPrice(14220);
		vo.setCategoryNo(3);
		new BookDao().insert(vo);
		
	}
	
	

}