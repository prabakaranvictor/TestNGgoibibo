package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base_Class;

public class BooktACar extends Base_Class implements BookACar_Interface{
	
	public BooktACar() {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath=Indica_WagonR_xpath)
	private WebElement Indica_WagonR;

	public WebElement getIndica_WagonR() {
	return Indica_WagonR;
	}
}
