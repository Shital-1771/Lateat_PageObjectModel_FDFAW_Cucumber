package stepDefination;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testBase.TestBase;

public class StepDefination extends TestBase{
	@Before
	public void beforeEachScenario() throws Throwable{
		openBrowser();
	}
	@After
	public void afterEachScenario() throws Throwable{
		closeBrowser();
	}
	@Given("user is in the create customer page")
	public void user_is_in_the_create_customer_page() {
		//LoginPage lp= new LoginPage();
//		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
//		TimetrackPage tp = PageFactory.initElements(driver, TimetrackPage.class);
//		OpenTaskPage op = PageFactory.initElements(driver, OpenTaskPage.class);
	//	ActiveProjectAndCustomersPage acp = PageFactory.initElements(driver, ActiveProjectAndCustomersPage.class);
		lp.login();
		tp.clickontask();
		op.clickongotoProAndCustomers();
		acp.clickonCreateNewCustomer();
	}
	@When("^user enter customername as (.+) and Description as (.+) and select radio as (.+) and clicks on createcustomerButton$")
	public void user_enter_customername_as_and_description_as_and_select_radio_as_and_clicks_on_createcustomer_button(String cname, String cdesc, String cradio) {
	 // CreateNewCustomerPage cp = PageFactory.initElements(driver, CreateNewCustomerPage.class); 
	  cp.createCustomer(cname, cdesc, cradio);
	}
	@Then("customer should be created successfully")
	public void customer_should_be_created_successfully() {
	  // SuccessMessagePage sp = PageFactory.initElements(driver, SuccessMessagePage.class);
	   sp.verifysucessmsg();
	}
	
	@AfterStep
    public void takescreenshots(Scenario scenario){
    	
        final  byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot,"image/png","image");
    }








}
