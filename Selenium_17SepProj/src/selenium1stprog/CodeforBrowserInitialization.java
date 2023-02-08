package selenium1stprog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CodeforBrowserInitialization {

	public static WebDriver driver;     // static variable
	
	public static WebDriver browserInitialization(String browser) {
		
	System.setProperty("webdriver.Chrome.driver","C:\\Users\\HP\\chromedriver_win32\\chromedriver.exe");
	System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\edgedriver_win64\\msedgedriver.exe");
	
	if(browser.equals("edge"))
		driver=new EdgeDriver();
	if(browser.equals("chrome"))
		driver= new ChromeDriver();
	return driver;
	
}
}