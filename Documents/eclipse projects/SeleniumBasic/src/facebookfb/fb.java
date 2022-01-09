package facebookfb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nandhakumar S\\Documents\\eclipse projects\\SeleniumBasic\\Driver\\chromedriver.exe");
	
	WebDriver d = new ChromeDriver();
		
		d.get("http://www.greenstechnologys.com/");
		d.manage().window().maximize();
		
		
		
		
		//d.close();
		//d.quit();
		
		
		
		
		
	
	
	
	}

}
