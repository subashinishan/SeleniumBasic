package com.selenium.basic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Concept {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\suba\\eclipse-workspace\\Selenium_Basic\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File scrFile = ts.getScreenshotAs(OutputType.FILE);
		File desFile = new File("C:\\Users\\suba\\eclipse-workspace\\Selenium_Basic\\Screenshot\\ista.png");
		FileUtils.copyFile(scrFile, desFile);
		
	}

}
