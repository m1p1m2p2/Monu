package testngtest;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnableKeywordChekingSequence {

@Test(priority=1,enabled=false)	
	public void ba() {
	System.out.println("2nd test");
}
@Test(priority=-1)
public void ab() {
	System.out.println("1st test");
	Reporter.log("checking Reporter", false);
}
}
