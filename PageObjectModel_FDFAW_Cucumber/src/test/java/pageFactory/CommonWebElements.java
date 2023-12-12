package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.TestBase;

public class CommonWebElements extends TestBase {
	
	@FindBy(linkText="Logout")
	public WebElement logout;


}
