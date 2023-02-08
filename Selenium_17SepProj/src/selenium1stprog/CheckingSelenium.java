package selenium1stprog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingSelenium {

public static void main(String[]args) throws InterruptedException {
	System.setProperty("webbrowser.chrome.driver","C:\\Users\\HP\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();

driver.get("https://www.instagram.com/");
driver.manage().window().maximize();
driver.navigate().to("https://www.youtube.com/");

Thread.sleep(2000);
driver.navigate().forward();
Thread.sleep(2000);
driver.navigate().refresh();
}
}


//.get method and .navigate()to method are two method used in selenium to launch the url