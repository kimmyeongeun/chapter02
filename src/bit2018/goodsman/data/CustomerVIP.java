package bit2018.goodsman.data;

public class CustomerVIP extends Customer {
	void set() {
		//public은 자식클래스에서 접근 O
		name = "....";
		//protected는 자식클래스에서 접근 O
		phone = "0000-0000-0000";
		//private은 자식클래스에서 접근 X
		//email = "kicscar@gmail.com";
	}
	
}
