package TestngSeleniumPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG7 {
	@Test
	public void a()
	{ 
		try {
		Assert.assertTrue(5<12);
		}
		catch(Exception e) {
			
			System.out.println("Exception");
		}
		System.out.println("a test method");
	}
	
	@Test(dependsOnMethods = {"a"})
	public void b()
	{
		System.out.println("b method");
	}

}
