package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TimetrackPage {
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/img")
	public WebElement task;
	
	
	public void clickontask(){
		task.click();
	}



}
