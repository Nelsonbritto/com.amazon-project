package com.amazontests;



import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.basesetup.Base;
import com.pageobjects.HomePage;
import com.utilitiessetup.Readproperty;

public class HomeTest extends Base {
	
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
	public void hometest() {
		HomePage home = new HomePage(driver);
		Assert.assertTrue(home.logo());
		System.out.println("logo verified");
		System.out.println(home.address());
		
	}

}
