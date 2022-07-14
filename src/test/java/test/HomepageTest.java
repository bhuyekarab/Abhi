package test;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import utility.Reports;

public class HomepageTest {
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void createReport() {
		extent = Reports.generateReports();
	}
	
	@Test
	public void loginTest() {
		test = extent.createTest("loginTest");
		System.out.println("dada");
	}

	@Test
	public void HiiTest() {
		test = extent.createTest("HiiTest");
		System.out.println("Abhi");
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
	
	@AfterTest
	public void flushReports() {
		extent.flush();
	}
	
}
