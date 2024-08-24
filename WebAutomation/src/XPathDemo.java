import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo 
{
	 public static void main(String[] args) throws InterruptedException
	 {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://careercenter.tops-int.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[1]/form/div[1]/input")).sendKeys("9016667672");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[1]/form/div[2]/input")).sendKeys("9016667672");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[1]/form/div[3]/input")).click();
		Thread.sleep(3000);
		driver.close();
		
	}
}
