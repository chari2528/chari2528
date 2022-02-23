package TestNGDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class practice3 {
	@Test
	public  void getdata() {
		System.out.println("This is my practice website");
	}
	@Test
	public void getbefor(){
		System.out.println("This is my home page");
	}
	@Test
	public void getafter(){
		System.out.println("this is my login button");
	}
	@Test
	public void practice(){
		System.out.println("This is my password button");
	}
	@Test
	public void afterpractice(){
		System.out.println("This is my new page");
		
	}
	
	@AfterMethod
	public void setater()
	{
		System.out.println("This is afterMethod");
	}
	
	@BeforeMethod
	public void getMethod()
	{
		System.out.println("This is my first method");
	}
	
	

}
