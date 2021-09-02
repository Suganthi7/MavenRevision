package org.unitj;

import java.io.IOException;

import org.base.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class AssertJunit extends BaseClass {
	@BeforeClass
	public static void launch() {
		chromeBrowser();
		launchBrowser("https://en-gb.facebook.com/");
		maxBrowser();
		waitImplicit(20);

	}

	@Ignore
	@Test
	public void tc2() throws IOException {
		FbLoginPojo f = new FbLoginPojo();
		WebElement userTxt = f.getUserTxt();
		filltxtBox(userTxt, readFromExcel("Book1", 0, "TestData1", 1));
		String user = userTxt.getAttribute("value");
		Assert.assertEquals("Verify UserId", "Java", user);
		WebElement passTxt = f.getPassTxt();
		filltxtBox(passTxt, readFromExcel("Book1", 1, "TestData1", 1));
		String pass = passTxt.getAttribute("value");
		Assert.assertEquals("Verify Pass", "Selenium", pass);
		System.out.println("UserName and password Entered successfully");

	}

	@Test
	public void tc3() {
		String url = pageUrl();
		boolean result = url.contains("face");
		Assert.assertTrue("Verify the Url", result);
		System.out.println("Verify The Url" + url);
		String title = pageTitle();
		boolean result1 = title.startsWith("Face");
		Assert.assertTrue("verify Title", result1);
		System.out.println("Title of Page" + title);

	}

	@Before
	public void startTc() {
		getDate();

	}

	@After
	public void endTc() {
		getDate();
	}

	@AfterClass
	public static void end() {
		closeBrowser();

	}

}
