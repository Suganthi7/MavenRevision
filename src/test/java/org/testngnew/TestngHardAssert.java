package org.testngnew;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestngHardAssert  extends BaseClass{
	
	@BeforeClass
	private void launch() {
		chromeBrowser();
		launchBrowser("https://www.flipkart.com/");
		maxBrowser();

	}
	
	@Test()
	private void tc1() throws IOException {
		FlipcartPojo  f=new FlipcartPojo();
		WebElement user = f.getUserTxt();
		filltxtBox(user,readFromExcel("Book1", 0, "Testdata1", 0) );
		Assert.assertEquals(user.getAttribute("value"), "Python", "Check email Address");
		WebElement pass= f.getPassTxt();
		filltxtBox(pass, readFromExcel("Book1", 1, "Testdata1", 0));
		Assert.assertEquals(pass.getAttribute("value"),"Green", "Check the Password");
		System.out.println("Both User name and password Entered");

	}
	
	@Test
	private void tc2() {
		String title = pageTitle();
		Assert.assertTrue(title.startsWith("Online"), "Verify Title");
		String url = pageUrl();
		Assert.assertTrue(url.endsWith(".com/"), "Verify URl");
		
		
		
		

	}
	

}
