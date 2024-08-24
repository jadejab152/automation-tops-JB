import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable 
{
	 public static void main(String[] args) throws InterruptedException
	 {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/write-xpath-table.html");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String data=driver.findElement(By.xpath("/html/body/center/table/tbody/tr[2]/td[2]")).getText();
		System.out.println("Text : "+data);
		Thread.sleep(3000);
		driver.close();
		
	}
}
