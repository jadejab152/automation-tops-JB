import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle 
{
	 public static void main(String[] args) throws InterruptedException
	 {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("cusid")).sendKeys("1");
		Thread.sleep(3000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		driver.close();
		
	}
}
