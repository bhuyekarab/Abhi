package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static WebDriver chromeBrowser(String url) {
	
//	WebDriverManager.chromedriver().setup();
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\New chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	return driver;
	}
	
	
}
