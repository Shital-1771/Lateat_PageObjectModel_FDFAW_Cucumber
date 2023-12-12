package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActiveProjectAndCustomersPage {


	@FindBy(xpath="//input[@value='Create New Customer']")
	public WebElement CreateNewCustomer;
		
	public void clickonCreateNewCustomer(){
		CreateNewCustomer.click();
	}

}
