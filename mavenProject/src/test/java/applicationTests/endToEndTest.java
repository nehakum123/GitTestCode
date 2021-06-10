package applicationTests;

import resources.Base;
import resources.DataP;
import pageObjects.*;

import org.testng.annotations.Test;




import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class endToEndTest extends Base {
	
	public WebDriver driver;


	
	@BeforeTest()
	public void initializeDriver() throws IOException{
		
		driver= driverInit();		
		
	}
	
		
	@Test(dataProviderClass= DataP.class, dataProvider="testData")
	public void homePageOpenApplication(String args[]) throws IOException {		
		
		driver.get(pro.getProperty("url"));
		//driver.get("http://blazedemo.com/");
		Assert.assertEquals(driver.getTitle().trim(), pro.getProperty("homePgTitle"));
		HomePage hp= new HomePage(driver);
		Assert.assertEquals(hp.getPgHeader().getText().trim(), pro.getProperty("homePgHeader"));		
		Assert.assertEquals(hp.getFromSelectLabel().getText().trim(), pro.getProperty("homePgFromPortLabel"));
		Assert.assertEquals(hp.getToSelectLabel().getText().trim(), pro.getProperty("homePgToPortLabel"));
		
	    hp.getFromSelectDropdown().selectByVisibleText(args[0]);
	    hp.getToSelectDropdown().selectByVisibleText(args[1]);	    
	    hp.clickFindFlights();
		
		ReservePage rp= new ReservePage(driver);
		String rPageHeader = rp.getReservePgHeader().getText();		
		Assert.assertTrue((rPageHeader.indexOf(args[0]) !=-1), "From Port is not correct in the Reserve page header!!");
		Assert.assertTrue((rPageHeader.indexOf(args[1]) !=-1), "To Port is not correct in the Reserve page header!!");
		Assert.assertTrue((rp.getReserveTableRows().size() >=0), "No flights available for the selected lane !!");
		rp.clickChooseFlightBtn();
		
		PurchasePage pp = new PurchasePage(driver);
		String pPageHeader = pp.getPurchagePgHeader().getText();
		Assert.assertTrue((pPageHeader.indexOf(pro.getProperty("purchagePgHeader")) !=-1), "Flight has not been Reserved !!");
		pp.getName().sendKeys(args[2]);
		pp.getAddress().sendKeys(args[3]);
		pp.getCity().sendKeys(args[4]);
		pp.getState().sendKeys(args[5]);
		pp.getZipcode().sendKeys(args[6]);		
		pp.getCardTypeSelect().selectByVisibleText(args[7]);
		pp.getCardNum().sendKeys(args[8]);
		pp.getCardMonth().sendKeys(args[9]);
		pp.getCardYear().sendKeys(args[10]);
		pp.getNameOnCard().sendKeys(args[11]);		
		pp.clickPurchaseFlightBtn();		
		
		ConfirmationPage cp = new ConfirmationPage(driver);		
		Assert.assertEquals(cp.getConfirmationPgHeader().getText().trim(), pro.getProperty("confirmPgHeader"));
		boolean confirmEleDisplayed = cp.getConfirmationId().isDisplayed();
		Assert.assertTrue(confirmEleDisplayed, "The Confirmation ID is not displayed!!");
		
			
	}
		

	
	@AfterTest()
	public void tearDown() {
		
		driver.close();	
		
	}
	
	

	
	
	
	

}
