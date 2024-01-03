package org.TestNGEx2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AccountsTc2 {
	@BeforeTest
	public void getDevDetails() {
		System.out.println("**Before Test 2**");

	}

	@AfterTest
	public void clearTheDevEnvironment() {
		System.out.println("**After Test 2**");
	}

	@Test
	public void addAccountTC() {
		System.out.println(" Account created 2");
	}

	@Test
	public void searchAccountTC() {
		System.out.println("Search Existing Accounts 2");
	}

	@Test(priority = 3)
	public void deleteAccountTC() {
		System.out.println(" Account Deleted 2");
	}
}
