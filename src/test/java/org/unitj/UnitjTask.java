package org.unitj;

import java.io.IOException;

import org.base.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UnitjTask  extends BaseClass{
	@BeforeClass
	public static void launch() {
		chromeBrowser();
		launchBrowser("https://en-gb.facebook.com/");
		maxBrowser();
		waitImplicit(20);
	}
	
	@AfterClass
	public static void close() {
		closeBrowser();
	}
	
	@Before
	public void startTc() {
		getDate();
		
	}
	
	
	@After
	public void endTc() {
		getDate();

	}
	
	@Test
	public  void login() throws IOException {
		
		FbLoginPojo f=new FbLoginPojo();
		
		filltxtBox(f.getUserTxt(),readFromExcel("excelworkread", 0, "sheet1", 0));
		
		filltxtBox(f.getPassTxt(), readFromExcel("excelworkread", 0, "sheet1", 1));
		btnclick(f.getClkBtn());
		
		
		
	}
	
	

}
