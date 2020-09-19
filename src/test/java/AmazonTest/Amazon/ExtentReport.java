package AmazonTest.Amazon;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	
	public static ExtentReports initial() {
		
		String path = System.getProperty("user.dir")+"\\reports"+"\\index.html";
		
		
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		
		reporter.config().setDocumentTitle("Reports");
		
		reporter.config().setReportName("Prerna");
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		 return extent;
		
		
		
		
		
		
		
		
	}

}
