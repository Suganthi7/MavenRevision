package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JavaScript extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		chromeBrowser();
		launchBrowser("http://www.greenstechnologys.com/");
		
		maxBrowser();
		threadWait(5000);
		waitImplicit(10);
		
		WebElement scrollDown = driver.findElement(By.xpath("//span[text()='Greens Technology Tambaram']"));
		scrollUpDown(true, scrollDown);
		
		threadWait(5000);
		
		WebElement scrollUp = driver.findElement(By.xpath("//u[text()='Greens Technologys Software Training Centers in Chennai']"));
		scrollUpDown(false, scrollUp);
		
		totalFrame();
		closeBrowser();
		
		chromeBrowser();
		launchBrowser("https://en-gb.facebook.com/");
		
		
		WebElement txtEmail = driver.findElement(By.id("email"));
		attributeSet("green", txtEmail);
		attributeGet("id",txtEmail);
		
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		
	    attributeSet("Technology", txtPass);
	    attributeGet("id",txtPass);
	    
	    WebElement btnLogin = driver.findElement(By.name("login"));
	    javaScriptClick(btnLogin);
	    
	                 
	    
	    
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
