
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class KeyDownKeyUp {

	public static void main(String[] args) {
System.setProperty("webdriver.Chrome.driver","C:\\Users\\HP\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://mbasic.facebook.com/reg/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

WebElement txtbox1 = driver.findElement(By.name("firstname"));
WebElement txtbox2 = driver.findElement(By.name("lastname"));

Actions act = new Actions(driver);
act.sendKeys(txtbox1,"Automation").keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();


	
}

}
