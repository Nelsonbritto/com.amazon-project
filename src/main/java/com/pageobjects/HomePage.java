package com.pageobjects;





import org.openqa.selenium.remote.RemoteWebDriver;


import com.basesetup.Base;

public class HomePage extends Base{
	
	public HomePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	
	
	public boolean logo() {
		
		
	return isenabled(element("xpath", "//a[@class='nav-logo-link nav-progressive-attribute']"));
		
	}
	
	public String address() {
		return gettext(element("id", "nav-global-location-slot"));
	}
	
	public Signinpage signin() {
		click(element("xpath", "(//span[@class='nav-line-1 nav-progressive-content'])[2]"));
		return new Signinpage(driver);
	}
	
	

}
