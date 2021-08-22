package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Concepts {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\suba\\eclipse-workspace\\Selenium_Basic\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement singleframe = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(singleframe);
		
		WebElement textbox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		textbox.sendKeys("Suba");
		Thread.sleep(3000);
		
		driver.switchTo().parentFrame();
		
		WebElement iframe = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		iframe.click();
		Thread.sleep(3000);
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
		driver.switchTo().frame(outerframe);
		WebElement innerframe = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		driver.switchTo().frame(innerframe);
		
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("shini");
	}
}