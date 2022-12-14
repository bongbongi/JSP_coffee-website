package domain;

public class memberVO {

	private String id;
	private String password;
	private String name;
	private String brith_date;
	private String gender;
	private String email;
	private String mobile;
	
	//생성자
	public memberVO() {}
	//all
	public memberVO(String id, String password, String name, String brith_date, String gender, String email, String mobile) {
		this.id=id;
		this.password=password;
		this.name=name;
		this.brith_date=brith_date;
		this.gender=gender;
		this.email=email;
		this.mobile=mobile;
	}
	//list
	public memberVO(String id, String name, String brith_date, String email, String mobile) {
		this.id=id;
		this.name=name;
		this.brith_date=brith_date;
		this.email=email;
		this.mobile=mobile;
	}
	//login
	public memberVO(String id, String password) {
		this.id=id;
		this.password=password;
	}
	//탈퇴
	public memberVO(String id) {
		this.id=id;
	}
	//getter,setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrith_date() {
		return brith_date;
	}
	public void setBrith_date(String brith_date) {
		this.brith_date = brith_date;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}
