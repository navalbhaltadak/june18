package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebooklogin {
	private WebDriver driver;
@FindBy(xpath="//input[@name='email']")
private WebElement username;
@FindBy(xpath="//input[@type='password']")
private WebElement password;
@FindBy(xpath="//button[text()='Log in']")
private WebElement loginbutton;


public Facebooklogin(WebDriver driver)
{   
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	
}
public void enterUserName() {
	username.sendKeys("9075912543");
}
public void EnterPassWord() {
	password.sendKeys("442266");
}
public void ClickOnLoginButton() {
	loginbutton.click();
}
}