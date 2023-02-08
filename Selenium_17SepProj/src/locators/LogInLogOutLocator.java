package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInLogOutLocator {

	public static void main(String[] args)throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\chromedriver_win32\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();

driver.get("https://opensource-demo.orangehrmlive.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
driver.findElement(By.xpath("//*[@type='submit']")).click();

boolean verifyDashboardPageIsOpen = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText().equals("Dashboard");

if(verifyDashboardPageIsOpen==true)
	System.out.println("Test is Pass-Dashboard page is appeared");
else
	System.out.println("Test is Fail-Dashboard Page is not appeared");

driver.findElement(By.xpath("//*[text()='Paul Collings']//parent::span//i")).click();
//driver.findElement(By.linkText("Logout").click();
Thread.sleep(2000);
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(2000);
driver.quit();

	}

}
