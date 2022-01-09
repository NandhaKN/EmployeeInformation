package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {
	private static WebElement webElement ;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nandhakumar S\\Documents\\eclipse projects\\SeleniumBasic\\Driver\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		
		WebElement txtuser = d.findElement(By.id("email"));
		txtuser.sendKeys("snandha99@gmail.com");
		
		WebElement txtpass = d.findElement(By.id("pass"));
		txtpass.sendKeys("nandha10");
		
		WebElement LoginButton = d.findElement(By.name("login"));
		LoginButton.click();
		
	
		
		//d.close();
		//d.quit();
	}

}
