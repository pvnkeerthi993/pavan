package TestngSeleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG8 {
	WebDriver driver;
	
	@BeforeClass
	public void setEnv() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	@DataProvider
	
		public Object[][] dataSet()
		{
		Object arr[][] = new Object[2][2];
		
		arr[0][0] = "Email_1";
		arr[0][1] = "Password_1";
		
		arr[1][0] = "Email_2";
		arr[1][1] = "Password_2";
		
		return arr;
	}
	
	@Test(dataProvider = "dataSet")
	public void enterCredential(String UserName,String Password)
	{
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(UserName);
		driver.findElement(By.id("pass")).sendKeys(Password);
		
	}
	

}
