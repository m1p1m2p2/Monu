package testngtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssert {

public static WebDriver driver;
static String url="http://dthahab.com/setting/Splash/Create";

@BeforeTest
public void intBrowser() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
}

@Test(priority=0)
void verifyUrlOfPage() {
	String verifyUrl=driver.getCurrentUrl();
	Assert.assertEquals(verifyUrl,"http://dthahab.com/setting/Splash/Create","Verifying URL");
	System.out.println("next line after hard assert");
}	

@Test(priority=1)
void verifyTitleOfPage() {
	String verifyTitle =driver.getTitle();
	Assert.assertEquals(verifyTitle,"Login | Dthahab", "verifyTitle");
	
}
}
	
	
	

