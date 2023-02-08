package basicseleniumcommands;

import selenium1stprog.CodeforBrowserInitialization;

public class currentUrlAndWebTitle extends CodeforBrowserInitialization{

public void  checkInTitleOfPage(String Title) {
	String titleOfPage= driver.getTitle();  // return title of webpage
	
	if(titleOfPage.equals(Title))
		System.out.println("Test is Pass");
	else
		System.out.println("Test is Fail");
	
}
public void checkurlOfCurrentPage(String Url) {
	String urlOfCurrentPage=driver.getCurrentUrl(); //return title of webpage
	
	if(urlOfCurrentPage.equals(Url))
System.out.println("Test is Pass");

else
	System.out.println("Test is Fail");

}
public static void main(String[] args) {
	browserInitialization("chrome");
	driver.get("https://www.instagram.com/");
	driver.manage().window().maximize();
	
	currentUrlAndWebTitle obj = new currentUrlAndWebTitle();
	obj.checkInTitleOfPage("Instagram");   //// test 1
	obj.checkurlOfCurrentPage("https://www.instagram.com/");    //test 2
	
	driver.quit();	
}
}
