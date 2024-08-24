import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsDemo 
{
	 public static void main(String[] args) throws InterruptedException
	 {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/ajax.html");
		Thread.sleep(3000); 
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement no=driver.findElement(By.id("no"));
		no.click();
		Thread.sleep(3000);
		driver.findElement(By.id("buttoncheck")).click();
		Thread.sleep(3000);
		List<WebElement> list=driver.findElements(By.name("name"));
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getAttribute("value"));
			list.get(i).click();
			Thread.sleep(3000);
		}
		Thread.sleep(3000);
		driver.close();
		
		

		
	}
}
