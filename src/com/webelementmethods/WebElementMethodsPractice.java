package com.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodsPractice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\SeliniumCourse\\SeleniumTesting"
				+ "\\Drives\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email"));
		
		
	
	}

}
