package com.selenium.basic;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Webtable_Concepts {
		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\suba\\eclipse-workspace\\Selenium_Basic\\driver\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			System.out.println("=======All Data======");
			List<WebElement> alldata = driver.findElements(By.xpath("//*[@id=\"customers\"]"));
			for (WebElement data : alldata) {
				System.out.println(data.getText());
				
			System.out.println("======Particular Data======");
			List<WebElement> particularrow = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr[3]//td[3]"));
			for (WebElement row : particularrow) {
				System.out.println(row.getText());				
			}
			}
		}	
}
