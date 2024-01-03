package org.testNGEx;

import org.testng.annotations.Test;

public class SequenceEx {
	@Test
	public void login() {
		System.out.println("LogIn");
	}

	@Test
	public void CustomerCreate() {
		System.out.println("Capital Customer Create");
	}

	@Test
	public void customerCreate() {
		System.out.println("Small Customer create");

	}

	@Test
	public void CustomerUpdate() {
		System.out.println("Capital Customer Update");
	}

	@Test
	public void DeleteCustomer() {
		System.out.println("Capital Delete Customer ");
	}

	@Test
	public void deleteCustomer() {
		System.out.println("small delete Customer");
	}

	@Test
	public void Logout() {
		System.out.println("LogOut");
	}
}
