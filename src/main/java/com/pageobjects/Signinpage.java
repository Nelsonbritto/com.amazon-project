package com.pageobjects;


import java.util.Properties;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.basesetup.Base;
import com.utilitiessetup.Readproperty;

public class Signinpage extends Base {
	
	public Signinpage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	Properties prop;
	public void email() {
		Readproperty prop = new Readproperty();
		String email = prop.prop("email");
		type(element("xpath", "//input[@type='email']"), email);
		click(element("xpath", "//input[@type='submit']"));
	}
	
	public void password() {
		Readproperty prop = new Readproperty();
		String pw = prop.prop("password");
		type(element("xpath", "//input[@type='password']"), pw);
		click(element("xpath", "//input[@type='submit']"));
	}

}
