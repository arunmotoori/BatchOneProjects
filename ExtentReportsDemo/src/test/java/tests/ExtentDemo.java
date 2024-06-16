package tests;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentDemo {

	public static void main(String[] args) throws IOException {
		
		ExtentReports extentReport = new ExtentReports();
		String extentReportFilePath = System.getProperty("user.dir")+"\\ExtentReport\\ExtentHTMLReport.html";
		File extentReportFile = new File(extentReportFilePath);
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(extentReportFile);
		extentReport.attachReporter(sparkReporter);
		
		ExtentTest extentTest1 = extentReport.createTest("TestOne");
		extentTest1.log(Status.INFO,"Chrome Browser is launched");
		extentTest1.log(Status.INFO,"Chrome Browser maximized");
		extentTest1.log(Status.INFO,"Appliation URL got opened");
		extentTest1.log(Status.INFO,"Navigated to Login page");
		extentTest1.log(Status.INFO,"Entered valid email address");
		extentTest1.log(Status.INFO,"Entered valid password");
		extentTest1.log(Status.INFO,"Login button got clicked");
		extentTest1.pass("TestOne Passed");
		ExtentTest extentTest2 = extentReport.createTest("TestTwo");
		String htmlSampleFilePath = "C:\\QAFox\\BatchOne\\ExtentReportsDemo\\ExtentReport\\HTMLTablesDemo.html";
		File htmlSampleFile = new File(htmlSampleFilePath);
		extentTest2.addScreenCaptureFromPath(System.getProperty("user.dir")+"\\Screenshots\\feedback.png");
		extentTest2.fail("TestTwo Failed");
		ExtentTest extentTest3 = extentReport.createTest("TestThree");
		extentTest3.skip("TestThree Skipped");
		
		extentReport.flush(); 
		
		Desktop.getDesktop().browse(extentReportFile.toURI());
		Desktop.getDesktop().browse(htmlSampleFile.toURI());
	}

}
