package Dynamictbl;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedAndIsEnabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\chromedriver_win32\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

boolean verifysignupbtnIsEnable=driver.findElement(By.id("SignUp_button")).isEnabled();
System.out.println(verifysignupbtnIsEnable);

boolean verifysignupbtnIsDisplay = driver.findElement(By.id("SignUp_button")).isDisplayed();
System.out.println(verifysignupbtnIsDisplay);
	
	
	}

}
