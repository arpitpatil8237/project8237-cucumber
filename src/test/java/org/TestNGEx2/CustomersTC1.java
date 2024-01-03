package org.TestNGEx2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class CustomersTC1 {
  
  @BeforeClass
  public void getcustomerTestData() {
	  System.out.println("***Create Object For Customers 1***");
  }

  @AfterClass
  public void clearCustomerTetData() {
	  System.out.println("***Clear the Objects 1***");
  }
  @Test
  public void addCustomerTC() {
	  System.out.println(" User Customer 1");
  }
  @Test
  public void searchUsersustomerTC() {
	  System.out.println("Search Existing Customer 1");
  }
  @Test (priority=3)
  public void deleteCustomerTC() {
	  System.out.println(" Customer Deleted 1");
  }
}
