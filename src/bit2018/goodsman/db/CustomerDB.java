package bit2018.goodsman.db;

import bit2018.goodsman.data.Customer;

public class CustomerDB {
	void insert() {
		Customer c = new Customer();
		
		//public은 다른패키지(외부)접근 O
		c.name = "안대혁";
		
		//protected는 다른패키지(외부)접근 X
		//c.phone = "0000-0000-0000";
		
		//private은 다른패키지(외부)접근 X
		//c.email = "kickscar@gmail.com";
		
	}
}
