package com.javascriptexecutor;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorPractice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\SeliniumCourse\\SeleniumTesting"
				+ "\\Drives\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor jc = (JavascriptExecutor)driver;
		
		jc.executeScript("window.scrollBy(0,3000)","");
		
		Thread.sleep(4000);
		
		jc.executeScript("window.scrollBy(0,-2000)","");
		
		WebElement bottom = driver.findElement(By.xpath("//span[@class ='navFooterBackToTopText']"));
		
		jc.executeAsyncScript("arguments[0].click()", bottom);

	}

}
