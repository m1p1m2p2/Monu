package SeleniumVerifyMethod;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChekingIFrameExplicitttlyyyy {

	/// Dynamic Waittttt

		public static void main(String[] args) throws InterruptedException {
			//System.setProperty("webdriver.Chrome.driver","C:\\Users\\HP\\chromedriver_win32\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://jqueryui.com/slider/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		WebDriverWait wa= new WebDriverWait(driver, Duration.ofSeconds(20));
		wa.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
			driver.switchTo().frame(iframe);    // switching of frame into frame  (exceptionnn)

			WebElement source = driver.findElement(By.cssSelector("#slider span"));
			Actions act = new Actions(driver);
			act.clickAndHold(source).build().perform();
		
			act.moveToElement(source, 550, 0).release().build().perform();
			
			driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Download")).click();
			
	}
		
		
	}
	

