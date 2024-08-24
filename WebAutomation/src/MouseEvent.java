import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseEvent 
{
	 public static void main(String[] args) throws InterruptedException
	 {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Actions builder=new Actions(driver);
		
		WebElement home=driver.findElement(By.linkText("Home"));
		Action movetohome=builder.moveToElement(home).build();
		movetohome.perform();
		Thread.sleep(3000);
		
		WebElement flights=driver.findElement(By.linkText("Flights"));
		Action movetoflights=builder.moveToElement(flights).build();
		movetoflights.perform();
		Thread.sleep(3000);
		
		WebElement hotels=driver.findElement(By.linkText("Hotels"));
		Action movetohotels=builder.moveToElement(hotels).build();
		movetohotels.perform();
		Thread.sleep(3000);
		
		WebElement car=driver.findElement(By.linkText("Car Rentals"));
		Action movetocar=builder.moveToElement(car).build();
		movetocar.perform();
		Thread.sleep(3000);
		
		WebElement cruises=driver.findElement(By.linkText("Cruises"));
		Action movetocruises=builder.moveToElement(cruises).build();
		movetocruises.perform();
		Thread.sleep(3000);
		
		WebElement destinations=driver.findElement(By.linkText("Destinations"));
		Action movetodestinations=builder.moveToElement(destinations).build();
		movetodestinations.perform();
		Thread.sleep(3000);
		
		WebElement vacations=driver.findElement(By.linkText("Vacations"));
		Action movetovacations=builder.moveToElement(vacations).build();
		movetovacations.perform();
		Thread.sleep(3000);
		
		
		driver.close();
	}
}
