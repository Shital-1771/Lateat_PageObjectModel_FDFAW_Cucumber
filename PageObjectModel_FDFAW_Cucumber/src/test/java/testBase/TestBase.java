package testBase;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import javax.management.openmbean.OpenType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import pageFactory.ActiveProjectAndCustomersPage;
import pageFactory.CreateNewCustomerPage;
import pageFactory.LoginPage;
import pageFactory.OpenTaskPage;
import pageFactory.SuccessMessagePage;
import pageFactory.TimetrackPage;

public class TestBase {
	
	
	
	public static LoginPage lp;
	public static TimetrackPage tp;
	public static OpenTaskPage op;
	public static ActiveProjectAndCustomersPage acp;
	public static CreateNewCustomerPage cp;
	public static SuccessMessagePage sp;
	
	public static Properties prop;
	public static String Browser;
	public static WebDriver driver;
	
	
	
	public static SoftAssert st;
	
	public static void openBrowser() throws Throwable{
		st=new SoftAssert();
		prop=new Properties();
		prop.load(new FileInputStream("src\\test\\java\\config\\Global.properties"));
		Browser=prop.getProperty("Browser");
		System.out.println("Browser choosen is "+Browser);
		if(Browser.equalsIgnoreCase("chrome"))
			driver=new ChromeDriver();
		else if(Browser.equalsIgnoreCase("edge"))
			driver=new EdgeDriver();
		else if(Browser.equalsIgnoreCase("firefox"))
			driver=new FirefoxDriver();
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		initelements();
	}
	
	public static void closeBrowser(){
		driver.quit();
	}
	
	public static void initelements(){
		 lp = PageFactory.initElements(driver, LoginPage.class);
		 tp = PageFactory.initElements(driver, TimetrackPage.class);
		 op = PageFactory.initElements(driver, OpenTaskPage.class);
		 acp = PageFactory.initElements(driver, ActiveProjectAndCustomersPage.class);
		   cp = PageFactory.initElements(driver, CreateNewCustomerPage.class); 
		   sp = PageFactory.initElements(driver, SuccessMessagePage.class);
	}





}

