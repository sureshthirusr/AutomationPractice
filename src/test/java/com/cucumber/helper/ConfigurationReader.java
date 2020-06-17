package com.cucumber.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
	
	public static Properties ps;

	public ConfigurationReader() throws Throwable {

		File f = new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\cucumber\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		ps = new Properties();
		ps.load(fis);

	}

	public String getBrowser() {
		String browserName = ps.getProperty("BrowserName");
		return browserName;
	}

	public String getUrl() {
		String url = ps.getProperty("Url");
		return url;
	}

}
