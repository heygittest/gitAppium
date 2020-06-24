package stepDefination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Testcase.LoginTest;
import cucumber.api.PendingException;
@RunWith(Cucumber.class)
public class stepDefination extends TestBase {
	public HomePage home;
	LoginPage login=new LoginPage();
	public stepDefination() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Given("^user has driver exe$")
	public void user_has_driver_exe() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		browser=prop.getProperty("browser");
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
	}



@Given("^url entered as \"([^\"]*)\"$")
public void url_entered_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
	}


@Given("^user clicks on login$")
public void user_clicks_on_login() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	
    login.getLogin().click();
}


	/*@When("^user logs in with user \"([^\"]*)\" and password \"([^\"]*)\" and logs in$")
	public void user_logs_in_with_user_and_password_and_logs_in(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	login.getemail().sendKeys(arg1);
	login.getPassword().sendKeys(arg2);
	//password.sendKeys(Pass);
		home=login.login();
	}*/

@When("^user logs in with user (.+) and password (.+) and logs in$")
public void user_logs_in_with_user_and_password_and_logs_in(String username, String password) throws Throwable {
	login.getemail().sendKeys(username);
	login.getPassword().sendKeys(password);
	//password.sendKeys(Pass);
		home=login.login();
}

	@Then("^home page should be displayed$")
	public void home_page_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		home.homelogin();
	}
}