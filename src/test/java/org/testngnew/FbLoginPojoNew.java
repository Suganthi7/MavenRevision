package org.testngnew;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPojoNew  extends BaseClass{
	
	public FbLoginPojoNew() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement userTxt;
	
	
	@FindAll({
		@FindBy(id="pass"),
		@FindBy(name="pass")
		
	})
	
	private WebElement txtPass;
	
	
	@FindAll({
		@FindBy(name="login"),
		@FindBy(xpath="//button[@type='submit']")
	})
	private WebElement loginBtn;


	public WebElement getUserTxt() {
		return userTxt;
	}


	public WebElement getTxtPass() {
		return txtPass;
	}


	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
	
	
	
	

}
