package com.smarttechqa.basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchingBrowser {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	//	driver.findElement(By.xpath("//input[@class='Google Search']")).sendKeys("Zero");
	//	driver.findElement(By. xpath ("//input [@class='gLFyf gsfi']")).sendKeys("zero");
	
//		driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Zero");
		//driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).click();

		 //driver.findElement(By.xpath("(// input [@class='gNO89b'])[1]")).click();
		
		
		//WebElement dd= dr.findElement(By.xpath("// input [@class='gLFyf gsfi']"));
		//**webElement is a method where we are creating an object(dvr)
		//object is equals
		//dd.sendKeys("zero");
		// dd.sendKeys(Keys.ENTER);
		

	//	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
	
		 //finding the X path of search button and telling the key what to do.
		 
		 
		 
		 
	}

}
