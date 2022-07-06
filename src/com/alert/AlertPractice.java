package com.alert;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\SeliniumCourse\\SeleniumTesting"
				+ "\\Drives\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		Alert a1 = driver.switchTo().alert();
		
		a1.accept();
				
		driver.findElement(By.xpath("//a[text() = 'Alert with OK & Cancel ']")).click();
		
		driver.findElement(By.xpath("//button[@onclick = 'confirmbox()']")).click();
		
		Thread.sleep(4000);
		
		Alert a2 = driver.switchTo().alert();
		
		a2.dismiss();
				
		driver.findElement(By.xpath("//a[text() = 'Alert with Textbox ']']")).click();
		
		driver.findElement(By.xpath("//button[@onclick = 'promptbox()']")).click();
		
		Alert a3 = driver.switchTo().alert();
		
		String text = a3.getText();
		
		System.out.println(text);
		
	
	}

}
