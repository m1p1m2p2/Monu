package utility;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static WebDriver driver;
	
	public void Screenshot (String FileName)throws IOException {
	TakesScreenshot Scrnshot = (TakesScreenshot)driver;
	File source =Scrnshot.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\HP\\Videos\\Captures\\"+FileName+".png");
	FileHandler.copy(source, destination);
	}	
}