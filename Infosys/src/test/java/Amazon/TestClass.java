package Amazon;

import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AmazonPomClass.AmazonLogin;
import AmazonPomClass.AmazonLogout;
import AmazonPomClass.Amazon_search;
public class TestClass {
//Ref variables are globaly declare
	AmazonLogin login;
	Amazon_search Search;
	AmazonLogout logout;
	
	//browser lonch , object of POM class
	@BeforeClass
	public void browserlonch() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\bhalt\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	this.login=new AmazonLogin(driver);
	//this.Search=new Amazon_search(driver); 
	Search=new Amazon_search(driver);
	logout=new AmazonLogout(driver);
	
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	//pre-requicit ,eg login
	@BeforeMethod
	public void login() {
		login.EnterUsernmae();
		login.EnterPassword();
		login.ClickOnLoginButton();
		
		
	}
	@Test
	public void search() {
	//	Search.EnterInSearchBox();
		//Search.ClickOnSearchButton();
	}
	@AfterMethod
	public void logout() {
	logout.MoveToElement();
	}
	@AfterClass
	public void closebrowser() {
		System.out.println("Close browse");
	}
}
