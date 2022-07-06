package com.webdrivemethods;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodsPractice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\SeliniumCourse\\SeleniumTesting"
				+ "\\Drives\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://web.whatsapp.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.bitcoiva.com/login");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		String cu = driver.getCurrentUrl();
		
		System.out.println(cu);
		
		driver.navigate().refresh();
		
		//driver.close();
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
