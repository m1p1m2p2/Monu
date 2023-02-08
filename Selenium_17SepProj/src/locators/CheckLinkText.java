package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckLinkText {

	public static void main(String[] args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");
driver.manage().window().maximize();

Thread.sleep(2000);
WebElement hyperLink = driver.findElement(By.linkText("OrangeHRM, Inc"));
hyperLink.click();

	
}

}
