package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToLogOutByCss {

	


	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.cssSelector("[name='username'])")).sendKeys("Admin");
	driver.findElement(By.cssSelector("[type='password']")).sendKeys("admin123");
	driver.findElement(By.cssSelector("[type='submit']")).click();
		
	}

}
