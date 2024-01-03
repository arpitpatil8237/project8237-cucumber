package org.assertionPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void testMethod1() {
		System.out.println("testMethod1 Starts");
		int a = 10;
		Assert.assertEquals(a, 10);
		Assert.assertTrue(a == 10);//a==10 is condition
		Assert.assertEquals(a, 10,"A is different than Expected");
		Assert.assertEquals(a, 10,"A is not equal to Expected ");
		String str2="Pune";
//		System.out.println(str2.charAt(3));
		Assert.assertEquals(str2, "Pune","str2 not contains expected");
		System.out.println("testMethod1 Ends");
	}

	@Test
	public void testMethod2() {
		System.out.println("testMethod2 Starts");
		String str = "Mumbai";
		Assert.assertEquals(str, "Mumbai");

		System.out.println("testMethod2 Ends");

	}
}
