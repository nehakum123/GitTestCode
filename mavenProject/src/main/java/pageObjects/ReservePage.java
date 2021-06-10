package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReservePage {
	
	public WebDriver driver;
		
	By reservePgHeader = By.cssSelector("div.container>h3");
	By reserveTableRow = By.xpath("//table/tbody/tr");
	By chooseFlightBtn = By.cssSelector("input[type='submit']");
	
	
	
	
	public ReservePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}

	public WebElement getReservePgHeader() {
		
		return driver.findElement(reservePgHeader);
		
	}
	
	public List<WebElement> getReserveTableRows() {
		
		return driver.findElements(reserveTableRow);
		
	}
	
	public PurchasePage clickChooseFlightBtn() {
		
		driver.findElement(chooseFlightBtn).click();
		PurchasePage pp = new PurchasePage(driver);
		return pp;	
		
	}
	
	
	

}
