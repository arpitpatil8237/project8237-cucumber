package org.testNGEx4;

import org.testng.annotations.Test;
import org.utilities.BaseUtility;

public class ParallelEx2 {
	
	@Test
	public void demoQA() {
		System.out.println("demoQA Starts");
		BaseUtility bu = new BaseUtility();
		bu.StartUp("ch", "https://demoqa.com/");
		//perform the operation using Local WebDriver driver here only
		System.out.println("demoQA Ends");
	}
	@Test
	public void actiTime() {
		System.out.println("actiTime Starts");
		BaseUtility bu = new BaseUtility();
		bu.StartUp("ch", "http://localhost:90/login.do");
		//perform the operation using Local WebDriver driver here only
		System.out.println("actiTime Ends");
	}

}
