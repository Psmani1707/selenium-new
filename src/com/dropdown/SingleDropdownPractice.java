package com.dropdown;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class SingleDropdownPractice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\SeliniumCourse\\SeleniumTesting"
				+ "\\Drives\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement btn = driver.findElement(By.xpath("// a[text( ) ='Create New Account']"));
		
		btn.click();
		
		Thread.sleep(4000);
		
		WebElement date = driver.findElement(By.xpath("//select [@name ='birthday_day']"));
		
		Select s1 = new Select (date);
		
		s1.selectByValue("10");
		
		boolean check1 = s1.isMultiple();
		 
		System.out.println(check1);
		
		System.out.println("**************************************************************");
		
		List<WebElement> list1 = s1.getOptions();
		
		for (WebElement it : list1) {
		
		String text = it.getText();
		
		System.out.println(text);
			
		}
		
		WebElement month = driver.findElement(By.xpath("//select[@name = 'birthday_month']"));
		
		Select s2 = new Select(month);
		
		s2.selectByValue("7");	
		
		WebElement year = driver.findElement(By.xpath("//select[@name = 'birthday_year']"));
		
		Select s3 = new Select (year);
		
		s3.selectByValue("1995");
		
	


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
