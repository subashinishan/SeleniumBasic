package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	
	public static void main(String[] args) throws Throwable {
		
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\suba\\eclipse-workspace\\Selenium_Basic\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			WebElement first = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
			first.click();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			Thread.sleep(2000);

			WebElement second = driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[1]"));
			second.click();
			Thread.sleep(2000);
			driver.switchTo().alert().dismiss();
			Thread.sleep(2000);
			
			WebElement third = driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[2]"));
			third.click();
			Thread.sleep(2000);
			driver.switchTo().alert().sendKeys("Suba");
			driver.switchTo().alert().accept();	
	}

}
