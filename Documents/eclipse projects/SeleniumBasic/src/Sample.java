import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		
		
		//browser configuration
		System.setProperty("webdriver.chromedriver","C:\\Users\\Nandhakumar S\\Documents\\eclipse projects\\SeleniumBasic\\Driver\\chromedriver.exe" );
		
		
		//instantiate browser
		
		WebDriver driver = new ChromeDriver();
	}
}
