package AmazonTest.Amazon;

import java.io.IOException;


import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import objects.FirstPage;

public class AmaTest extends Base{
	
	Logger log = LogManager.getLogger(AmaTest.class.getName());
	
	WebDriver driver;
	
	
	@BeforeTest
	public void initial() throws IOException {
		
		//Base b = new Base();
		
		driver=initialize();
		
	}
	
	
	@Parameters({"URL"})
	@Test
	public void normal(String url) {
		
		driver.get(url);
		
		FirstPage fi = new FirstPage(driver);
		
		fi.act();
		
		log.info("Good");
		
		
		
		
	}
	

}
