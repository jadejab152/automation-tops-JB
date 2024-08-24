import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWindow 
{
	 public static void main(String[] args) throws InterruptedException
	 {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(3000);
		String mainWindow=driver.getWindowHandle();
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> itr=s1.iterator();
		Thread.sleep(3000);
		while(itr.hasNext())
		{
			String childWindow=itr.next();
			if(!mainWindow.equals(childWindow))
			{
				driver.switchTo().window(childWindow);
				Thread.sleep(3000);
				driver.findElement(By.name("emailid")).sendKeys("bhoomika@gmail.com");
				Thread.sleep(3000);
				driver.findElement(By.name("btnLogin")).click();
				Thread.sleep(3000);
			}
		}
		driver.switchTo().window(mainWindow);
		Thread.sleep(3000);

		driver.close();
		
	}
}
