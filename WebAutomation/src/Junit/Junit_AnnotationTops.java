package Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit_AnnotationTops
{
	
	static WebDriver driver=null;
	@BeforeClass
	public static void beforeclass() throws InterruptedException
	{
		System.out.println("Before Class");
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://careercenter.tops-int.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);

	}
	
	@Before
	public void login() throws InterruptedException
	{
		System.out.println("Before");
		driver.findElement(By.name("user_name")).sendKeys("9016667672");
		Thread.sleep(3000);
		driver.findElement(By.id("user_password")).sendKeys("9016667672");
		Thread.sleep(3000);
		driver.findElement(By.id("btn.btn-brand.btn-block.w-75.mx-auto")).click();
		Thread.sleep(3000);		
	}
	
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("After Class");
		driver.close();
	}
	
	
}

