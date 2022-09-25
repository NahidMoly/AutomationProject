package com.smarttechqa.basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClassEdge { 
	
	public static void setUp() {
		
		System.setProperty("webdriver.edge.driver", "./Driver/msedgedriver.exe.");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.smarttechqa.com/");//this one will show half browser
		//driver.close();
		
		}
	
	public static void main(String[] args) {
		BaseClassEdge.setUp();
		
	}
	
	
	

}
