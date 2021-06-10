package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PurchasePage {

	public WebDriver driver;
	
	
	By purchasePgHeader = By.cssSelector("div.container>h2");	
	By name = By.id("inputName");
	By address = By.id("address");
	By city = By.id("city");
	By state = By.id("state");
	By zipCode = By.id("zipCode");	
	By cardTypeSelect = By.id("cardType");
	By cardNumber = By.id("creditCardNumber");	
	By creditCardMonth = By.id("creditCardMonth");
	By creditCardYear = By.id("creditCardYear");
	By nameOnCard = By.id("nameOnCard");
	By purchaseFlightBtn = By.cssSelector("input[type='submit']");
	
	
		
	public PurchasePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}
	
	public WebElement getPurchagePgHeader() {
		
		return driver.findElement(purchasePgHeader);
				
	}
	
	public WebElement getName() {
		
		return driver.findElement(name);
				
	}
	
	public WebElement getAddress() {
			
			return driver.findElement(address);
				
	}

	public WebElement getCity() {
		
		return driver.findElement(city);
				
	}

		
	public WebElement getState() {
		
		return driver.findElement(state);
				
	}

	public WebElement getZipcode() {
		
		return driver.findElement(zipCode);
				
	}
			
	public Select getCardTypeSelect() {
		
		Select fromDropdown = new Select(driver.findElement(cardTypeSelect));			
		return fromDropdown;
		
	}
	
	public WebElement getCardNum() {
		
		return driver.findElement(cardNumber);
				
	}

	public WebElement getCardMonth() {
		
		return driver.findElement(creditCardMonth);
				
	}
	
	public WebElement getCardYear() {
		
		return driver.findElement(creditCardYear);
				
	}
	
	public WebElement getNameOnCard() {
		
		return driver.findElement(nameOnCard);
				
	}	
	
	
	public ConfirmationPage clickPurchaseFlightBtn() {
		
		driver.findElement(purchaseFlightBtn).click();
		ConfirmationPage cp = new ConfirmationPage(driver);
		return cp;	
		
	}
	
	
	
	
	

}
