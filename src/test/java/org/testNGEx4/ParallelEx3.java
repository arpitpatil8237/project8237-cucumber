package org.testNGEx4;

import org.testng.annotations.Test;
import org.utilities.BaseUtility;

public class ParallelEx3 {
	@Test
	public void flipkart() {
		System.out.println("flipkart Starts");
		BaseUtility bu = new BaseUtility();
		bu.StartUp("ch", "https://www.flipkart.com/");
		//perform the operation using Local WebDriver driver here only
		System.out.println("flipkart Ends");
	}
	
}
