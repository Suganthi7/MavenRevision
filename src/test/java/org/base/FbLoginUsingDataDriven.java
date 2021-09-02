package org.base;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FbLoginUsingDataDriven extends BaseClass {
	public static void main(String[] args) throws IOException, InterruptedException {
//		chromeBrowser();
//		launchBrowser("https://en-gb.facebook.com/");
//		maxBrowser();
//		waitImplicit(10);
//		
////		WebElement txtEmail = driver.findElement(By.id("email"));
////		filltxtBox(txtEmail, readFromExcel("excelworkread", 0, "sheet1", 0));
////		
////		WebElement txtPass = driver.findElement(By.id("pass"));
////		filltxtBox(txtPass, readFromExcel("excelworkread", 0, "sheet1", 1));
//		
//		WebElement btnCreateNew = driver.findElement(By.xpath("//a[text()='Create New Account']"));
//		btnclick(btnCreateNew);
//		 WebElement daySele = driver.findElement(By.xpath("//select[@id='day']"));
//		 selectUsingIndex(daySele, 6);
//		 threadWait(5000);
//		 selectUsingvalue(daySele, "9");
//		 threadWait(5000);
//		 selectUsingVisibleText(daySele, "3");
//		 multipleSelectOption(daySele);
//		 optionGetUsingSelect(daySele);
		
		
		chromeBrowser();
		launchBrowser("http://demo.guru99.com/test/write-xpath-table.html");
		maxBrowser();
		totalNoTable();
		allDataIterateInTableWithLoop();
		fetchSingleDataInTable(1, 1);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
