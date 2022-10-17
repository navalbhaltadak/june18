package AmazonPomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLogout {
	WebDriver driver;
@FindBy(xpath="//a[@id='nav-link-accountList']")
private WebElement mouceover;
@FindBy(xpath="//span[text()='Sign Out']")
private WebElement logout;

public AmazonLogout(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void MoveToElement() {
	Actions act=new Actions(driver);
	act.moveToElement(mouceover).perform();
	act.click(logout).perform();
}
}