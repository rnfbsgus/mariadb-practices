package bookmall.vo;

public class OrderBookVo {
	private int quantity;
	private int ordersNo;
	private int bookNo;
	private String bookTitle;
	private int bookprice;
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getOrdersNo() {
		return ordersNo;
	}
	public void setOrdersNo(int ordersNo) {
		this.ordersNo = ordersNo;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public int getBookprice() {
		return bookprice;
	}
	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}
	@Override
	public String toString() {
		return "OrderBookVo [quantity=" + quantity + ", ordersNo=" + ordersNo + ", bookNo=" + bookNo + ", bookTitle="
				+ bookTitle + ", bookprice=" + bookprice + "]";
	}
	
}
