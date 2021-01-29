package TestngSeleniumPackage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG6 {
	 @Test
	 public void a()
	 {
		 System.out.println("a method");
		 
	 }
	 @Test(invocationCount = 2)//invocation count represents the 
	 //number of times the method has to be executed
	 public void b()
	 {
		 System.out.println("b method");
		 
	 }
	 @BeforeMethod
	 public void preCondition()
	 {
		 System.out.println("this is executed before method");
		 
	 }

}
