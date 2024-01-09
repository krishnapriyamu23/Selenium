package testNGBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	WebDriver driver; //to set globally 
@BeforeMethod
public void launchingAmazon() {
	WebDriverManager.chromedriver().setup(); //instead of system.setprop
	driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
}
@Test
public void verifyAmazonTitle() {
//	String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	String expectedTitle = "Krishna";
	String actualTitle = driver.getTitle();
	Assert.assertEquals(actualTitle,expectedTitle); //comparing actual result and expected result
//	Assert.assertEquals(expectedTitle,actualTitle); this will throw exceptn stating illogical statmnts
	System.out.println(actualTitle);
}
@Test
public void verifyURL() {
	System.out.println("Current URL");
}
@AfterMethod
public void closeBrowser() {
	driver.close();
}
}
