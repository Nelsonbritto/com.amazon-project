package com.basesetup;

import org.openqa.selenium.WebElement;

public interface ActionInterface {
	public void setup(String browser, String url);
	public void quiet();
	public WebElement element(String locator, String value);
	
	public void click(WebElement ele);
	public void type(WebElement ele, String text);
	public boolean isenabled(WebElement ele);
	public void isdisplayed(WebElement ele);
	public void isselected(WebElement ele);
	public void select(WebElement ele);
   public String gettext(WebElement ele);
	
	

}
