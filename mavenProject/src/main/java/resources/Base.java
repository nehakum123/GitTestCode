package resources;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base 
{
	
	public WebDriver driver;
	public Properties pro;
	
	String dName = "webdriver.chrome.driver";
	String dPath = "C:\\Users\\91988\\OneDrive\\Desktop\\Selenium_Interview\\chromedriver_win32\\chromedriver.exe";
		

		
	public WebDriver driverInit() throws IOException{	
		
		pro= new Properties();
		
		FileInputStream fin= new FileInputStream("C:\\Users\\91988\\OneDrive\\Desktop\\Selenium_Interview\\myTestNGProject\\mavenProject\\src\\main\\java\\resources\\data.properties");
		pro.load(fin);
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
				
		driver= new ChromeDriver();	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		return driver;			
		
	}
	
}

