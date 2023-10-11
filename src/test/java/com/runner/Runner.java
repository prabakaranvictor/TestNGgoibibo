package com.runner;



import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Base.Base_Class;
import com.utility.PageObjectManager;

public class Runner extends Base_Class {
   
	PageObjectManager pom = new PageObjectManager();
	
    @BeforeSuite
	private void BrowserLaunch() throws IOException {
		browserLaunch(pom.getc().getABrowser());
	}
	
    @BeforeTest
    private void UrlLaunch() {
	    urlLaunch(pom.getc().getAUrl());
	
    }
 
    @BeforeClass
    private void DeleteAllCookies() {
    	driver.manage().deleteAllCookies();
    }
   
    @BeforeMethod
    private void waitmethod() {
    	implicitWait();
    }
    
    @Test(priority=1)
       
    private void LoginPage() throws InterruptedException {
		
      clickElement(pom.getpom().getMobile_Number());
      inputElement(pom.getpom().getMobile_Number(),pom.getc().getAMobileNo());
      clickElement(pom.getpom().getContinue_btn());
      
    
	}


	@Test(priority=2)
	
	private void ChooseAOutStationOneWayCab()  {
		
		clickUsingJSE(pom.getpom1().getCab_btn());
		clickElement(pom.getpom1().getPickup_Location());
		inputElement(pom.getpom1().getPickup_Location(),pom.getc().getApickuplocation());
		clickElement(pom.getpom1().getPickup_LocationSelect());
		clickElement(pom.getpom1().getDrop_Location());
		inputElement(pom.getpom1().getDrop_Location(), pom.getc().getAdroplocation());
		clickElement(pom.getpom1().getDrop_LocationSelect());
		clickElement(pom.getpom1().getPickup_Date());
		clickElement(pom.getpom1().getPickup_Date_Select());
		clickElement(pom.getpom1().getPickup_Time());
		clickElement(pom.getpom1().getPickup_Time_Select());
		clickElement(pom.getpom1().getSearchCab_btn());
	
	}

	@Test(priority=3)
	private void SelectACars() {
		
		clickElement(pom.getpom2().getIndica_WagonR());
	
		}
	
	@AfterMethod
	private void screenshot() {
			screenshot("cabbooking");
		}
		
	@AfterClass
	private void AfterDeleteAllCookies() {
			driver.manage().deleteAllCookies();
		}
		
	@AfterSuite
	private void browserclose() {
		   exit();
		}
}


