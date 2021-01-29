package TestngSeleniumPackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG5 {
	
	@Test
	public void a()
	{
		System.out.println("a method");
	}
	@Test(enabled=false)//skipping a test case and it is ignored while
	//executing
	public void b()
	{
		System.out.println("b method");
	}
	@Test
	public void c()
	{
		System.out.println("c method");
	}
	
	@Test
	public void d()
	{
		System.out.println("d method");
		throw new SkipException("Skipping d method");//Another way to skip
		//a method
	}

}
