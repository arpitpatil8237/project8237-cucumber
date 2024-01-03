package org.testNGEx4;

import org.testng.annotations.Test;
import org.utilities.BaseUtility;

public class ParallelEx1 {
	@Test
	public void google() {
		System.out.println("Google Starts");
		BaseUtility bu = new BaseUtility();
		bu.StartUp("ch", "https://www.Google.com");
		//perform the operation using Local WebDriver driver here only
		System.out.println("Google Ends");
	}
	@Test
	public void facebook() {
		System.out.println("facebook Starts");
		BaseUtility bu = new BaseUtility();
		bu.StartUp("ch", "https://www.facebook.com");
		//perform the operation using Local WebDriver driver here only
		System.out.println("facebook Ends");
	}

}
