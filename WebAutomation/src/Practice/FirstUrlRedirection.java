package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstUrlRedirection 
{
	public static void main(String[] args) throws InterruptedException
	 {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://uatpayout.payg.in/#/login?returnUrl=%2Fhome");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("Enter Your Mobile Number or Email Address")).sendKeys("9660207809");
		Thread.sleep(3000);
		driver.findElement(By.name("Enter Password")).sendKeys("Sunil@123");
		Thread.sleep(3000);
		driver.findElement(By.className("mat-ripple")).click();
		Thread.sleep(3000);
		driver.close();
		
	}
}

