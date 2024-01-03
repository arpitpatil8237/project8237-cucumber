package org.testNGEx;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AnnotationsEx2 {
	@Test
	public void testMethod1() {
		System.out.println("* Test1 *");
	}

	@Test
	public void testMethod2() {
		System.out.println("* Test2 *");
	}

	@BeforeMethod
	public void logIn() {
		System.out.println("LOGIN");
	}

	@AfterMethod
	public void logOut() {
		System.out.println("LOGOUT");
	}

}
