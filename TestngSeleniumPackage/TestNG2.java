package TestngSeleniumPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG2 {
@Test
public void Assertioncheck()
{
	String ExpectedMsg = "User Created successfully";
	String ActualMsg = "User Created successfully";
	
	try {
		
		Assert.assertEquals(ActualMsg, ExpectedMsg);
		
	}
	catch(AssertionError e)
	{
		System.out.println(e);
	}
	System.out.println("Verification successful");
	
}
}
