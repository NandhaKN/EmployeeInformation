package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class goog {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nandhakumar S\\Documents\\eclipse projects\\SeleniumBasic\\Driver\\chromedriver.exe");

		WebDriver g = new ChromeDriver();
		
		g.get("https://www.google.co.in/");
		
		g.manage().window().maximize();
		
		WebElement text = g.findElement(By.xpath("//*[@class='gLFyf gsfi']"));
		text.sendKeys("GreensTechnology");
		
		goog a = new goog();
		
		
		
		
		
		
	}

	private Object doubleClick(WebDriver g) {
		// TODO Auto-generated method stub
		return null;
	}

}
