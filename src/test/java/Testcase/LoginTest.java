package Testcase;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import junit.framework.Assert;

public class LoginTest extends TestBase {
	static LoginPage login;
	public static HomePage home;
	public LoginTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Test (priority=-1)
	public void setup() throws IOException
	{
		// TODO Auto-generated constructor stub
		login=new LoginPage();
			
	}
	@Test (priority=1)
	public void logintoHome() throws InterruptedException, IOException
	{
		browser=prop.getProperty("browser");
		url=prop.getProperty("url");
		if (browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Ajit\\eclipse-workspace\\cucumber_framework_qaclick\\browser\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajit\\eclipse-workspace\\cucumber_framework_qaclick\\browser\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);
		//extentTest=extent.startTest("Login test");
		home=login.login();
		//Assert.assertTrue("Login Successful",true);
	}
	
	
}
