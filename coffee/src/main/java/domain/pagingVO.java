package domain;

public class pagingVO {
	//시작넘버, 갯수
	private int pageNo;
	private int qty;
	
	public pagingVO() {
		this(1,10);
	}
	public pagingVO(int pageNo, int qty) {
		this.pageNo=pageNo;
		this.qty=qty;
	}
	//getter,setter
	public int getPageStart() {
		// 페이지 넘버가 들어오면 계산해줌
		// 시작 페이지 번호 구하기
		// 0번지부터 시작하기때문에 1를 빼줌
		return (this.pageNo - 1) * qty;
	}

	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
}
