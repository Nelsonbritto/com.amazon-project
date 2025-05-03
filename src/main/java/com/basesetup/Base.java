package com.basesetup;







import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.utilitiessetup.Readproperty;

public class Base implements ActionInterface {
	
		protected RemoteWebDriver driver;
		public WebDriverWait wait;
	
	
	public void setup(String browser, String url) {
	

	switch (browser.toLowerCase()) {
	case "chrome":
		driver = new ChromeDriver();
		break;
	case "firebox":
		driver = new FirefoxDriver();
		break;
	case "edge":
		driver = new EdgeDriver();
		break;

	default:
		System.out.println("pls enter correct browser in property file");
		break;
	}
	
	driver.manage().window().maximize();
	
	Readproperty prop = new Readproperty();
	int time = Integer.parseInt(prop.prop("timeout"));
	driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	wait = new WebDriverWait(driver, time);
	
	driver.get(url);
	
	
}
	
	public void quiet() {
		driver.quit();
	}

	
	public WebElement element(String locator, String value) {
		
		switch (locator.toLowerCase()){
		case "id": {
			
			return driver.findElement(By.id(value));
		}
     case "xpath": {
			
			return driver.findElement(By.xpath(value));
		}
		default:
			System.out.println("enter correct element");
		}
	
		return null;
	}
	

	
	public void click(WebElement ele) {
		try {
			ele.click();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

	
	public void type(WebElement ele, String text) {
		try {
			ele.sendKeys(text);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

	
	public boolean isenabled(WebElement ele) {
		
		try {
			return ele.isEnabled();
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		return false;
	
		
	}
	

	
	public void isdisplayed(WebElement ele) {
		
		
	}

	
	public void isselected(WebElement ele) {
		
		
	}

	
	public void select(WebElement ele) {
		
		
	}


	public String gettext(WebElement ele) {
		try {
			return ele.getText();
		} catch (Exception e) {
			
			e.printStackTrace();
			return null;
		}
	
	}
	}
	


