package com.usa.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/sarderahmed/eclipse-workspace/Amra/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//intput[@id='twotabsearchtextbox']")).sendKeys("mohammad alam");
		driver.findElement(By.xpath("//input[@class='nav-input']")).click();
		
		


	}

}
