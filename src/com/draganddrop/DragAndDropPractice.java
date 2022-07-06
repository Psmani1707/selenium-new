package com.draganddrop;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class DragAndDropPractice {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\SeliniumCourse\\SeleniumTesting"
				+ "\\Drives\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/drop.html");
		
		driver.manage().window().maximize();
		
		WebElement from = driver.findElement(By.xpath("//div[@id = 'draggable']"));
		
		WebElement to = driver.findElement(By.xpath("//div[@id = 'droppable']"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(from, to).build().perform();
	}

}
