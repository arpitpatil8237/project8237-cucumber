package org.TestNGEx3;

import org.testng.annotations.Test;
public class GroupsUsersTC1 {

	@Test(groups={"smoke"})
	public void addUsersTC() {
		System.out.println(" User create ");
	}

	@Test (groups={"smoke","Regression","sanity"})
	public void searchUsersTC() {
		System.out.println("Search Existing Users ");
	}

	@Test(priority = 3)
	public void deleteUsersTC() {
		System.out.println(" User Deleted ");
	}
}
