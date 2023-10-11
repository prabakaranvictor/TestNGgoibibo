package com.pom;

public interface ChooseOutStationOneWayCab_Interface {

	String Cab_btn_xpath ="//p[text()='Cabs']";
	
	String Pickup_Location_CSS = "#downshift-1-input";
	
	String Pickup_LocationSelect_xpath = "//p[text()='Chennai, Tamil Nadu, India']";
	
	String Drop_Location_id = "downshift-2-input";

	String Drop_LocationSelect_xpath = "//p[text()='Bangalore, Karnataka, India']";
	
	String Pickup_Date_xpath = "//label[text()='Pickup Date']";
	
	String Pickup_Date_Select_xpath = "//span[@class='leftactive']";
	
	String Pickup_Time_xpath ="//label[text()='Pickup Time']";
	
	String Pickup_Time_Select_xpath ="//span[text()='03:00 AM']";
	
	String SearchCab_btn_xpath  ="//button[text()='SEARCH CABS']";
	
}
