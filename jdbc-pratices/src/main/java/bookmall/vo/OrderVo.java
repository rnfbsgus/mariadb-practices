package bookmall.vo;

public class OrderVo {
	private Long no;
	private Long orderNumber;
	private String address;
	private int price;
	private int memberNo;
	
	private String memeberName;
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public Long getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(Long orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public String getMemeberName() {
		return memeberName;
	}
	public void setMemeberName(String memeberName) {
		this.memeberName = memeberName;
	}
	
	@Override
	public String toString() {
		return "OrderVo [no=" + no + ", orderNumber=" + orderNumber + ", address=" + address + ", price=" + price
				+ ", memberNo=" + memberNo + ", memeberName=" + memeberName + "]";
	}
	
	
	
	
}
