package com.cucumber.helper;

public class FileReaderManager {

	private FileReaderManager() {
	}
	
	public static FileReaderManager getInstance() {
		FileReaderManager fm = new FileReaderManager();
		return fm;
	}

	
	public ConfigurationReader getCrInstance() throws Throwable {
		ConfigurationReader cr = new ConfigurationReader();
		return cr;
	}
}
