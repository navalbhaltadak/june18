package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public  static  WebDriver driver;
	public static void browser_llonch(String browser) {
	
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Users\\bhalt\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
			
			
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			 driver=new FirefoxDriver();

		}
		driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	
}
