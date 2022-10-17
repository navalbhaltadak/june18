package AmazonPomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLogin {
	 WebDriver driver;

	//Find annotation is used to locate and storing webElement 
	//private data member and variable
@FindBy(xpath="//input[@name='email']")
private WebElement username;

@FindBy(xpath="//input[@id='continue']")
private WebElement continuebutton;

@FindBy(xpath="//input[@id='ap_password']")
private WebElement password ;

@FindBy(xpath="//input[@id='signInSubmit']")
private WebElement login ;


//constructor of AmazonLogin POM class
public AmazonLogin(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver, this);
}
//public Method or member function
public void EnterUsernmae() {
	username.sendKeys("9075912543");
	continuebutton.click();
}
public void EnterPassword() {
	password.sendKeys("patil123");
}
public void ClickOnLoginButton() {
	login.click();
}
}

