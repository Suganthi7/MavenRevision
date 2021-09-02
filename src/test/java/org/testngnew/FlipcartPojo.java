package org.testngnew;


import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipcartPojo  extends BaseClass{
	public FlipcartPojo() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement userTxt;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passTxt;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement clicklogin;

	public WebElement getUserTxt() {
		return userTxt;
	}

	public WebElement getPassTxt() {
		return passTxt;
	}

	public WebElement getClicklogin() {
		return clicklogin;
	}
	

}
