package bookmall.vo;

public class CartVo {
	private int quantity;
	private int bookNo;
	private int memberNo;
	private String title;
	private Long pirce;
	private String name;
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Long getPirce() {
		return pirce;
	}
	public void setPirce(Long pirce) {
		this.pirce = pirce;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "CartVo [quantity=" + quantity + ", bookNo=" + bookNo + ", memberNo=" + memberNo + ", title=" + title
				+ ", pirce=" + pirce + ", name=" + name + "]";
	}
	
	
	
}
