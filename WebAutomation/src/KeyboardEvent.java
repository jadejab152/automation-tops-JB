import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvent 
{
	 public static void main(String[] args) throws InterruptedException
	 {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement userName=driver.findElement(By.id("email"));
		Actions builder=new Actions(driver);
		Action seriesofAction=builder.moveToElement(userName)
		.click()
		.keyDown(userName,Keys.SHIFT)
		.sendKeys(userName,"jigar")
		.keyUp(userName,Keys.SHIFT)
		.doubleClick()
		.contextClick()
		.build();
		seriesofAction.perform();
		Thread.sleep(10000);
		driver.close();
	 }	
}
		
