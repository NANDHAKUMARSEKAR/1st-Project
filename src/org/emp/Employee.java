package org.emp;

public class Employee {
	
	private void empId() {
		System.out.println("empId is 1234 ");
	}	
		
	private void empName() {
		System.out.println("empName is nandha");
	}	
		
	private void empDob() {
		System.out.println("empDob is 11.11.95");
		
	}
	private void empPhone() {
		System.out.println("empPhone is 97777777");
	}
		
	private void empEmail()	{
		System.out.println("empEmail id is n12@gmail.com");
		
	}
	
	private void empAddress() {
		System.out.println("empAddress is karaikal");
	}
	
	public static void main(String[] args) {
		
		Employee c=new Employee();
		
	c.empId();
	c.empName();
	c.empDob();
	c.empPhone();
	c.empId();
	c.empAddress();
		
		
	

	}

}
