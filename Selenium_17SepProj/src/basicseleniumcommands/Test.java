package basicseleniumcommands;

import selenium1stprog.CodeforBrowserInitialization;

public class Test extends CodeforBrowserInitialization{

	public static void main(String[] args) {
	
		browserInitialization("chrome");
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		//driver.close();  // close only browser current tab
		driver.quit();     /// close entire browser
		
		
	}

}
