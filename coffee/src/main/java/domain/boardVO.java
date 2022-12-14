
package domain;
public class boardVO {

	private int bNum;
	private int bno;
	private String title;
	private String writer;
	private String content;
	private String regdate;
	private int read_count;
	private String image_file;
	
	//생성자
	public boardVO() {}
	//등록: title, writer, content, image_file
	public boardVO(String title, String writer, String content, String image_file) {
		this.title=title;
		this.writer=writer;
		this.content=content;
		this.image_file=image_file;
	}
	//수정: bno, title, content, image_file
	public boardVO(int bno, String title, String content, String image_file) {
		this.bno=bno;
		this.title=title;
		this.content=content;
		this.image_file=image_file;
	}
	//리스트: bno,title,writer,content, regdate,read_count
	public boardVO(int bno, String title, String writer, String regdate, int read_count, String image_file) {
		this.bno=bno;
		this.title=title;
		this.writer=writer;
		this.regdate=regdate;
		this.read_count=read_count;
		this.image_file=image_file;
	}
	//디테일: all
		public boardVO(int bno, String title, String writer, String content, String regdate, int read_count, String image_file) {
			this.bno=bno;
			this.title=title;
			this.writer=writer;
			this.content=content;
			this.regdate=regdate;
			this.read_count=read_count;
			this.image_file=image_file;
		}
	//getter, setter
		public int getBno() {
			return bno;
		}
		public void setBno(int bno) {
			this.bno = bno;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getWriter() {
			return writer;
		}
		public void setWriter(String writer) {
			this.writer = writer;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getRegdate() {
			return regdate;
		}
		public void setRegdate(String regdate) {
			this.regdate = regdate;
		}
		public int getRead_count() {
			return read_count;
		}
		public void setRead_count(int read_count) {
			this.read_count = read_count;
		}
		public String getImage_file() {
			return image_file;
		}
		public void setImage_file(String image_file) {
			this.image_file = image_file;
		}
		
}
