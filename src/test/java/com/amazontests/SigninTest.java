package com.amazontests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.basesetup.Base;
import com.pageobjects.HomePage;
import com.pageobjects.Signinpage;
import com.utilitiessetup.Readproperty;

public class SigninTest extends Base{
	
	@BeforeTest
	public void startapp() {
		
	       Readproperty prop = new Readproperty();
	       String browser = prop.prop("browser");
	       String url = prop.prop("url");
	       setup(browser, url);
	}
	@AfterTest
	public void closeapp() {
		quiet();
	}
	
	@Test
	public void signin() {
		
		HomePage home = new HomePage(driver);
		Signinpage signin = home.signin();
		signin.email();
		signin.password();
		
	}

}
