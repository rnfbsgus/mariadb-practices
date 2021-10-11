 package bookmall.dao.test;

import java.util.List;

import bookmall.dao.MemberDao;
import bookmall.vo.MemberVo;

public class MemberDaoTest {
	public static void main(String[] args) {
		insertTest();
		findAllTest();
	}

	public static void findAllTest() {
		List<MemberVo> list = new MemberDao().findAll();
		for(MemberVo vo : list) {
			System.out.println(vo);
		}
	}

	public static void insertTest() {
		MemberVo vo = null;
		MemberDao dao = new MemberDao();
		
		vo = new MemberVo();
		vo.setName("구륜현");
		vo.setPhoneNumber("010-1234-5678");
		vo.setEmail("fbsgus4017@naver.commm");
		vo.setPassword("1234");
		dao.insert(vo);
		
		vo = new MemberVo();
		vo.setName("추연수");
		vo.setPhoneNumber("010-9876-5432");
		vo.setEmail("cndustn@naver.commm");
		vo.setPassword("5678");
		dao.insert(vo);
	}

}