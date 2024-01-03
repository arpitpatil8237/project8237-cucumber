package org.testNGEx;

import org.testng.annotations.Test;

public class PrioritiesEx {
	@Test(priority = -10)
	public void login() {
		System.out.println("LogIn");
	}

	@Test(priority = 0)
	public void CustomerCreate() {
		System.out.println("Capital Customer Create");
	}

	@Test(priority = 0)
	public void customerCreate() {
		System.out.println("Small Customer create");

	}

	@Test(priority = 'Z')
	public void Logout() {
		System.out.println("LogOut");
	}

	@Test(priority = 20)
	public void CustomerUpdate() {
		System.out.println("Capital Customer Update");
	}

	@Test(priority = 40)
	public void DeleteCustomer() {
		System.out.println("Capital Delete Customer ");
	}

	@Test(priority = 40)
	public void deleteCustomer() {
		System.out.println("small delete Customer");
	}

}
