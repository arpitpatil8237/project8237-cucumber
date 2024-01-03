package org.TestNGEx2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CustomersTC2 {

	@BeforeTest
	public void getQADetails() {
		System.out.println("**Before Test 2**");
	}

	@AfterTest
	public void clearTheQAEnvironment() {
		System.out.println("**After Test 2**");
	}

	@Test
	public void addCustomersTC() {
		System.out.println(" Customer create 2");
	}
	@Test
	public void searchCustomersTC() {
		System.out.println("Search Existing Customer 2");
	}
	@Test (priority=3)
	public void deleteCustomersTC() {
		System.out.println(" Customer Deleted 2");
	}
}
