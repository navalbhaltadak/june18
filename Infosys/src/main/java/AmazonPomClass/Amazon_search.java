package AmazonPomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_search {
	WebDriver driver;
	Amazon_search search;
	@FindBy(xpath = "//input[@aria-label='Search']")
	WebElement Searchbox;
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement Searchbutton;

	public Amazon_search (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}

	public void EnterInSearchBox() {
		Searchbox.sendKeys("iphone 13 pro");
	}
	public void ClickOnSearchButton() {
		Searchbutton.click();
	}
}
