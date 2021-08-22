package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Concepts {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\suba\\eclipse-workspace\\Selenium_Basic\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/?lang=en");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement signup = driver.findElement(By.xpath("//span[text()='Sign up']"));
		signup.click();
		Thread.sleep(3000);
		
		WebElement Date = driver.findElement(By.id("SELECTOR_1"));
		Select s1 = new Select(Date);
		s1.selectByIndex(3);
		Thread.sleep(3000);
		
		WebElement Day = driver.findElement(By.id("SELECTOR_2"));
		Select s2= new Select(Day);
		s2.selectByValue("5");
		Thread.sleep(3000);
		
		WebElement Year = driver.findElement(By.id("SELECTOR_3"));
		Select s3 = new Select(Year);
		s3.selectByValue("2009");
		Thread.sleep(3000);
		
		
		driver.quit();
		
	}

}
