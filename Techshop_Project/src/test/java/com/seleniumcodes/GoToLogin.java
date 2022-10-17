package com.seleniumcodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoToLogin {
	
	public static void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/login");
		
		driver.findElement(By.id("firstName")).sendKeys("nu278892@gmail.com");
		
		
	}
	
	public static void main(String[] args) {
		GoToLogin.setUp();
		
		
		
		
		
		
	}

}
