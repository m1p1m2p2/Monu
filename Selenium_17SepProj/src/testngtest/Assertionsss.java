package testngtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(testngtest.Ilistnerrrr.class)
public class Assertionsss {

	public static WebDriver driver;
	static String url = "http://dthahab.com/setting/Splash/Create";
	
@BeforeTest(alwaysRun = true,groups="sanity,regression")
	public void initBrowser() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
}
@Test(priority = 1, groups = "regression")
void verifytitleofpage() {
	String verifytitle = driver.getTitle();
	SoftAssert softasserts = new SoftAssert();
	softasserts.assertEquals(verifytitle, "Login | Dthahab", "verifying title");
	softasserts.assertAll();

}
@Test(priority=1,groups="regresion")
void verifyTitleOfPage() {
String verifyTitle=driver.getTitle();
SoftAssert softAsserts= new SoftAssert();
softAsserts.assertEquals(verifyTitle, "Login | Dthahab", "verifyTitle");
System.out.println("next line after verify Title test case");
softAsserts.assertAll();
}
@Test(priority = 2, groups = { "sanity","regression"})
void verifyDashboordAfterLogin() {
	MethodsToRunTestCasesOnCurrentPage c = new MethodsToRunTestCasesOnCurrentPage();
	c.login("VELOCITY", "VELOCITY123");
	String text = c.getPageText("Dashboard");
	Assert.assertEquals(text, "Dashboard", "verifying page text");
}
@Test(priority = 3, groups = "regression")
void verifyDashbodBlocks() {
	MethodsToRunTestCasesOnCurrentPage  c = new MethodsToRunTestCasesOnCurrentPage ();
	String text1 = c.getBlockOnDashBord("Orders");
	String text2 = c.getBlockOnDashBord("Revenue");
	String text3 = c.getBlockOnDashBord("Average Price");
	String text4 = c.getBlockOnDashBord("Product Sold");
	Assert.assertEquals(text1, "ORDERS", "verifying page block");
	Assert.assertEquals(text2, "REVENUE", "verifying page block");
	Assert.assertEquals(text3, "AVERAGE PRICE", "verifying page block");
	Assert.assertEquals(text4, "PRODUCT SOLD", "verifying page block");


}
@AfterTest(alwaysRun=true,groups="sanity,regression")
void teardDown() {
	driver.quit();
}	
}