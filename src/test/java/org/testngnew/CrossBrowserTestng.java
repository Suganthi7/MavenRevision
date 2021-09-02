package org.testngnew;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTestng extends BaseClass{
	WebDriver driver;
	@Parameters("Browser")
	@Test
	private void tc(String browserName) {
		if (browserName.equals("Chrome")) {
			chromeBrowser();
			
		}
		else if (browserName.equals("FF")) {
			firefoxBrowser();
			
			
		}
		else {
			edgeBrowser();
		}
		
		launchBrowser("https://en-gb.facebook.com/");
		FbLoginPojo f=new FbLoginPojo();
		filltxtBox(f.getUserTxt(), "Green");
		filltxtBox(f.getPassTxt(), "Technology");
		
		
		
		

	}
	

}
