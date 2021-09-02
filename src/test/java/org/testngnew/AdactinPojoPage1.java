package org.testngnew;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPojoPage1 extends BaseClass {
	public AdactinPojoPage1() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement userTxt;
	
	@FindBy(id="password")
	private WebElement passTxt;
	
	@FindBy(id="login")
	private WebElement btnLogin;

	public WebElement getUserTxt() {
		return userTxt;
	}

	public WebElement getPassTxt() {
		return passTxt;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	
	
	

}
