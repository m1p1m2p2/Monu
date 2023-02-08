package Scrolling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollOnParticularElementOverAWebPage {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();


		
driver.findElement(By.xpath("//*[text()='PIM']")).click();
//WebElement ScrollingTillThisElement=driver.findElement(By.xpath("//*[contains(text(),'chakri ')]//parent::div//parent::div//*[contains(text(),'reddy')]//parent::div//parent::div//span//i"));

WebElement ScrollingTillThisElement =driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[4]/div/div[1]/div/div/label/span/i"));

JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].ScrollIntoView();",ScrollingTillThisElement);
js.executeScript("arguments[0].click();",ScrollingTillThisElement);
//Thread.sleep(2000);
//js.executeScript("Window.scrollBy(0,-600)");
//ScrollingTillThisElement.click();




	}



}
