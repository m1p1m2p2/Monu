package SeleniumVerifyMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWinPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\HP\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://groww.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[text()='Login/Register']")).click();
Thread.sleep(200);
driver.findElement(By.id("login_email1")).sendKeys("kharabemonali@gmail.com");
}
}