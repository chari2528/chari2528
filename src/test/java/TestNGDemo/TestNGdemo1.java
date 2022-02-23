package TestNGDemo;

import org.testng.annotations.BeforeSuite;

public class TestNGdemo1 {
	
	@BeforeSuite
	public void ClearCahe()
	{
		System.out.println("cache is cleared form the browser");
	}
	

}
