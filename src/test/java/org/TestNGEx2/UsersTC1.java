package org.TestNGEx2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class UsersTC1 {
 
  @BeforeClass
  public void getUsersTestDAta() {
	  System.out.println("***Intialize Objects for Users 1***");
  }

  @AfterClass
  public void clearUsersTestData() {
	  System.out.println("***Clear The objects 1***");
  }
  @Test
  public void addUsersTC() {
	  System.out.println(" User create 1");
  }
  @Test
  public void searchUsersTC() {
	  System.out.println("Search Existing Users 1");
  }
  @Test (priority=3)
  public void deleteUsersTC() {
	  System.out.println(" User Deleted 1");
  }
}
