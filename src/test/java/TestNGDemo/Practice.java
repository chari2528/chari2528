package TestNGDemo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice {
	
	
	@Test
	public void setData()
	{
		
		System.out.println("This is my second testNg demo");
		
	}
	
	@BeforeTest
	public void setBefore()
	{
		
		System.out.println("This is printed before any test1");
		
	}
	
	@AfterTest
	public void getAfter()
	{
		System.out.println("This is pronted after all the tests");
		
	}

}



