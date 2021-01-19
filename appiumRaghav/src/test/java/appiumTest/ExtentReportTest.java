package appiumTest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class ExtentReportTest {
	ExtentHtmlReporter htmlReporter;
	// calling flush writes everything to the log file
	ExtentReports extent;
	
	@BeforeSuite
	public void reportSetup(){
		   // start reporters
		 htmlReporter = new ExtentHtmlReporter("extent.html");
    
        // create ExtentReports and attach reporter(s)
         extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
	}

	@AfterSuite
   public void reportTearDown(){
		// calling flush writes everything to the log file
        extent.flush();
	}
}
