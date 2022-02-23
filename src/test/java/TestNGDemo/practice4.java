package TestNGDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class practice4 {
	@Test
	public void getdata(){
		System.out.println("This is my second page");
	}
	@AfterTest
	public void setdata(){
		System.out.println("Happy New Year 2021");
	}
	@Test
	public void database(){
		System.out.println("This is Selenium Project");
	}
	@BeforeTest
	public void result(){
		System.out.println("UserName,Password");
	}
	@Test(enabled=true)
	public void output(){
		System.out.println("loginbutton");
	}
	@AfterMethod
	public void project(){
		System.out.println("open the nextpage");
	}
	@BeforeSuite
	public void localdata(){
		System.out.println("End of the project");
	}
	@Test(dependsOnMethods={"database"})
	public void depends()
	{
		System.out.println("This is a method related to depends on methods");
	}
	

}
