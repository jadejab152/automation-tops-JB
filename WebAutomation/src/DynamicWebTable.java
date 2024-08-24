import java.util.List;

import org.apache.poi.ss.formula.functions.Rows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable 
{
	 public static void main(String[] args) throws InterruptedException
	 {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> rows=driver.findElements(By.xpath("/html/body/div/div[3]/div[1]/table/thead/tr/th[1]"));
		System.out.println("Total Rows : "+rows.size());
		for(int i=0;i<rows.size();i++)
		{
			System.out.println(rows.get(i).getText());
			Thread.sleep(500);

		}
		
		
		Thread.sleep(3000);
		driver.close();
		
	}
}
