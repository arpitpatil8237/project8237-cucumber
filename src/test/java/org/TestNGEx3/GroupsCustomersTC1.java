package org.TestNGEx3;

import org.testng.annotations.Test;
public class GroupsCustomersTC1 {

	@Test(groups={"smoke","Regression","sanity"})
	public void addCustomerTC() {
		System.out.println(" User Customer ");
	}

	@Test
	public void searchUsersustomerTC() {
		System.out.println("Search Existing Customer ");
	}

	@Test(priority = 3,groups= {"smoke"})
	public void deleteCustomerTC() {
		System.out.println(" Customer Deleted ");
	}
}
