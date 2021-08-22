package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Style {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\suba\\eclipse-workspace\\Selenium_Basic\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/?lang=en");
		driver.manage().window().maximize();
		Thread.sleep(3000);
			
		WebElement Link = driver.findElement(By.xpath("(//div[contains(@class,'css')])[13]"));
		Link.click();
		Thread.sleep(3000);
		
		WebElement username = driver.findElement(By.xpath("(//input[contains(@class,'30o5oe ')])[1]"));
		username.sendKeys("subashini");
		Thread.sleep(3000);
		
		WebElement psw = driver.findElement(By.xpath("(//input[contains(@class,'30o5oe ')])[2]"));
		psw.sendKeys("suba");
		Thread.sleep(3000);
		
		WebElement login = driver.findElement(By.xpath("//span[text()='Log in']"));
		login.click();
	}
}
