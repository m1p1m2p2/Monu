package datePicker;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;



public class NormalDatepicker2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("datepicker2")).click();
		driver.findElements(By.cssSelector("select[title=\"Change the year\"] option")).get(0).click();
		WebElement year = driver.findElement(By.xpath("//*[@title='Change the year']"));
			Select y= new Select(year);
			y.selectByVisibleText("1995");
			
			WebElement month = driver.findElement(By.xpath("//*[@title='Change the month']"));
			Select m= new Select(month);
			m.selectByVisibleText("June");
			
			 List<WebElement> date = driver.findElements(By.xpath("//table//tr/td//a"));
			 for(WebElement d:date)
				 if(d.getText().equals("3"))
					 d.click();
}

}
