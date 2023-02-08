package testngtest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AlwaysRun {

	@Test(priority=-2)
	public void ba() {
		System.out.println("2nd Test");
		Assert.assertEquals(false, true);
	}
	@Test(priority=-1,dependsOnMethods="ba",alwaysRun=true)
	public void ab() {
		System.out.println("1st Test");
		Reporter.log("checking Reporter", false);
}
}