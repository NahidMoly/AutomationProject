package com.smarttechqa.basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClassFirefox {
	
	public static void setUp() {
		
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
	}
	

}
