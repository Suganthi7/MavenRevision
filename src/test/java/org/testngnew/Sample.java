package org.testngnew;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class Sample extends BaseClass {
	@BeforeClass(alwaysRun=true)
	private void launch() {
		chromeBrowser();
       launchBrowser("https://en-gb.facebook.com/");
		
		maxBrowser();
		}
	@AfterClass
	private void end() {
		closeBrowser();
	}
	@BeforeMethod
	private void startTc() {
		getDate();

	}
	@AfterMethod
	private void endTc() {
		getDate();

	}
	//Default priority is zero
	@Test(groups= {"sanity","smoke"})
	private void tc1() throws IOException {
		
		FbLoginPojo f=new FbLoginPojo();
		
		filltxtBox( f.getUserTxt(), readFromExcel("Book1", 0, "TestData1", 0));
		filltxtBox(f.getPassTxt(), readFromExcel("Book1", 1, "TestData1", 0));
		System.out.println("user Id is"+textAttribute(f.getUserTxt(), "value"));
		cellWriteToExcel("Book1", "TestData1", 0, 4, textAttribute(f.getUserTxt(), "value"));
		
		
		

	}
	
	@Test(priority=20,groups="smoke")
	private void tc2() throws IOException {
		launchBrowser("https://en-gb.facebook.com/");
		FbLoginPojoNew f=new FbLoginPojoNew();
		filltxtBox(f.getUserTxt(),  readFromExcel("Book1", 0, "TestData1", 1));
		filltxtBox(f.getTxtPass(), readFromExcel("Book1", 1, "TestData1", 1));
		refreshPage();

	}
	
	@Test(priority=-30,enabled=false)
	private void tc3() throws IOException {
		FbLoginPojoNew f=new FbLoginPojoNew();
		filltxtBox(f.getUserTxt(),  readFromExcel("Book1", 0, "TestData1", 0));
		filltxtBox(f.getTxtPass(), readFromExcel("Book1", 1, "TestData1", 0));
		refreshPage();
	}
	

	

}
