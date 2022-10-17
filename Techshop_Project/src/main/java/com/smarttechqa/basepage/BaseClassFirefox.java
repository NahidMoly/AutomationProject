package com.smarttechqa.basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClassFirefox {
	
	public static void setUp() {
		
		System.setProperty("webDriver.gecko.driver", "./Driver/gekoDriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.mozilla.org/");
		driver.manage().window().maximize();
		driver.get("https://www.smarttechqa.com");
		
		
	}
	
	
	public static void main(String[] args) {
		BaseClassFirefox.setUp();
		
		
	}
	

}
