package org.assertionPractice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx {
	@Test
	public void Method1() {
		SoftAssert sa = new SoftAssert();
		System.out.println("Method1 Starts");
		int a = 10;
		sa.assertEquals(a, 10, "A is Not 10");
		sa.assertTrue(a == 10, "A is NOT 10");
		String str2 = "Pune";
		sa.assertEquals(str2, "Pune", "str2 Not contains Pune");
		sa.assertAll();
		System.out.println("Method1 Ends");
	}

	@Test
	public void Method2() {
		SoftAssert sa = new SoftAssert();
		System.out.println("Method2 Starts");
		int ar[] = {};
		sa.assertTrue(ar.length == 0, "Length of ar[] is NOT Zero ");

		String str2 = "Mumbai";
		sa.assertEquals(str2, "Mumbai", "str2 Not contains Mumbai");
		sa.assertAll();
		System.out.println("Method2 Ends");

	}
}
