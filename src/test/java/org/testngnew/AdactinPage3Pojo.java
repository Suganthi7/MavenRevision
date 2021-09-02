package org.testngnew;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AdactinPage3Pojo extends BaseClass {
	public AdactinPage3Pojo() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="radiobutton_0")
	private WebElement clickRadio;
	
	@FindBy(id="continue")
    private WebElement clickContinue;

	public WebElement getClickRadio() {
		return clickRadio;
	}

	public WebElement getClickContinue() {
		return clickContinue;
	}
	
	
}
