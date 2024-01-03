package org.testNGEx4;

import org.testng.annotations.Test;

public class ReportsEx2 {
	@Test
	public void CustomerCreate() {
		System.out.println("Capital Customer Create");
		int ar[]= {20,21,23,24};
		System.out.println("ar[5]= "+ar[5]);
		//just for understing, it gives Exception Last 2 Lines

	}

	@Test
	public void customerCreate() {
		System.out.println("Small Customer create");

	}

	@Test
	public void CustomerUpdate() {
		System.out.println("Capital Customer Update");
		String str="karanja";
		System.out.println("charAt: "+str.charAt(7));
		//just for understing, it gives Exception Last 2 Lines
	}
}
