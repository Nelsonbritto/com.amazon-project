package com.utilitiessetup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readproperty {

	

	public String prop(String key) {
		Properties property = new Properties();
		try {
			FileInputStream fis = new FileInputStream("./datas/config.properties");
			try {
				property.load(fis);
				return property.getProperty(key);
			} catch (IOException e) {
				
				e.printStackTrace();
				System.out.println("enter correct property file path");
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			System.out.println("pls check there has property file or not");
		}
		return null;
}
}
