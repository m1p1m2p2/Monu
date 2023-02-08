package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://m.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#m_login_email")).sendKeys("piyushnagalwade@gmail.com");
		driver.findElement(By.cssSelector("#m_login_password")).sendKeys("piyu051991");
		driver.findElement(By.cssSelector("._54k8._52jh._56bs._56b_._28lf._9cow._56bw._56bu")).click();
		
	}

	
	}


