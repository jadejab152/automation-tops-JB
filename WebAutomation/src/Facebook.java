import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook 
{
	 public static void main(String[] args) throws InterruptedException
	 {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.linkedin.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("session_key")).sendKeys("Bhoomika");
		Thread.sleep(3000);
		driver.findElement(By.id("session_password")).sendKeys("jadeja");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(3000);
		driver.close();
		
	}
}
