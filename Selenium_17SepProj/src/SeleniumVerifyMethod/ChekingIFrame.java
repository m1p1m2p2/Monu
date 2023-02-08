package SeleniumVerifyMethod;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChekingIFrame extends utility.Screenshot {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\HP\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));	
		driver.switchTo().frame(iframe);    // switching of frame into frame

		WebElement source = driver.findElement(By.cssSelector("#slider span"));
		Actions act = new Actions(driver);
		act.clickAndHold(source).build().perform();
		Thread.sleep(2000);
		act.moveToElement(source, 550, 0).release().build().perform();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Download")).click();

	Thread.sleep(1000);
	ChekingIFrame ob=new ChekingIFrame();
	ob.Screenshot("Photo");
	System.out.println("Screenshot wiil be done");
	driver.quit();
	
	}

	
		
	}
