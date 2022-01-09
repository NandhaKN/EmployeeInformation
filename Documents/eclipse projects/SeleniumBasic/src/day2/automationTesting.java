package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationTesting {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nandhakumar S\\Documents\\eclipse projects\\SeleniumBasic\\Driver\\chromedriver.exe");

		WebDriver g = new ChromeDriver();
		
		g.get("http://demo.automationtesting.in/Register.html");
		
		g.manage().window().maximize();
		
		WebElement firstName = g.findElement(By.xpath("//*[@placeholder='First Name']"));
		firstName.sendKeys("NandhaKumar");

		WebElement LastName = g.findElement(By.xpath("//*[@placeholder='Last Name']"));
		LastName.sendKeys("S");
		
		WebElement Address = g.findElement(By.xpath("//*[@ng-model='Adress']"));
		Address.sendKeys("Vellore-632113");
		
		
		WebElement Email = g.findElement(By.xpath("//*[@type='email']"));
		Email.sendKeys("snandha100@gmail.com");
		
		WebElement Phone = g.findElement(By.xpath("//*[@type='tel']"));
		Phone.sendKeys("8015543326");
		
		WebElement radio = g.findElement(By.xpath("//label[text()=' Male ']"));
		radio.click();
		
		WebElement checkbox = g.findElement(By.xpath("//*[@value='Cricket']"));
		checkbox.click();
		
		
		WebElement Language = g.findElement(By.xpath("//*[@id='msdd']"));
		Language.sendKeys("Tamil");
		
		
		
		
}
}