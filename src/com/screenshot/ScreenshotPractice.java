package com.screenshot;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.io.FileHandler;

public class ScreenshotPractice {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\SeliniumCourse\\SeleniumTesting"
				+ "\\Drives\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email"));
		
		WebElement email = driver.findElement(By.xpath("//*[@name='email']"));
		
		email.sendKeys("Psmanikandan123");
		
		WebElement pass = driver.findElement(By.xpath("//*[@name = 'pass']"));
		
		pass.sendKeys("Welcome@123");
		
		WebElement lbtn = driver.findElement(By.xpath("//*[@name = 'login']"));
		
		lbtn.click();
		
		Thread.sleep(3000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		
		
	}
}

