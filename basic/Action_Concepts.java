package com.selenium.basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Concepts {

		public static void main(String[] args) throws InterruptedException, AWTException {
			
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\suba\\eclipse-workspace\\Selenium_Basic\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			WebElement Gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
			
			Actions ac = new Actions(driver);
			ac.contextClick(Gmail).build().perform();
			Thread.sleep(3000);
			
			Robot rc = new Robot();
			rc.keyPress(KeyEvent.VK_DOWN);
			rc.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			
			rc.keyPress(KeyEvent.VK_DOWN);
			rc.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			
			rc.keyPress(KeyEvent.VK_ENTER);
			rc.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			
		}
}
