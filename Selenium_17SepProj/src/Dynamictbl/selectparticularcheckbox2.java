package Dynamictbl;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import selenium1stprog.CodeforBrowserInitialization;

public class selectparticularcheckbox2 extends CodeforBrowserInitialization {
	
	public void login() {
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
	public void ClickOnParticularEmpName(String FName, String LName) {
	driver.findElement(By.xpath("//*[contains(text(),'"+FName + "')]//parent::div//following.sibling::div//*[contains(text(),' "+ LName + " ')]//parent::div//preceding-sibling::div//span//i")).click();
		
	}	
	public static void main (String[]args) {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		CodeforBrowserInitialization.browserInitialization("Chrome");
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	selectparticularcheckbox2 loginobj = new selectparticularcheckbox2();
	loginobj.login();
	driver.findElement(By.xpath("//*[text()='PIM']")).click();
	loginobj.ClickOnParticularEmpName("Alice","Duval");
	loginobj.ClickOnParticularEmpName("Cassidy","Hope");
	}

}
