package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	public WebDriver driver;
	
	By homePgHeader= By.tagName("h1");
	By fromPortLabel= By.cssSelector("div.container>h2");	
	By toPortLabel= By.cssSelector("div.container>form>h2");
	
	By fromPortSelectDropdown = By.name("fromPort");	
	By toPortSelectDropdown = By.name("toPort");
	By findFlights = By.cssSelector("input[type='submit']");
	
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}
	
	public WebElement getPgHeader() {		
		return driver.findElement(homePgHeader);
	}
	
	public WebElement getFromSelectLabel() {
		
		return driver.findElement(fromPortLabel);
		
	}
	
	public WebElement getToSelectLabel() {
		
		return driver.findElement(toPortLabel);
	}
	
	
	public Select getFromSelectDropdown() {
		
		Select fromDropdown = new Select(driver.findElement(fromPortSelectDropdown));			
		return fromDropdown;
		
	}
	

	public Select getToSelectDropdown() {
		
		Select toDropdown = new Select(driver.findElement(toPortSelectDropdown));		
		return toDropdown;
		
	}	
	
	
	public void clickFindFlights() {
		
		driver.findElement(findFlights).click();
		//ReservePage rp = new ReservePage(driver);
		//return rp;	
		
	}
	
	

}
