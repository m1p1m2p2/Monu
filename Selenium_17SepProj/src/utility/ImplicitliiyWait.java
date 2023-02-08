package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitliiyWait {

public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\HP\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/implicit-wait-example");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		// implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		int i=1;
		while(i>0) {
			driver.findElement(By.xpath("(//*[@id='q']//input)["+i+"]")).click();
			i++;
		}
		}


	}



