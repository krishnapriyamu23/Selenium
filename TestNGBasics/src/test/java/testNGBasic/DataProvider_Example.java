package testNGBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider_Example {
	WebDriver driver;

	@BeforeMethod
	public void launchingSite() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		driver.get("https://www.amazon.in");
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}

//	@Test(dataProvider = "Amazon Product Data", dataProviderClass = Data_Provider.class)
//	public void verifyProductSearch(String product) {
//		System.out.println(product);
//		WebElement inputField = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
//		inputField.sendKeys(product);
//		WebElement searchBtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
//		searchBtn.click();
//
//	}
	
	@Test(dataProvider = "Facebook credentials",dataProviderClass = Data_Provider.class )
	public void verifyuserNamePassword(String emailID, String passwordvar) {
		WebElement email =driver.findElement(By.xpath("//input[@id='email']"));
//		email.sendKeys("test@123.gmail.com");
		email.sendKeys(emailID);
		WebElement password =driver.findElement(By.xpath("//input[@id='pass']"));
//		password.sendKeys("Test123");
		password.sendKeys(passwordvar);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
}
