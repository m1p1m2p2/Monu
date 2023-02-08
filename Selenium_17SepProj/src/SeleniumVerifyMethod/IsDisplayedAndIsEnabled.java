package SeleniumVerifyMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedAndIsEnabled {

	public static void main(String[] args)throws InterruptedException {
	System.setProperty("webdriver.chrome.Driver","C:\\Users\\HP\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/reg");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

WebElement BtnRdadio=driver.findElement(By.xpath("https://www.facebook.com/reg"));
//BtnRdadio.click();
//Thread.sleep(2000);

//System.out.println(BtnRdadio.isSelected());
//driver.close();

boolean verifySignUpBtnIsEnable=driver.findElement(By.xpath("signup_button")).isEnabled();
System.out.println(verifySignUpBtnIsEnable);

boolean verifySignUpBtnIsDisplayed=driver.findElement(By.xpath("signup_button")).isDisplayed();
System.out.println(verifySignUpBtnIsDisplayed);

	}

	}


