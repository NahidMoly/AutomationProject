package com.smarttechqa.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGPractice {

	WebDriver driver;
	

	@BeforeMethod
	public void setUp() {

		WebDriverManager.chromedriver().setup();//this is using to make things easier.
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com/");
		
		
	}
//	@Test
//	public void login() {
//		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
//		//this for knowing
//		WebDriverManager.chromedriver().setup();//this is using to make things easier.
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://facebook.com/");
//		driver.findElement(By.id("email")).sendKeys("example@gmail.com");
//				
//	}
//	@Test
//	public void logout() {
//		
//		WebDriverManager.chromedriver().setup();//this is using to make things easier.
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://google.com/");
//		driver.findElement(By.name("q")).sendKeys("helloworld");
//		
//		
//	}
	public void googleSearch() {
		driver.findElement(By.name("q")).sendKeys("helloworld");
		
		}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	
	public void clickImageButton() {
		driver.findElement(By.linkText("Images")).click();
		
		
	}
	
	
}
