package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTaskPage {
	@FindBy(linkText="Projects & Customers")
	public WebElement gotoProAndCustomers;
		
	public void clickongotoProAndCustomers(){
		gotoProAndCustomers.click();
	}

}
