package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium1stprog.CodeforBrowserInitialization;

public class checkingId {

public static void main(String[] args) {
	
System.setProperty("webdriver.chrom.driver","C:\\Users\\HP\\chromedriver_win32\\chromedriver.exe");
	
WebDriver driver = new ChromeDriver();
driver.get("https://www.instagram.com/");
driver.manage().window().maximize();

WebElement userName=driver.findElement(By.id("m_login_email"));
userName.sendKeys("Monali");

WebElement password = driver.findElement(By.id("m_login_password"));
password.sendKeys("monali123");	

WebElement clickLogin=driver.findElement(By.name("login"));
clickLogin.click();
		
}

}
