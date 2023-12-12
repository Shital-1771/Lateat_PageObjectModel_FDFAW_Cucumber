package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessMessagePage extends CommonWebElements{
	
	
	@FindBy(xpath="//*[@id=\"SuccessMessages\"]/tbody/tr/td/span")
	public WebElement successmsg;
	
	public void verifysucessmsg(){
		try{
			successmsg.isDisplayed();
			System.out.println("Actual text ="+successmsg.getText());
		}catch(Throwable t){
			st.fail("Successmsg does not Displayed...");
		}
		logout.click();
		st.assertAll();
	}


	
	

}
