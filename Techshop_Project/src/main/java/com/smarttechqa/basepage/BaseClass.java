package com.smarttechqa.basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass { 
	
	public static void setUp() {
		
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.smarttechqa.com/login");
		
	//driver.findElement(By.id("email")).sendKeys("testuser@email.com");
	
	driver.findElement(By.xpath("//*[@type='email']")).sendKeys("testuser@email.com");
	
	//driver.findElement(By.id("password")).sendKeys("123456");
	
	driver.findElement(By.cssSelector("#Password")).sendKeys ("123456");
	
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	
	//System.out.println(driver.getTitle());//to verify to log in 
	//driver.quit();
	System.out.println("This application name is :"+driver.getTitle());
	driver.quit();
	
	
	
	}
	
	public static void main(String[] args) {
		BaseClass.setUp();
		
	}

}