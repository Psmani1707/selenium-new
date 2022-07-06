package com.browerlaunch;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserlaunchPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\SeliniumCourse\\SeleniumTesting"
				+ "\\Drives\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bitcoiva.com/login");
		
		driver.manage().window().maximize();
		
		

	}

}
