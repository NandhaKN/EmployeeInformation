package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	

	private static WebElement webElement;


	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nandhakumar S\\Documents\\eclipse projects\\SeleniumBasic\\Driver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		driver.manage().window().maximize();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("CurrentUrl---->"+currentUrl);
		
		WebElement txtsign = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		txtsign.click();
		
		WebElement txtUser = driver.findElement(By.name("email"));
		txtUser.sendKeys("snandha99@gmail.com");
		
		WebElement txtcontinue = driver.findElement(By.id("continue"));
		txtcontinue.click();
		
		
		WebElement txtPass = driver.findElement(By.name("password"));
		txtPass.sendKeys("Nan@1510");
		
		WebElement txtsignIn = driver.findElement(By.id("signInSubmit"));
		txtsignIn.click();
		
		Thread.sleep(5000);
		//driver.close();
		//driver.quit();
		
	}

}
