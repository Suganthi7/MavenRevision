package org.testngnew;

import org.testng.annotations.Test;

public class ParellelTestng2 {
	@Test
	private void tc11() {
		System.out.println("tc11:  "+Thread.currentThread().getId());
		

	}
	@Test
	private void tc22() {
		System.out.println("tc22:  "+Thread.currentThread().getId());
		

	}
	
	@Test
	private void tc33() {
		System.out.println("tc33:  "+Thread.currentThread().getId());
		

	}

}
