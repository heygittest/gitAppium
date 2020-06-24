package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.xml.XmlSuite;




import 	org.testng.ITestResult;

public class TestBase {
	
		public static WebDriver driver;
		public static String browser;
		public Properties prop;
		public FileInputStream fis;
		public File file;
		public String url;
	
		public TestBase() throws IOException
		{
			file=new File(System.getProperty("user.dir")+"\\src\\main\\java\\property\\properties.xml");
			
			fis=new FileInputStream(file);
			
			prop=new Properties();
			
			prop.load(fis);
			}
		/*@BeforeSuite

		public void init()
		{
			/*extent= new ExtentReports(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\report.html",false);
			extent.addSystemInfo("Host Name", "Test Window");
			extent.addSystemInfo("User Name", "Test QA");
			extent.addSystemInfo("Environment", "QA");*/


		/*browser=prop.getProperty("browser");
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
			
	        }*/
		/*@AfterMethod

		public void resultHandler(ITestResult result) throws IOException{
				
				if(result.getStatus()==ITestResult.FAILURE){
					
					
					extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName()); //to add name in extent report
					extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report
					String screenshotPath=Utility.getScreenshot(driver, "Amazon");
					extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath)); //to add screenshot in extent report
				
				}
				else if(result.getStatus()==ITestResult.SKIP){
					extentTest.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
				}
				else if(result.getStatus()==ITestResult.SUCCESS){
					extentTest.log(LogStatus.PASS, "Test Case PASSED IS " + result.getName());

				}
				extent.flush();
				extent.endTest(extentTest); 
				
		}*/
		@AfterSuite
		public void teardown()
		{
			//driver.quit();
		}
	}
		
		
		




