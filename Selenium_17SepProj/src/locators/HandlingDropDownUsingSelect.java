package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownUsingSelect {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/reg/"); // Manual program
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
//year
WebElement year = driver.findElement(By.id("year"));
Select y=new Select(year);
y.selectByVisibleText("1993");
Thread.sleep(2000);
//Month 
WebElement month = driver.findElement(By.id("month"));
Select m =new Select(month);
m.selectByValue("6");
Thread.sleep(2000);
//Day

WebElement day = driver.findElement(By.id("day"));
Select d =new Select(day);
d.selectByIndex(19);  /// 20 yenarrrr due index
Thread.sleep(2000);
driver.quit();
	}

}
