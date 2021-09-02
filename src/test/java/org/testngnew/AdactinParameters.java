package org.testngnew;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdactinParameters extends BaseClass {
	@BeforeClass
	private void launch() {
		chromeBrowser();
		
		maxBrowser();

	}
	
	@BeforeMethod
	private void startTc() {
		getDate();

	}
	@AfterMethod
	private void endTc() {
	getDate();

	}
	
	@Parameters({"UserName","Password","InDate","OutDate","FirstName","LastName","Address","CCNum","Cvv"})
	@Test(enabled=false)
	private void tc1(String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9) throws InterruptedException, IOException {
		launchBrowser("https://adactinhotelapp.com/");
		AdactinPojoPage1 a=new AdactinPojoPage1();
		filltxtBox(a.getUserTxt(), s1);
		filltxtBox(a.getPassTxt(), s2);
		threadWait(2000);
		btnclick(a.getBtnLogin());
		
AdactinPojoPage2 a1 = new AdactinPojoPage2();
		
		selectUsingIndex(a1.getSelLoc(), 1);
		selectUsingIndex(a1.getSelHotel(), 1);
		selectUsingIndex(a1.getSelRoomType(), 1);
		selectUsingIndex(a1.getSelRoomNo(), 1);
		filltxtBox(a1.getSelDateIn(), s3);
		filltxtBox(a1.getSelDateOut(), s4);
		selectUsingIndex(a1.getAdultRoom(), 1);
		selectUsingIndex(a1.getChildRoom(), 1);
		btnclick(a1.getClickSearch());
		
		AdactinPage3Pojo a2=new AdactinPage3Pojo();
		
		btnclick(a2.getClickRadio());
		btnclick(a2.getClickContinue());
		
		AdactinPage4Pojo a3=new AdactinPage4Pojo();
		filltxtBox(a3.getFirstName(), s5);
		filltxtBox(a3.getLastName(), s6);
		filltxtBox(a3.getAddress(), s7);
		filltxtBox(a3.getCcNum(), s8);
		selectUsingIndex(a3.getCardType(), 1);
		selectUsingIndex(a3.getCardExpMonth(), 1);
		selectUsingIndex(a3.getCardExpYear(), 12);
		filltxtBox(a3.getCvvNumber(), s9);
		btnclick(a3.getBookNow());
		
		//AdactinPage5Pojo a4=new AdactinPage5Pojo();
		//System.out.println("ORDER ID"+textAttribute(a4.getOrderNo(), "value"));
	
		
		

    

	}
	@Parameters({"FlipcartName","FlipcartPwd"})
	@Test
	private void tc2(String s1,String s2) throws InterruptedException {
		FlipcartPojo f=new FlipcartPojo();
		launchBrowser("https://www.flipkart.com/");
		filltxtBox(f.getUserTxt(), s1);
		filltxtBox(f.getPassTxt(), s2);
		threadWait(5000);
		

	}
	
	
	
	

}
