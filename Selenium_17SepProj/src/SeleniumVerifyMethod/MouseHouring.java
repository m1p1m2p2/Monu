package SeleniumVerifyMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHouring {

	public static void main(String[] args)throws InterruptedException {

			System.setProperty("webdriver.Chrome.driver","C:\\Users\\HP\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/menu#");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	WebElement target = driver.findElement(By.xpath("//*[text()='Main Item 2']"));		
Thread.sleep(2000);
	Actions act = new Actions(driver);
act.moveToElement(target).perform();

	}

}
