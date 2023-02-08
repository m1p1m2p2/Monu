package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chechingXpathlocator {

public static void main(String[] args) throws InterruptedException{
		
System.setProperty("webdriever.chrome.driver","C:\\Users\\HP\\chromedriver_win32\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");
driver.manage().window().maximize();

Thread.sleep(2000);
WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
userName.sendKeys("Admin");

WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
password.sendKeys("admin123");


WebElement button = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
//("//button[@type='submit]"));
button.click();
Thread.sleep(3000);
//driver.close();
}

}
