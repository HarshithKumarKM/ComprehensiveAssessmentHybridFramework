package com.mindtree.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigRead {

	Properties prop;
	public ConfigRead() {
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
		System.out.println("Exception is: "+e.getMessage());
		}
	}
	
	public String getApplicationURL() {
		String url = prop.getProperty("baseURL");
		return url;
	}
	
	public String getChromeDriverPath() {
		String cpath = prop.getProperty("chromepath");
		return cpath;
	}
	
	public String getExcelDataPath() {
		String xlpath = prop.getProperty("excelDataPath");
		return xlpath;
	}
}
