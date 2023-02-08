package SeleniumVerifyMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement target = driver.findElement(By.xpath("//*[text()='Double-Click Me To See Alert']"));
//Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();

	}

}
