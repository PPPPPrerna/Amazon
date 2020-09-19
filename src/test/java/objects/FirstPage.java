package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FirstPage {
	
	WebDriver driver;
	
	
	public FirstPage(WebDriver driver){
		
		this.driver=driver;
		
		
	}
	
	public void act() {
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().sendKeys("Prerne").doubleClick().build().perform();
		
		a.contextClick(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).build().perform();
	}

}
