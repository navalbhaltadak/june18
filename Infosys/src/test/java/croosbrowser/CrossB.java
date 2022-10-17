package croosbrowser;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import facebook.Facebooklogin;

public class CrossB {
	Facebooklogin login;
	WebDriver driver;
@Parameters
@BeforeClass
public void lonchbrowser(String browser) {//chrome
	lonchbrowser(browser);
	this.login=new Facebooklogin(driver);
	
}
@Test
public void login() {
	
}

}
