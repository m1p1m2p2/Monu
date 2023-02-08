package SeleniumVerifyMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedCheck {

	
		public static void main(String[] args)throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.facebook.com/reg");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			WebElement btnRadio=driver.findElement(By.xpath("//input[@value='2']"));
			 btnRadio.click();
			 Thread.sleep(2000);
			 
			 System.out.println(btnRadio.isSelected());
			 driver.close();
			}

		
	
	}


