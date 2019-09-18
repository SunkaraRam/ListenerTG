package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LoginTest {
	
	@Test
	public void loginByEmail() {
		
		System.out.println("Login by Email");
		Assert.assertEquals("Ram","Ram");
		
	}
	
	@Test
	public void loginByFb() {
		
		System.out.println("Login by Facebook");
		
		Assert.assertEquals("Ram", "Sunkara" ,"Both strings are not matching");
		
	}
	
	@Test
	public void loginTwitter() {
		
//		Assert.assertEquals("ram", "swapn");
//		System.out.println("It is going to skip");
		
		throw new SkipException("It is in progress");
		
		
		
	}
	
	

}
