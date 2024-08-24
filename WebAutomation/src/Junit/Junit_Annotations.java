package Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit_Annotations
{
	
	static WebDriver driver=null;
	@BeforeClass
	public static void beforeclass() throws InterruptedException
	{
		System.out.println("Before Class");
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);

	}
	
	@Before
	public void login() throws InterruptedException
	{
		System.out.println("Before");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);		
	}
	
	@Test
	public void addToCart() throws InterruptedException
	{
		System.out.println("Main test Case 1");
		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(3000);		
	}
	
	@Test
	public void viewcart() throws InterruptedException
	{
		System.out.println("Main Test Case 2");
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(3000);		
	}
	
	@After
	public void logout() throws InterruptedException
	{
		System.out.println("After");
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(3000);		
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(3000);		
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("After Class");
		driver.close();
	}
	
	
}

