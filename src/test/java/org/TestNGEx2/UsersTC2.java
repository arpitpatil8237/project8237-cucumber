package org.TestNGEx2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UsersTC2 {
	@BeforeTest
	public void getUATDetails() {
		System.out.println("**Intialize Objects for Users 2**");
	}

	@AfterTest
	public void clearTheUATEnvironment() {
		System.out.println("**Clear The objects 2**");
	}

  @Test
  public void addUsersTC() {
	  System.out.println(" User create 2");
  }
  @Test
  public void searchUsersTC() {
	  System.out.println("Search Existing Users 2");
  }
  @Test (priority=3)
  public void deleteUsersTC() {
	  System.out.println(" User Deleted 2");
  }
}
