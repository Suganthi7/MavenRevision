package org.testngnew;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPojoPage2 extends BaseClass {
	public AdactinPojoPage2() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement selLoc;
	
	
	@FindBy(id="hotels")
	private WebElement selHotel;
	
	@FindBy(id="room_type")
	private WebElement selRoomType;
	
	
	@FindBy(id="room_nos")
	private WebElement selRoomNo;
	
	@FindBy(id="datepick_in")
	private WebElement selDateIn;
	
	@FindBy(id="datepick_out")
	private WebElement selDateOut;
	
	@FindBy(id="adult_room")
	private WebElement adultRoom;
	
	@FindBy(id="child_room")
	private WebElement childRoom;
	
	
	public WebElement getSelLoc() {
		return selLoc;
	}


	public WebElement getSelHotel() {
		return selHotel;
	}


	public WebElement getSelRoomType() {
		return selRoomType;
	}


	public WebElement getSelRoomNo() {
		return selRoomNo;
	}


	public WebElement getSelDateIn() {
		return selDateIn;
	}


	public WebElement getSelDateOut() {
		return selDateOut;
	}


	public WebElement getAdultRoom() {
		return adultRoom;
	}


	public WebElement getChildRoom() {
		return childRoom;
	}


	public WebElement getClickSearch() {
		return clickSearch;
	}
	@FindBy(id="Submit")
	private WebElement clickSearch;

	

	
	
}
