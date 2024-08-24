import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Checkbox 
{
	 public static void main(String[] args) throws InterruptedException
	 {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> list=driver.findElements(By.name("webform"));
		for(int i=0;i<list.size();i++)
		{
			list.get(i).click();
			Thread.sleep(1000);

		}
		Thread.sleep(3000);
		driver.findElement(By.id("vfb-7-1")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("vfb-7-2")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("vfb-7-3")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("vfb-6-0")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("vfb-6-1")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("vfb-6-2")).click();
		Thread.sleep(3000);
		driver.close();
		
	}
}
