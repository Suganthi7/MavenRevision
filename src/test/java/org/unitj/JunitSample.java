package org.unitj;

import java.io.IOException;
import java.util.Date;

import org.base.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class JunitSample extends BaseClass {

	@BeforeClass
	public static void launch() {
		chromeBrowser();
		launchBrowser("https://en-gb.facebook.com/");
		maxBrowser();
	}

	@Before
	public void startDate() {
		Date d = new Date();
		System.out.println(d);

	}

	@Test
	public void tc1() throws IOException, InterruptedException {
		FbLoginPojo f = new FbLoginPojo();

		filltxtBox(f.getUserTxt(), readFromExcel("Book1", 0, "TestData1", 0));
		threadWait(2000);
		filltxtBox(f.getPassTxt(), readFromExcel("Book1", 1, "TestData1", 0));
		System.out.println("success");

	}

	@After
	public void endDate() {
		Date d = new Date();
		System.out.println(d);

	}

	@AfterClass
	public static void end() {
		closeBrowser();

	}

}
