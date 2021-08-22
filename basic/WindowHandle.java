package com.selenium.basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandle {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\suba\\eclipse-workspace\\Selenium_Basic\\driver\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
		
			WebElement bestseller = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
			Actions ac = new Actions(driver);
			ac.contextClick(bestseller).build().perform();
			
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			
			WebElement mobiles = driver.findElement(By.xpath("(//a[text()='Mobiles'])[1]"));
			ac.contextClick(mobiles).build().perform();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			
			WebElement amazonpay = driver.findElement(By.xpath("(//a[text()='Amazon Pay'])[1]"));
			ac.contextClick(amazonpay).build().perform();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			
			WebElement fashion = driver.findElement(By.xpath("(//a[text()='Fashion'])[1]"));
			ac.contextClick(fashion).build().perform();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
						
			WebElement electronics = driver.findElement(By.xpath("(//a[text()=' Electronics '])[1]"));
			ac.contextClick(electronics).build().perform();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			
			Set<String> allnames = driver.getWindowHandles();
			
			for (String st : allnames) {
				System.out.println(st);
				String title = driver.switchTo().window(st).getTitle();
				System.out.println(title);											
			}
			
			String actualtitle = "Amazon Fashion: Clothing, Footwear and Accessories online for Men, Women and Kids\r\n";
			for (String st : allnames) {
				if (driver.switchTo().window(st).getTitle().equals(actualtitle)) {
					break;
				}
			}
	}
}
