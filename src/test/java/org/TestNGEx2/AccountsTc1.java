package org.TestNGEx2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AccountsTc1 {
	/*
	 * @BeforeSuite public void inItConfigDetails() {
	 * System.out.println("Before Suite 1");
	 * 
	 * }
	 * 
	 * @AfterSuite public void clearConfigDetails() {
	 * System.out.println("After Suite 1"); }
	 */
	@BeforeClass
	public void getAccountTestData() {
		System.out.println("***Initialize The Objects for Accounts 1***");
	}

	@AfterClass
	public void clearAccountTestData() {
		System.out.println("***Clear the Objects 1***");
	}

	@Test
	public void addAccountTC() {
		System.out.println(" Account created 1");
	}

	@Test
	public void searchAccountTC() {
		System.out.println("Search Existing Accounts1");
	}

	@Test(priority = 3)
	public void deleteAccountTC() {
		System.out.println(" Account Deleted 1");
	}
}
