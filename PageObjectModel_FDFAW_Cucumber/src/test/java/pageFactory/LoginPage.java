package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.TestBase;

public class LoginPage extends TestBase {

	//WebElements + Business Logics
		//WebElement todaysdeal = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
		@FindBy(name="username") 
		public WebElement uname;
		
		@FindBy(name="pwd") 
		public WebElement upwd;
		
		@FindBy(id="loginButton") 
		public WebElement loginButton;
		
		public void login(){
			uname.sendKeys(prop.getProperty("username"));
			upwd.sendKeys(prop.getProperty("password"));
			loginButton.click();
		}
		



}
