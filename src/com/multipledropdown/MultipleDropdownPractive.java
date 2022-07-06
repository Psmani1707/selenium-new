package com.multipledropdown;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class MultipleDropdownPractive {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\SeliniumCourse\\SeleniumTesting"
				+ "\\Drives\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://output.jsbin.com/osebed/2/");
		
		driver.manage().window().maximize();
		
		WebElement fruits = driver.findElement(By.xpath("//select[@id ='fruits']"));
		
		Select sc1 = new Select (fruits);
		
		boolean check = sc1.isMultiple();
		
		System.out.println(check);
		
		System.out.println("**********************************************");
		
		List<WebElement> list1 = sc1.getOptions();
		
		for (WebElement it1 : list1) {
			
		String text = it1.getText();
		
		System.out.println(text);
			
		}
		
		System.out.println("**************************************************");
		
		sc1.selectByValue("apple");
		
		sc1.selectByVisibleText("Grape");
		
	    System.out.println("****************************************************");
	    
	    List<WebElement> list2 = sc1.getAllSelectedOptions();
	    
	    for (WebElement it2 : list2) {
	    	
	    System.out.println(it2.getText());
			
		}
	    
	    System.out.println("******************************************************");
	    
	    WebElement list3 = sc1.getFirstSelectedOption();
		
	    System.out.println(list3.getText());
	    
	    sc1.deselectAll();
	
	}

}
