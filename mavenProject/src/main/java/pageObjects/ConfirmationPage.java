package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmationPage {
	
	public WebDriver driver;
	
	By confirmationPgHeader = By.cssSelector("div.container>h1");
	By confirmationId = By.xpath("//table/tbody/tr[1]/td[2]");
	
	
	public ConfirmationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver= driver;
	}
	
	public WebElement getConfirmationPgHeader() {
		
		return driver.findElement(confirmationPgHeader);
		
	}
	
	public WebElement getConfirmationId() {
		
		return driver.findElement(confirmationId);
		
	}
	
	
	
	
	

}
