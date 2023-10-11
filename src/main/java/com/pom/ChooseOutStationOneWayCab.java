package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base_Class;

public class ChooseOutStationOneWayCab extends Base_Class implements ChooseOutStationOneWayCab_Interface {

	public ChooseOutStationOneWayCab() {
		
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath= Cab_btn_xpath )
	private WebElement Cab_btn;
	
	
	@FindBy(css = Pickup_Location_CSS)
	private WebElement Pickup_Location;
	
	@FindBy(xpath= Pickup_LocationSelect_xpath)
	private WebElement Pickup_LocationSelect;
	
	@FindBy(id=Drop_Location_id)
	private WebElement Drop_Location;
	
	
	@FindBy(xpath=Drop_LocationSelect_xpath)
	private WebElement Drop_LocationSelect;
	
	
	@FindBy(xpath=Pickup_Date_xpath)
	private WebElement Pickup_Date;
	
	
	@FindBy(xpath= Pickup_Date_Select_xpath)
	private WebElement Pickup_Date_Select;
	
	@FindBy(xpath=Pickup_Time_xpath)
	private WebElement Pickup_Time;
	
	
	@FindBy(xpath=Pickup_Time_Select_xpath)
	private WebElement Pickup_Time_Select;
	
	
	@FindBy(xpath=SearchCab_btn_xpath)
	
	private WebElement SearchCab_btn;
	
	
	public WebElement getCab_btn() {
		return Cab_btn;
	}


	public WebElement getPickup_Location() {
		return Pickup_Location;
	}


	public WebElement getPickup_LocationSelect() {
		return Pickup_LocationSelect;
	}


	public WebElement getDrop_Location() {
		return Drop_Location;
	}


	public WebElement getDrop_LocationSelect() {
		return Drop_LocationSelect;
	}


	public WebElement getPickup_Date() {
		return Pickup_Date;
	}


	public WebElement getPickup_Date_Select() {
		return Pickup_Date_Select;
	}


	public WebElement getPickup_Time() {
		return Pickup_Time;
	}


	public WebElement getPickup_Time_Select() {
		return Pickup_Time_Select;
	}


	public WebElement getSearchCab_btn() {
		return SearchCab_btn;
	}

	
	

}
