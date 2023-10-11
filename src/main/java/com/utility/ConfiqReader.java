package com.utility;

public class ConfiqReader {
	
	 PropertyReader cr = new PropertyReader();
		
		public  String getABrowser() {
			String property = cr.getAPropertyFile().getProperty("Browser");
			return property;
			}
		
		public String getAUrl() {
			String property = cr.getAPropertyFile().getProperty("url");
			return property;
		}
		public String getAMobileNo() {
			String property = cr.getAPropertyFile().getProperty("mobileNo");
			return property;
		}
		
		public String getApickuplocation() {
			String property = cr.getAPropertyFile().getProperty("pickuplocation");
			return property;
		}
		
		public String getAdroplocation() {
			String property = cr.getAPropertyFile().getProperty("droplocation");
			return property;
		}
		

}
