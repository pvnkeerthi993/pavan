package TestngSeleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioPractice {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//we use get method of WebDriver interface to launch given URL
		driver.get("https://www.facebook.com/");
		/*
		 * driver.findElement(By.xpath("//input[@value='1']")).click();
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//input[@value='2']")).click();
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//input[@value='-1']")).click();
		 * Thread.sleep(3000);
		 */
		
		List<WebElement> radios = driver.findElements(By.xpath("//input[contains(@type,'radio')]"));
		System.out.println(radios.size());
		radios.get(1).click();
		System.out.println(radios.get(0).isSelected());
		
		
		

	}

}
