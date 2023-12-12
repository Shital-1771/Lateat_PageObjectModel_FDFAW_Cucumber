package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewCustomerPage {
	@FindBy(name="name")
	public WebElement entercustomername;
	
	@FindBy(name="description")
	public WebElement entercustomerdesc;
	
	@FindBy(id="active_customers_action")
	public WebElement cradio1;
	
	@FindBy(id="add_project_action")
	public WebElement cradio2;
	
	@FindBy(id="add_more_customers_action")
	public WebElement cradio3;
	
	@FindBy(name="createCustomerSubmit")
	public WebElement createCustomerButton;
	
	public void createCustomer(String cname,String cdesc,String cradio){
		entercustomername.sendKeys(cname);
		entercustomerdesc.sendKeys(cdesc);
		if(cradio.equalsIgnoreCase("cradio1"))
			cradio1.click();
		else if(cradio.equalsIgnoreCase("cradio2"))
			cradio2.click();
		else if(cradio.equalsIgnoreCase("cradio3"))
			cradio3.click(); 
		createCustomerButton.click();

}
}
