package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

FileInputStream fi;
	
	public Properties getAPropertyFile() {
		
		File file = new File("C:\\Users\\ADMINE\\eclipse-workspace\\SeleniumBasics\\TestNG_goibibo\\src\\main\\java\\com\\utility\\PropertyFile.Properties");
	    
		try {
			fi = new FileInputStream(file);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		try {
			prop.load(fi);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		return prop;
		}
}

