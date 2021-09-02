package org.testngnew;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RerunExamples {
	@Test
	private void tc1() {
		Assert.assertTrue(false, "Check tc1 again");
		System.out.println("Test1");

	}
	@Test
	private void tc2() {
		Assert.assertTrue(false, "Check Tc2 Again");
		System.out.println("Test2");

	}
	@Test
	private void tc3() {
		Assert.assertTrue(false, "Check Tc3 Again");
		System.out.println("Test3");

	}


}
