	package TestNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGdemo {
	
	
	//Pre-condition annotations
	
	@BeforeSuite
	
	public void ClearCahe()
	{
		System.out.println("Cache is cleared from the browser");
	}
	
	@BeforeTest
	public void Url()
	{
		
		System.out.println("Application url is opened");
	}
	
	@BeforeClass
	public void login()
	{
		System.out.println("User entered the credentials");
	}
	
	@BeforeMethod
	public void HomepageDisplay()
	{
		System.out.println("Home page is displayed");
	}
	
	@Test
	public void Verification()
	{
		System.out.println("Module is verified");
	}
	@AfterMethod
	public void takeScreenshot()
	{
		System.out.println("Screenshot is taken");
		
	}
	@AfterClass
	public void Verified()
	{
	    System.out.println("test case is passed");
	}
	@AfterTest
	public void logout()
	
	{
		System.out.println("successfully logged out");
	}
	@AfterSuite
	public void DeleteCookies()
	{
		System.out.println("Deleted cookies successfull");
	}
	
	
	
	
	}
