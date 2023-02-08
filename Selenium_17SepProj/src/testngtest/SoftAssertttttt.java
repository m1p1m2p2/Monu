package testngtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertttttt {

	public static WebDriver driver;
	static String url = "http://dthahab.com/setting/Splash/Create";
	
@BeforeTest
public void initBrowser() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
}
@Test(priority=0)
void verifyUrlOfPage() {
	String verifyUrl= driver.getCurrentUrl();
	SoftAssert softAsserts=new SoftAssert();
	softAsserts.assertEquals(verifyUrl, url,"Verifying Url");
System.out.println("next line after verify Url test case hard assert");
softAsserts.assertAll();
}

@Test(priority=1)
void verifyTitleOfPage() {
	String verifyTitle =driver.getTitle();
	SoftAssert softAsserts=new SoftAssert();
	softAsserts.assertEquals(verifyTitle,"Login | Dthahab", "verifyTitle");
	softAsserts.assertAll();
}

@AfterTest
void teardDown() {
	driver.quit();
}

}
