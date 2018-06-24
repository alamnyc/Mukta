package com.usa.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/sarderahmed/eclipse-workspace/Amra/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Actions a = new Actions (driver);
		WebElement move=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		a.moveToElement (move).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"))).click().keyDown(Keys.SHIFT).sendKeys("love you").build().perform();
		
		
		
		
		//a.moveToElement (move).build().perform();
		
		
		
		//WebElement move= driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		
		
		driver.findElement(By.xpath("//input[@class='nav-input']")).click();
	}

}
