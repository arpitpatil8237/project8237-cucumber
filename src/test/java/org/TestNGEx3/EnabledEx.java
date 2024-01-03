package org.TestNGEx3;

import org.testng.annotations.Test;

public class EnabledEx {
	  @Test (enabled=true)
	  public void addCustomerTC() {
		  System.out.println(" User Customer 1");
	  }
	  @Test (enabled=true)
	  public void searchUsersustomerTC() {
		  System.out.println("Search Existing Customer 1");
	  }
	  @Test (priority=3,enabled=false)
	  public void deleteCustomerTC() {
		  System.out.println(" Customer Deleted 1");
	  }
}
