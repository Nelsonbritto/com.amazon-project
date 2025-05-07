package com.utilitiessetup;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport implements ITestListener {
	 public ExtentSparkReporter sparkreporter;
	 public ExtentReports extent;
	 public ExtentTest test;
	
	public void onStart(ITestContext context) {
		sparkreporter = new ExtentSparkReporter("./test-output/extendreport/extendhtml.html");
		sparkreporter.config().setDocumentTitle("amazon automation");
		sparkreporter.config().setReportName("functional testing");
		sparkreporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkreporter);
		extent.setSystemInfo("computer name", "local host");
		extent.setSystemInfo("environment ", "QA");
		extent.setSystemInfo("tester name", "Nelson");
		extent.setSystemInfo("OS", "windows");
		extent.setSystemInfo("browser name", "chrome");
		
		   
		  System.out.println("system execution is started" + context.getName());
	  }
	
	 public void onTestStart(ITestResult result) {
		 System.out.println("test started:" + result.getName());
		    
		  }
	 
	 public  void onTestSuccess(ITestResult result) {
		 test = extent.createTest(result.getName());
		test.log(Status.PASS, "testcase passed is: "+ result.getName());
		  }
	 
	 public void onTestFailure(ITestResult result) {
		 test = extent.createTest(result.getName());
			test.log(Status.FAIL, "testcase failed is: "+ result.getName());
		   
		  }
	 public void onTestSkipped(ITestResult result) {
		 test = extent.createTest(result.getName());
			test.log(Status.SKIP, "testcase skipped is: "+ result.getName());
		  }

	  
	  
	  public void onFinish(ITestContext context) {
		  
		  System.out.println("system execution is finished" + context.getName());
		  extent.flush();
		  
		  }

}
