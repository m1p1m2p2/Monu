package utility;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaittt {

public static void main(String[] args)throws InterruptedException {
		//WebDriverManager.Chromedriver().setup();
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\HP\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	
		driver.findElement(By.id("alert")).click();
		//explicit wait
		
	WebDriverWait Wait= new WebDriverWait(driver, Duration.ofSeconds(20));
	 Wait.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert().accept();
}
}