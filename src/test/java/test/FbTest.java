package test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pojo.Browser;
import pom.Facebook;
import utility.Reports;

public class FbTest {
	WebDriver driver;
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void createReport() {
		extent = Reports.generateReports();
	}
	
	@BeforeMethod
	public void openChrome() {
		driver = Browser.chromeBrowser("https://www.facebook.com/");
	}
	
	@Test
	public void login() {
		test = extent.createTest("login");
		Facebook fb =new Facebook (driver);
		fb.enterEmailId("nigadevd@gmail.com");
		fb.enterPassword("gfsdjf");
		fb.clickOnLogin();
		
	}
	
	@Test
	public void loginWithOnlyUser() {
		test = extent.createTest("loginWithOnlyUser");
		Facebook fb =new Facebook (driver);
		fb.enterEmailId("nigadevd@gmail.com");
		fb.clickOnLogin();
	}
	
	@Test
	public void abhi() {
		test =extent.createTest("abhi");
		System.out.println("asgdfh");
	}
	
	@Test
	public void vishal() {
		test = extent.createTest("vishal");
		System.out.println("gdjfg");
	}
	
	@AfterMethod
	public void captureResults(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL,result.getName());
		}
		else if(result.getStatus()== ITestResult.SUCCESS) {
			test.log(Status.PASS, result.getName());
		}
		else{
			test.log(Status.SKIP, result.getName());
		}
	}
	
	

}
