import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown 
{
	 public static void main(String[] args) throws InterruptedException
	 {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Select country=new Select(driver.findElement(By.name("country")));
		Thread.sleep(3000);
		country.selectByVisibleText("ANGOLA");
		Thread.sleep(3000);
		country.selectByValue("INDIA");
		Thread.sleep(3000);
		country.selectByIndex(2);
		Thread.sleep(3000);
	}
}

