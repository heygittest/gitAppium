package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import Base.TestBase;

public class LoginPage extends TestBase {
	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
		}
		//sign in button
		@FindBy(partialLinkText="Login")
		WebElement signin;
		
		By signinlink=By.partialLinkText("Login");
		By email=By.xpath("//*[@id='user_email']");	
		By password=By.xpath("//*[@id='user_password']");
		By btnlogin=By.name("commit");
		
		//sign in button 2
		/*@FindBy(xpath="//*[@id='user_email']")
		WebElement email;
		
		@FindBy(xpath="//*[@id='user_password']")
		WebElement password;
		
		@FindBy(name="commit")
		WebElement btnlogin;
		*/
		public WebElement getLogin()
		{
			return driver.findElement(signinlink);
		}
		public WebElement getemail()
		{
			return driver.findElement(email);
		}
		public WebElement getPassword()
		{
			return driver.findElement(password);
		}
		public WebElement getButton()
		{
			return driver.findElement(btnlogin);
		}
		
				
		public  HomePage login() throws InterruptedException, IOException
		{
			//signin.click();
			WebDriverWait wait1= new WebDriverWait(driver,60);
			wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='user_email']")));
			
			driver.findElement(btnlogin).click();
			return new HomePage();
		}
	}

