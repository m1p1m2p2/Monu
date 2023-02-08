package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettextlocator {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
driver.get("https://opensource-demo.orangehrmlive.com/");		
driver.manage().window().maximize();

Thread.sleep(2000);

WebElement txt=driver.findElement(By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']"));
String returnStr =txt.getText();
System.out.println(returnStr);         // title

Thread.sleep(2000);
WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
username.sendKeys("Admin");

Thread.sleep(2000);
WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
password.sendKeys("admin123");

WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
button.click();
	}

}
