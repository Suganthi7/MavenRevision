package org.testngnew;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AdactinPage5Pojo extends BaseClass {
	public AdactinPage5Pojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_no")
	private WebElement orderNo;
	public WebElement getOrderNo() {
		return orderNo;
	}
	
	
	
	
		

}
