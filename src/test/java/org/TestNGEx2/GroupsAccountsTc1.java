package org.TestNGEx2;

import org.testng.annotations.Test;

public class GroupsAccountsTc1 {

	@Test (groups= {"sanity"})
	public void addAccountTC() {
		System.out.println(" Account created ");
	}

	@Test (groups={"smoke","Regression","sanity"})
	public void searchAccountTC() {
		System.out.println("Search Existing Accounts");
	}

	@Test(priority = 3,groups={"Regression"})
	public void deleteAccountTC() {
		System.out.println(" Account Deleted ");
	}
}
