package org.testngnew;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestngSoftAssert extends BaseClass{
	SoftAssert s;
	@BeforeClass(groups= {"smoke","sanity","regression"})
	private void launch() {
		chromeBrowser();
		launchBrowser("https://www.flipkart.com/");
	maxBrowser();
}
	@Test(groups= {"smoke","sanity"})//or operator
	private void tc1() throws IOException {
		
		s=new SoftAssert();
		
    FlipcartPojo  f=new FlipcartPojo();
	WebElement user = f.getUserTxt();
	filltxtBox(user,readFromExcel("Book1", 0, "Testdata1", 0) );
	s.assertEquals(user.getAttribute("value"), "Python", "Check email Address");
	
	WebElement pass= f.getPassTxt();
	filltxtBox(pass, readFromExcel("Book1", 1, "Testdata1", 0));
	s.assertEquals(pass.getAttribute("value"),"Green", "Check the Password");
	
	s.assertAll();
	System.out.println("Both User name and password Entered");
}

@Test(groups= {"regression,smoke"})//And Operator
private void tc2() {
	
	s=new SoftAssert();
	String title = pageTitle();
	s.assertTrue(title.startsWith("Online"), "Verify Title");
	String url = pageUrl();
	s.assertTrue(url.endsWith(".com/"), "Verify URl");
	s.assertAll();
	
	
	
	

}
		
	}
	


