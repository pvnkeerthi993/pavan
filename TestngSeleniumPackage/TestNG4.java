package TestngSeleniumPackage;

import org.testng.annotations.Test;

public class TestNG4 {

	@Test(priority = -10)
	public void a() {
		System.out.println("a method");
	}

	@Test(priority = -20) // highest priority as there is least value
	public void b() {
		System.out.println("b method");
	}

	@Test(priority = 0)
	public void z() {
		System.out.println("z method");
	}

	@Test(priority = 2) // least priority as it has largest value so executed last
	public void d() {
		System.out.println("d method");
	}

	@Test
	public void e()// no priority is given
	{
		System.out.println("e method");
	}

	@Test
	public void s() {
		System.out.println("s method");
	}

	@Test(priority = 1)
	public void f() {
		System.out.println("f method");
	}

	@Test(priority = 1) // same priority as f
	public void c() {
		System.out.println("c method");
	}

}
