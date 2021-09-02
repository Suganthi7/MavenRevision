package org.unitj;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FbLoginPojo extends BaseClass{
	
	public FbLoginPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement userTxt;
	
	@FindBy(id="pass")
	private WebElement passTxt;;
	
	
	
	@FindBy(name="login")
	private WebElement clkBtn;



	public WebElement getUserTxt() {
		return userTxt;
	}



	public WebElement getPassTxt() {
		return passTxt;
	}



	public WebElement getClkBtn() {
		return clkBtn;
	}
	
	
	
	
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement forgetPassword;

	public WebElement getForgetPassword() {
		return forgetPassword;
	}
	
	
	@FindBy(xpath="//a[text()='Create New Account']")
	private WebElement createNewAccount;

	public WebElement getCreateNewAccount() {
		return createNewAccount;
	}
	
	
	
	
	
	
	
	

}
