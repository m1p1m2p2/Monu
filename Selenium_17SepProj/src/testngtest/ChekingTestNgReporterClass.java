package testngtest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ChekingTestNgReporterClass {

@Test(priority=1)
public void ba() {
	System.out.println("2nd test");
}
	
@Test(priority=-1)
public void ab() {
	System.out.println("1st test");	
	Reporter.log("cheking Reporter", true);
}
}
