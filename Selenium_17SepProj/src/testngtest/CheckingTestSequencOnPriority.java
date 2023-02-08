package testngtest;

import org.testng.annotations.Test;

public class CheckingTestSequencOnPriority {

	@Test(priority=1)
	public void ba() {
		System.out.println("2nd test");
	}
	@Test(priority=2)
	public void ab() {
		System.out.println("1st test");
	}
	
}
