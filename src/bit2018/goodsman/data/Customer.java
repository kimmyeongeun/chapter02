package bit2018.goodsman.data;

public class Customer {
	public String name;
	protected String phone;
	private String email;
	
	void setInfo() {
		// public은 자기안에 접근 O
		name = "도우넛";
		// protected는 자기안에 접근 O
		phone = "0000-0000-0000";
		// private은 자기안에 접근 O
		email = "donut@gmail.com";
	}
	
}
