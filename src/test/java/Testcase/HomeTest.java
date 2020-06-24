package Testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.TestBase;

public class HomeTest extends TestBase{

	public HomeTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		
	}
	@Test(priority=2)
	public void testhome()
	{
		LoginTest.home.homelogin();
	}
}
