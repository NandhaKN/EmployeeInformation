package org.redbus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rb {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nandhakumar S\\Documents\\eclipse projects\\SeleniumBasic\\Driver\\chromedriver.exe");
		
		WebDriver r = new ChromeDriver();
		
		r.get("https://www.redbus.in/");
		r.manage().window().maximize();
		
		WebElement txtFrom = r.findElement(By.id("src"));
		
		txtFrom.sendKeys("vellore");
		
WebElement txtDest = r.findElement(By.id("dest"));
		
		txtDest.sendKeys("Chennai");
		
WebElement txtDate = r.findElement(By.id("onward_cal"));
		
		txtDate.sendKeys("Date");
		
		
		
		
		
}
}
