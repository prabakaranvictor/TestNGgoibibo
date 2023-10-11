package com.utility;

import org.openqa.selenium.WebDriver;

import com.pom.BooktACar;
import com.pom.ChooseOutStationOneWayCab;
import com.pom.LoginPage;



public class PageObjectManager {
	
	WebDriver driver;
	
	private ConfiqReader c;
	private LoginPage pom;
	private ChooseOutStationOneWayCab pom1;
	private BooktACar pom2;
	
	public ConfiqReader getc() {
		c = new ConfiqReader();
		return c;
	}
	
	
	public LoginPage getpom() 
    {
   	 pom = new LoginPage();
   	 return pom;
    } 

	public ChooseOutStationOneWayCab getpom1()
	{
		pom1 = new ChooseOutStationOneWayCab();
		return pom1;
	}
	
	public BooktACar getpom2() {
		pom2 = new BooktACar();
		return pom2;
	}
}
	