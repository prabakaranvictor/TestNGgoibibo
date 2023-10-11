package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base_Class;

public  class LoginPage extends Base_Class implements LoginPage_Interface {

	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(xpath= Mobile_Number_xpath)
		private WebElement Mobile_Number;
		
		@FindBy(xpath=Continue_btn_xpath)
		private WebElement Continue_btn;
		
		@FindBy (xpath =FullName_xpath)
		private WebElement FullName;
		
		@FindBy(xpath = EmailAddress_xpath)
		private WebElement EmailAddress;
		
		@FindBy(xpath= LetsGo_btn_xpath )
		private WebElement LetsGo_btn;
		
		public WebElement getMobile_Number() {
			return Mobile_Number;
		}

		public WebElement getContinue_btn() {
			return Continue_btn;
		}

		public WebElement getFullName() {
			return FullName;
		}

		public WebElement getEmailAddress() {
			return EmailAddress;
		}

		public WebElement getLetsGo_btn() {
			return LetsGo_btn;
		}
		;
	}

