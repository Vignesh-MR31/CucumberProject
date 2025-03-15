package com.web.automation.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyLoader {
	
	public static Properties loadProperty() {
		Properties prop = new Properties();
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Application.properties");
		try {
			FileInputStream fileInput = new FileInputStream(file);
			try {
				prop.load(fileInput);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return prop;
	}

}
