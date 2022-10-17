package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Faceooklogout {
@FindBy(xpath="(//span[@class='x4k7w5x x1h91t0o x1h9r5lt x1jfb8zj xv2umb2 x1beo9mf xaigb6o x12ejxvf x3igimt xarpa2k xedcshv x1lytzrv x1t2pt76 x7ja8zs x1qrby5j'] )[7]")
private WebElement profile;
@FindBy(xpath="(//span[@dir='auto'] )[7]")
private WebElement logout;
public Faceooklogout(WebDriver driver){
	PageFactory.initElements(driver, this);
}
public void clickonprofile() {
	profile.click();
}
public void Clickonlogout() {
	logout.click();
}
}
