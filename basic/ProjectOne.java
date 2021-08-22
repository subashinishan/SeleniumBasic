package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ProjectOne {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\suba\\eclipse-workspace\\Selenium_Basic\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("ssubashini8");
		driver.findElement(By.id("password")).sendKeys("bashini.");
		driver.findElement(By.id("login")).click();
		WebElement location = driver.findElement(By.id("location"));
		Select st = new Select(location);
		st.selectByValue("Brisbane");
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select st1 = new Select(hotel);
		st1.selectByValue("Hotel Cornice");
		WebElement type = driver.findElement(By.id("room_type"));
		Select st2 = new Select(type);
		st2.selectByValue("Deluxe");
		WebElement nos = driver.findElement(By.id("room_nos"));
		Select st3 = new Select(nos);
		st3.selectByValue("4");
		WebElement datein = driver.findElement(By.id("datepick_in"));
		datein.clear();
		datein.sendKeys("10/07/2021");
		WebElement dateout = driver.findElement(By.id("datepick_out"));
		dateout.clear();
		dateout.sendKeys("11/07/2021");
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select st4 = new Select(adult);
		st4.selectByValue("2");
		WebElement clild = driver.findElement(By.id("child_room"));
		Select st5 = new Select(clild);
		st5.selectByValue("0");
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("first_name")).sendKeys("Subashini");
		driver.findElement(By.id("last_name")).sendKeys("S");
		driver.findElement(By.id("address")).sendKeys("Thanjavur");
		driver.findElement(By.id("cc_num")).sendKeys("1234567891023456");
		WebElement type1 = driver.findElement(By.id("cc_type"));
		Select st6 = new Select(type1);
		st6.selectByValue("MAST");
		WebElement expmth = driver.findElement(By.id("cc_exp_month"));
		Select st7 = new Select(expmth);
		st7.selectByValue("7");
		WebElement expyr = driver.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(expyr);
		s8.selectByValue("2022");
		driver.findElement(By.id("cc_cvv")).sendKeys("123");
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1000);", "");
		Thread.sleep(3000);
		WebElement itirnary = driver.findElement(By.id("my_itinerary"));
		itirnary.click();
		driver.findElement(By.id("check_all")).click();
		WebElement cancel = driver.findElement(By.name("cancelall"));
		cancel.click();
		driver.switchTo().alert().accept();
		driver.findElement(By.id("logout")).click();
		Thread.sleep(10000);
		driver.close();
		driver.quit();
	}
}
