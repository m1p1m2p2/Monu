package Dynamictbl;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectParticularCheckBoxFromDynamicTbl {

public static void main(String[] args)throws InterruptedException{
System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\chromedriver_win32\\chromedriver.exe");

WebDriver driver =new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");		
driver.findElement(By.xpath("//*[@type='submit']")).click();


driver.findElement(By.xpath("//*[text()='PIM']")).click();
Thread.sleep(2000);
//driver.findElement(By.xpath("   ")).click();



}

}
