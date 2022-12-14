package domain;

public class pagingHandler {
	//시작페이지, 끝페이지, 이전다음
	private int startPage;
	private int endPage;
	private boolean prev, next;
	
	//전체글수, pagingVO
	private int totalPage;
	private pagingVO pvo; //pageNo, qty
	private int realEndPage;
	
	public pagingHandler() {}
	public pagingHandler(pagingVO pvo, int totalPage) {
		this.pvo=pvo;
		this.totalPage=totalPage;
		
		this.endPage=(int)Math.ceil(pvo.getPageNo()/(pvo.getQty()*1.0/2)) * (pvo.getQty()/2);
		this.startPage=this.endPage-4;
		this.realEndPage = (int)Math.ceil((totalPage*1.0)/(pvo.getQty()/2));
		
		if(realEndPage<this.endPage){ 
			this.endPage=realEndPage;
		}
		 
		this.prev=this.startPage>1;
		this.next=this.endPage<realEndPage;
	}
	
	//getter,setter
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public boolean isPrev() {
		return prev;
	}
	public void setPrev(boolean prev) {
		this.prev = prev;
	}
	public boolean isNext() {
		return next;
	}
	public void setNext(boolean next) {
		this.next = next;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public pagingVO getPvo() {
		return pvo;
	}
	public void setPvo(pagingVO pvo) {
		this.pvo = pvo;
	}
	public int getRealEndPage() {
		return realEndPage;
	}
	public void setRealEndPage(int realEndPage) {
		this.realEndPage = realEndPage;
	}

}
