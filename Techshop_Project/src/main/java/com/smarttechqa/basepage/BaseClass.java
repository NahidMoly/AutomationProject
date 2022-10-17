package com.smarttechqa.basepage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.smarttechqa.utils.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass { 
	//static variable inside the class
	//outside the method to use in different packages.
	public static WebDriver driver;
	
	public static void setUp() {
	WebDriverManager.chromedriver().setup();
	//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");//this is for interview	
	   //system is a class, setProperty is a method name| Chrome driver | location of driver
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();//this will delete all the session of previously done
	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	driver.get("https://www.smarttechqa.com/");

	
	/*	Utilities.getExplicitWait(driver.findElement(By.xpath("//a[@href='/cart']")),5);
	driver.findElement(By.xpath("//a[@href='/cart']")).click();
	//driver.findElement(By.linkText("Go Back")).click(); //this will take me back to the home page from the cart page
	driver.findElement(By.partialLinkText("Go")).click();
	
	
	
	
	driver.navigate().back(); //This takes to the previous page.
	driver.navigate().refresh(); //This will click on the refresh button and refreshes the page. 
	//driver.navigate().to("https://www.smarttechqa.com/"); //This is the same as the get method
	//driver.quit();
	//added comment for github pull*/
	
	
	
	
}

//public static void main(String[] args) throws InterruptedException, IOException {
//	
//	BaseClass.setUp();
//	                      
//}
}




	
	
	
	